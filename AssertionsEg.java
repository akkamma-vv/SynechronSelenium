package SeleniumTestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(ListnerEg.class)
public class AssertionsEg {

	public void softasserion() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		String expectedtitle = "orang";
		String actualtitle = driver.getTitle();
		
		//soft assertion
		//SoftAssert soft = new SoftAssert();
		//soft.assertEquals(actualtitle, expectedtitle);
		
		//hard assertion
		
		Assert.assertEquals(actualtitle, expectedtitle);
		
		WebElement id = driver.findElement(By.id("Username"));
		id.sendKeys("akku");
		
		//name locator
		WebElement password = driver.findElement(By.name("Password"));
		password.sendKeys("admin");
		
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		
		
		WebElement logo = driver.findElement(By.className("custom-logo-link"));
		if(logo.isDisplayed()) {
			System.out.println("Home page is dis[layed");
		}
		else {
			System.out.println("Home page is dis[layed");
		}
			
		
	}
}
