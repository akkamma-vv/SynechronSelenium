package SeleniumTestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionEg {
  
	@Test
	public void autosugg() {
		
		String expected = "lambdatest";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
       driver.manage().window().maximize();
       WebElement searchbox = driver .findElement(By.xpath("//textarea[@id='APjFqb']"));
       searchbox.sendKeys("lambdatest");
       List<WebElement> autosuggestionlist = searchbox.findElements(By.xpath(".//li"));
       for (WebElement listtext:autosuggestionlist) {
    	   
    	   WebElement term = listtext.findElement(By.xpath("//span"));
    	   System.out.println(listtext.getText());
       }
       
	}
}
