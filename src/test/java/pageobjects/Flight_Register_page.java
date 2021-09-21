package pageobjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import reusablecomponent.SendKeysandClick;
import uistore.Flight_Register_Locators;
import utilities.Readconfig;

public class Flight_Register_page extends Flight_Register_Locators {
	WebDriver driver=null;
	static Properties properties=Readconfig.Readconfi();
	public void Register_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Flight_Book(){
		 SendKeysandClick sc=new SendKeysandClick();
		WebElement webelement;
		
			
		
       //Select passenger = new Select(driver.findElement(Passenger));
		//passenger.selectByValue("2");
		

}
}