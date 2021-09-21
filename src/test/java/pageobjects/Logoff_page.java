package pageobjects;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusablecomponent.SendKeysandClick;
import uistore.Login_off_Locator;
import utilities.Readconfig;

public class Logoff_page extends Login_off_Locator {
	
	WebDriver driver=null;
	
	public Logoff_page(WebDriver driver) {
		this.driver=driver;
	}
	public void user_Logoff() {
		SendKeysandClick se=new SendKeysandClick();
	WebElement webelement;

}
}
