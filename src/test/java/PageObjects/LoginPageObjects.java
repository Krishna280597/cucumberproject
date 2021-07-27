package PageObjects;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageObjects extends BaseClass {
	public LoginPageObjects() {
	PageFactory.initElements(driver, this);
	}

public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getSignup() {
	return signup;
}
public WebElement getFirstName() {
	return FirstName;
}
public WebElement getLastName() {
	return LastName;
}

public WebElement getLogin() {
	return login;
}

public WebElement getSignuplast() {
	return signuplast;
}
@FindBy(xpath="(//button)[2]")private WebElement signuplast;
@FindBy(id="email")private WebElement  username;
@FindBy(id="pass")private WebElement  password;
@FindBy(name="login")private WebElement login;
@FindBy(xpath="//a[@data-testid='open-registration-form-button']")private WebElement signup;
@FindBy(name="firstname")private WebElement  FirstName;
@FindBy(name="lastname")private WebElement  LastName;



}
