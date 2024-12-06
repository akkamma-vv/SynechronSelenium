package SeleniumTestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {

	@Test(groups = {"Regression"})
	public void Checkboxhandling() throws InterruptedException {
		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement radio = driver.findElement(By.xpath("(//input[@name='radioButton'])[2]"));
		radio.click();
		if(radio.isEnabled()) {
			radio.click();
		}
		
		
	}
	}

