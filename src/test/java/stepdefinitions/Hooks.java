package stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.Base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;



public class Hooks extends BaseClass  {
	@After
    public void scrrenshot(Scenario sc) throws IOException {
	TakesScreenshot tk = (TakesScreenshot)driver;
	File src = tk.getScreenshotAs(OutputType.FILE);
	String name = sc.getName();
	File des = new File("src\\test\\resources\\ScreenShots\\"+name+".png");
	FileUtils.copyFile(src, des);
	QuitTheBrowser();

	}

}
