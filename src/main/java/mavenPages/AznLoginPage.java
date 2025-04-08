package mavenPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AznLoginPage {

	WebDriver driver;
	@FindBy(id="ap_email_login")
		WebElement username;
	@FindBy(id="continue-announce")
	WebElement continuebttn;
	@FindBy(name="password")
	WebElement passwrd;
	@FindBy(xpath="//span[normalize-space(text())='Sign in']")
	WebElement signinbttn;
	
	public void username_Field() {
		username.sendKeys("9963905549");
	}
	public void continue_Button(){
		continuebttn.click();
	}
	public void password_Field() {
		passwrd.sendKeys("Myamazon@009");
	}
	public void signin_Button() {
		signinbttn.click();
	}
	
	public AznLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
	
}
