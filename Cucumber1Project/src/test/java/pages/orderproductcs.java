package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class orderproductcs {
	@FindBy(how=How.ID,using="userName")
	public static 	WebElement userName;
	@FindBy(how=How.ID,using="password")
	public static 	WebElement password;
	@FindBy(how=How.NAME,using="Login")
    public static WebElement   Login;
	@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/div[1]/button/h4")
	public static    WebElement  addproduct;
	@FindBy(how=How.ID,using="categorydropid")
	public static 	WebElement categorydropid;
	@FindBy(how=How.ID,using="subcategorydropid")
	public static 	WebElement subcategorydropid ;
	@FindBy(how=How.ID,using="prodid")
   	public static 	WebElement prodid ;
	@FindBy(how=How.ID,using="priceid")
   	public static 	WebElement priceid ;
	   
	
	
	
}


