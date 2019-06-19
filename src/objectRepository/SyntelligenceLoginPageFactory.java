package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SyntelligenceLoginPageFactory {

	WebDriver driver;

	public SyntelligenceLoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	/*By username = By.xpath("//input[@title='Login']");
	By password = By.cssSelector("input[type='password']");
	By signIn = By.cssSelector("button[id*='LoginPortlet_btn1']");*/
	
	
	@FindBy(xpath="//input[@title='Login']")
	WebElement username;
	
	@FindBy(css="input[type='password']")
	WebElement password;
	
	@FindBy(css="button[id*='LoginPortlet_btn1']")
	WebElement signIn;

	public WebElement enterUserName() {
		return username;
	}

	public WebElement enterPassword() {
		return password;
	}

	public WebElement clickSubmit() {
		return signIn;
	}
}
