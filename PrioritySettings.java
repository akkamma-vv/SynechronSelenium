package SeleniumTestNg;

import org.testng.annotations.Test;

public class PrioritySettings {

@Test(groups = {"Regression"})
public void launchbrowser() {
	System.out.println("Launching browser");
}

@Test(priority=0)
public void Login() {
	System.out.println("Loging in");
}
@Test(enabled=false)
public void Selectproduct() {
	System.out.println("Product Selected");
}


}


