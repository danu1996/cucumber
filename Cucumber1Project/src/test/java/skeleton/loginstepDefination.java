package skeleton;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class loginstepDefination {
	WebDriver driver;
//	@Before
	public void before() {

		driver=DriverUtility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	//@After
	public void after()
	{
		driver.close();
	}


	@Given("The Url of TestMe App")
	public void the_Url_of_TestMe_App() {

		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");

	}

	@When("Uesr Enters {word} as Username")
	public void uesr_Enters_as_Username(String string) {

		driver.findElement(By.id("userName")).sendKeys(string);


	}

	@When("Uesr Enters {word} as Password")
	public void uesr_Enters_as_Password(String string) {


		driver.findElement(By.id("password")).sendKeys(string);
            
	}

	@Then("User is in (Home|Admin Home)")
	public void user_is_in_Home_Page() {
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		Assert.assertTrue(driver.getTitle().contains("Home"));

	}
	@When("User Enters invalid date")
	public void user_Enters_invalid_date(io.cucumber.datatable.DataTable dataTable) {
		
	//	List<List<String>> list=dataTable.asLists();
	
		    
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	 //   throw new cucumber.api.PendingException();
		
	//*/System.out.println("******************");
	List<List<String>> list=dataTable.asLists();
	
	for(List<String> list2 : list)
	{
	
		 for(String s : list2)
		 {
			 System.out.print(s+"/t");
		 }
		 System.out.println();
	
	}
	
	}

	@Then("User is in loginpage")
	public void user_is_in_loginpage(List<String> s) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		 for(String string:s)
			 System.out.println(string);
			 
		
		
	}






}
