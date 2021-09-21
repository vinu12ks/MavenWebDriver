package pageobjects;

import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusablecomponent.SendKeysandClick;
import uistore.Login_page_Locator;
import utilities.Readconfig;

public class Login_Page extends Login_page_Locator {

	WebDriver driver=null;
	static Properties properties=Readconfig.Readconfi();
	public Login_Page(WebDriver driver) {
		this.driver=driver;
		
	}
	public void user_Login() {
		SendKeysandClick se=new SendKeysandClick();
	WebElement webelement;
	
       String username=properties.getProperty("user_name");
	    String password=properties.getProperty("password");
	
	    webelement=driver.findElement(login_button);
		 se.eventClick(webelement);
		 
	    webelement=driver.findElement(user_name);
		se.eventSendKeys(webelement, username);
		
	    webelement=driver.findElement(passWord);
		se.eventSendKeys(webelement, password);
		
		webelement=driver.findElement(submit);
		se.eventClick(webelement);
		
		String actual=webelement.getText();
		String expected="SUBMIT";
		
//		if(expected.equals(actual))
//		{
//			System.out.println("****Login Successfull******");
//		}
//		else
//		{
//			System.out.println("***Something went wrong*****");
//		}

	}
}

	


