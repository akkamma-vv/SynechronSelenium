package SeleniumTestNg;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
public class ParametersEg {

	@Test
	@Parameters("browser")
	public void launchbrowser(String browser) {
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}else if (browser.equals("edge")){
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bing.com/");
	}
}
}

