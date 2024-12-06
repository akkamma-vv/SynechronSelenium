package SeleniumTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationEg {
	@Test
	public void testcase1() { 
		System.out.println("Executing testcase1");
	}

	@Test
	public void testcase2() {
		System.out.println("Executing testcase2");
}
    @Test
	public void testcase3() {
		System.out.println("Executing testcase3");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Launching the browser");
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing the browser");
}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("DB connection opening");
		
	}
	@AfterClass
	public void afterClass() {
		System.out.println("DB connection closing");
}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Opening the firefox");
		
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Clossing the firefox");
}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("DD connection opening");
		
	}
	@AfterTest
	public void afterTest() {
		System.out.println("DD connection closing");
}
}

