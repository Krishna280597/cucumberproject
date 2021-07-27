package stepdefinitions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;

import org.Base.BaseClass;
import PageObjects.LoginPageObjects;
import io.cucumber.java.en.*;

public class LoginFunction extends BaseClass {
	LoginPageObjects l;

	@Given("The user should be in Facebook page")
	public void the_user_should_be_in_Facebook_page() throws MalformedURLException, AWTException {
		BrowserstackBrowser();
//		BrowserLaunch("Chrome");

		LaunchUrl("https://www.facebook.com/");
		
		
		

	}

	@When("The user Enter the username and password {string}{string}")
	public void the_user_Enter_the_username_and_password(String user, String pass) {
		l=new LoginPageObjects();
		FillTextBox(l.getUsername(), user);

		FillTextBox(l.getPassword(), pass);
		ButtonClick(l.getLogin());

	}

	@Then("The user gets the Invalid message")
	public void the_user_gets_the_Invalid_message() {
		
		String url = GetUrl();
		System.out.println("url");
		System.out.println("login verified");
		

	}

	@When("The user Click the SignUp button")
	public void the_user_Click_the_SignUp_button() {
		l=new LoginPageObjects();
		ButtonClick(l.getSignup());

	}

	@When("The user Enter the firstname and lastname {string} {string}")
	public void the_user_Enter_the_firstname_and_lastname(String Fname, String Lname) {
		
		FillTextBox(l.getFirstName(), Fname);
		FillTextBox(l.getLastName(), Lname);
		ForWaiting(l.getSignuplast());
		ButtonClick(l.getSignuplast());
	}

	@Then("The user verified the signup page")
	public void the_user_verified_the_signup_page() {
		System.out.println("Registration verified");
		

	}

}
