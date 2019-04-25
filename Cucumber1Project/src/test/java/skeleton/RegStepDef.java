package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RegisterPage;

public class RegStepDef {
	
	
	WebDriver driver;
	//@Before
	public void init()
	{

		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, RegisterPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	
	
	

@Given("url of demowebshop")
public void url_of_demowebshop() {
	
	
	
	 driver.get("http://demowebshop.tricentis.com/register");
    // Write code here that turns the phrase above into concrete actions
  //  throw new cucumber.api.PendingException();
}

@When("users enters data for registration")
public void users_enters_data_for_registration() {
	
	
	
	
	
	   RegisterPage.gender.click();
	   RegisterPage.firstname.sendKeys("danuu11");
	   RegisterPage.lastname.sendKeys("totager11");
	   RegisterPage.email.sendKeys("danu1900882311@test.com");
	   RegisterPage.password.sendKeys("1996666");
	   RegisterPage.confirmpassword.sendKeys("1996666");
	   RegisterPage.registerbutton.click();
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Then("registration page successfully run")
public void registration_page_successfully_run() {
    // Write code here that turns the phrase above into concrete actions
    Assert.assertTrue(RegisterPage.success.getText().contains("Your registration completed"));
}



}
