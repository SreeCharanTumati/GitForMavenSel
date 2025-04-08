package mavenPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath="//span[@class=\"nav-line-2 \"]")
		WebElement accnlist;
	@FindBy(xpath="//span[.=\"Sign in\"]")
	WebElement signIn;
	@FindBy(xpath="//input[@placeholder=\"Search Amazon.in\"]")
	WebElement searchfld;
	@FindBy(xpath="//span[@class=\"nav-cart-icon nav-sprite\"]")
	WebElement cartIcon;
	
	public void hoveroveracclist(WebDriver driver) {
		Actions a1=new Actions(driver);
		a1.moveToElement(accnlist).perform();
	}
	public void sign_Click(){
		signIn.click();
	}
	public void search_Prod() {
		searchfld.sendKeys("Shoes"+Keys.ENTER);
	}
	public void cart_Icon_Click() {
		cartIcon.click();
	}
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
}
