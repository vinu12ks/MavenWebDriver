package uistore;

import org.openqa.selenium.By;


public class Login_page_Locator {
	
protected By login_button=By.partialLinkText("SIGN-ON");
	//protected By login_button = By.xpath("//a[@hre='mercurysignon.php']");                   
	protected By user_name=By.xpath("//input[@name='userName']");
	protected By passWord=By.xpath("//input[@name='password']");
	protected By submit=By.xpath("//input[@name='login']");
    
}
