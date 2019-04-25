package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class orderproductcs {
	
	WebDriver driver;
	@Before
	public void before() {

		driver=DriverUtility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	
	
	
	


@Given("url of TestMeApp")
public void url_of_TestMeApp() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();

driver.get("http://10.232.237.143:443/TestMeApp/login.htm");

}

@When("user enters  userName and password")
public void user_enters_userName_and_password() {
	
	driver.findElement(By.id("userName")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("password456");
	driver.findElement(By.name("Login")).click();
	
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException()
}


@When("add a new product")
public void add_a_new_product() {
	
	driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button/h4")).click();
	
	
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Then("loginpage is displayed")
public void loginpage_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

}
