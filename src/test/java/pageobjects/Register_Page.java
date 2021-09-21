package pageobjects;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusablecomponent.SendKeysandClick;
import uistore.Register_Page_Locators;
import utilities.Readconfig;

public class Register_Page extends Register_Page_Locators{
	Logger log = Logger.getLogger(Register_Page.class);
	
	WebDriver driver=null;
	static Properties properties=Readconfig.Readconfi();
	
	
	public Register_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Registration() {
		 SendKeysandClick sc=new SendKeysandClick();
		WebElement webelement;
		
	    String firstname=properties.getProperty("FirstName");
		String lastname=properties.getProperty("LastName");
		String number=properties.getProperty("Number");
	    String mail=properties.getProperty("Email");
		String adress1=properties.getProperty("Adress1");
		String adress2=properties.getProperty("Adress2");
		String city=properties.getProperty("City");
		String state=properties.getProperty("State");
		String postalcode=properties.getProperty("PostalCode");
		String username=properties.getProperty("user_name");
	    String password=properties.getProperty("password");
		String confirm_password=properties.getProperty("confirm_password");
	
	
	   webelement=driver.findElement(click);
		 sc.eventClick(webelement);
		 log.info("click on register button");
		 webelement=driver.findElement(FirstName);
		sc.eventSendKeys(webelement, firstname);
		webelement=driver.findElement(LastName);
		sc.eventSendKeys(webelement, lastname);
	    webelement=driver.findElement(Number);
		sc.eventSendKeys(webelement,number);
		System.out.println(number);
		webelement=driver.findElement(Email);
		sc.eventSendKeys(webelement, mail);
		webelement=driver.findElement(Adress1);
		sc.eventSendKeys(webelement, adress1);
		webelement=driver.findElement(Adress2);
		sc.eventSendKeys(webelement, adress2);
		webelement=driver.findElement(City);
		sc.eventSendKeys(webelement, city);
		webelement=driver.findElement(State);
		sc.eventSendKeys(webelement, state);
		webelement=driver.findElement(PostalCode);
		sc.eventSendKeys(webelement, postalcode);
		webelement=driver.findElement(user_name);
		sc.eventSendKeys(webelement, username);
		log.info("giving username");
		webelement=driver.findElement(passWord);
		sc.eventSendKeys(webelement, password);
		log.info("giving password");
		webelement=driver.findElement(confirm_Password);
		sc.eventSendKeys(webelement, confirm_password);
		log.info("giving confirm password");
		
		webelement=driver.findElement(submit_Button);
		sc.eventClick(webelement);
		log.info("click on submit button");
		
		
		
	}

}
