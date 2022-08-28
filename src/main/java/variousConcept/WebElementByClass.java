package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class WebElementByClass {
	static WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
		  driver.get("https://techfios.com/billing/?ng=login/after/dashboard");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
}
	@Test
	public void logIn() {
		
		//Storing WebElement
	WebElement userNameElement	=driver.findElement(By.xpath("//input[@id='username']"));
	WebElement passWordElement	=driver.findElement(By.xpath("//input[@id='password']"));
	WebElement signInButtonElement	=driver.findElement(By.xpath("//button[@name='login']"));
	//WebElement DashBoardHeaderElement	=driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));

	
	
	//Using WebElement
//	userNameElement.clear();
//	userNameElement.sendKeys("demo@techfios.com");
//	passWordElement.sendKeys("abc123");
//	signInButtonElement.click();
//	DashBoardHeaderElement
	
	//By Type
	By userNameField=By.xpath("//input[@id='username']");
	By passwordField=By.xpath("//input[@id='password']");
	By signInButtonField=By.xpath("//button[@name='login']");
	By DashBoardHeaderField=By.xpath("//h2[contains(text(),'Dashboard')]");

	//Using By Class
	driver.findElement(userNameField).sendKeys("demo@techfios.com");
	driver.findElement(passwordField).sendKeys("abc123");
	driver.findElement(signInButtonField).click();
	

	
	
	Assert.assertTrue("Dashboard Page Not Found",driver.findElement(DashBoardHeaderField).isDisplayed() );
//	boolean pageTitleDisplayStatus;
//	
//	try {
//		WebElement DashBoardHeaderElement	=driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));
//
//	     pageTitleDisplayStatus=true;
//	
//	
//	}catch(Exception e) {
//		
//		  pageTitleDisplayStatus=false;
//		e.printStackTrace();
//	}
	
	
	
//     WebDriverWait wait= new WebDriverWait(driver, 10);
//     wait.until(ExpectedConditions.visibilityOfElementLocated(DashBoardHeaderField));
//	
	
	//Assert.assertTrue("Dashboard page not found",pageTitleDisplayStatus);
	
	
	
	
	}
}