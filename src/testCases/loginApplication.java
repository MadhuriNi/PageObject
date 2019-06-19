package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.SyntelligenceLoginPage;
import objectRepository.SyntelligenceLoginPageFactory;

public class loginApplication {
	
	
	@Test
	public void loginApplication()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.myatos-syntel.net/web/guest/test?p_p_id=com_liferay_login_web_portlet_LoginPortlet&p_p_lifecycle=0&_com_liferay_login_web_portlet_LoginPortlet_redirect=%2F");
		
		/*SyntelligenceLoginPage slp=new SyntelligenceLoginPage(driver);
		slp.enterUserName().sendKeys("MN33322");
		slp.enterPassword().sendKeys("syntel123$");
		slp.clickSubmit().click();*/
		
		SyntelligenceLoginPageFactory slpf=new SyntelligenceLoginPageFactory(driver);
		slpf.enterUserName().sendKeys("MN33322");
		slpf.enterPassword().sendKeys("syntel123$");
		slpf.clickSubmit().click();
		
		
		/*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		HomePage hp=new HomePage(driver);
		hp.SiteMap().click();*/
	}

}
