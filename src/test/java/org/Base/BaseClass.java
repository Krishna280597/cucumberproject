package org.Base;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class BaseClass {
	public static final String AUTOMATE_USERNAME = "priyakrish_65kKWM";
	public static final String AUTOMATE_ACCESS_KEY = "6PSEsWy1zU81qRApzPzr";
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY
			+ "@hub-cloud.browserstack.com/wd/hub";
	public static WebDriver driver;

	public void BrowserstackBrowser() throws MalformedURLException  {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "XP");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "45.0");
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("browserstack.selenium_version", "3.14.0");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		co.addArguments("--disable-infobars");
		caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
		caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
		driver = new RemoteWebDriver(new URL(URL), caps);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void BrowserLaunch(String value) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		if (value == "Chrome") {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} else if (value == "Firefox") {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} else {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}

	public void LaunchUrl(String url) {
		driver.get(url);

	}

	public void FillTextBox(WebElement w, String str) {
		w.sendKeys(str);

	}

	public void ButtonClick(WebElement w) {

		w.click();
	}

	public void SelectClass(WebElement w, String method, String txt, int ind) {
		Select s = new Select(w);
		if (method == "Text") {
			s.selectByVisibleText(txt);
		} else if (method == "Value") {
			s.selectByValue(txt);
		} else {
			s.selectByIndex(ind);
		}

	}

	public void PrintValue(WebElement w) {
		String order = w.getAttribute("value");
		System.out.println("Order Id is" + order);

	}

	public void QuitTheBrowser() {
		driver.quit();

	}

	public void GetTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public String GetUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}

	public void MyActions(WebElement ele1) {
		Actions a = new Actions(driver);
		a.moveToElement(ele1).perform();
	}

	public void jsexec(WebElement ele, String value, String keyname) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (value == "click") {
			js.executeScript("arguments[0].click", ele);
		} else if (value == "keys") {
			js.executeScript("arguments[0].setAttribute('value',keyname);", ele);
		}

	}

	public void KeyAction(String k) throws AWTException {
		Robot r = new Robot();
		if (k == "enter") {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} else if (k == "esc") {
			r.keyPress(KeyEvent.VK_ESCAPE);
			r.keyRelease(KeyEvent.VK_ESCAPE);

		}

	}

	public void ForWaiting(WebElement ele1) {
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.elementToBeClickable(ele1));

	}

}
