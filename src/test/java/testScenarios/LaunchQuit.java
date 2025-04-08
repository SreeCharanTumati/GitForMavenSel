package testScenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchQuit {

	WebDriver driver;
	@Parameters(name="browser")
	@BeforeMethod
	public void launchbrowser(String brwsrname) {
		if(brwsrname.equals("Chrome")) {
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		}
		if(brwsrname.equals("Edge")) {
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		if(brwsrname.equals("Firefox")) {
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
	
	}
	
	@AfterMethod
	public void quit() {
		
		driver.quit();
	}
}
