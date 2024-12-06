package SeleniumTestNg;

import org.testng.annotations.Test;

public class DependsOnMethod {
  
	@Test
	public void login() {
		System.out.println("Login");
	}
	@Test(dependsOnMethods= {"login"})
	public void addtocart() {
		System.out.println("add to cart");

}
}
