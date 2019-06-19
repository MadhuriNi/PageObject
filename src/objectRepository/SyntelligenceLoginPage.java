package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SyntelligenceLoginPage {

	WebDriver driver;

	public SyntelligenceLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By username = By.xpath("//input[@title='Login']");
	By password = By.cssSelector("input[type='password']");
	By signIn = By.cssSelector("button[id*='LoginPortlet_btn1']");

	public WebElement enterUserName() {
		return driver.findElement(username);
	}

	public WebElement enterPassword() {
		return driver.findElement(password);
	}

	public WebElement clickSubmit() {
		return driver.findElement(signIn);
	}
}
