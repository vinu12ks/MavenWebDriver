package uistore;

import org.openqa.selenium.By;

public class Register_Page_Locators {
	protected By click=By.xpath("//td[@class='mouseOut'][2]");
    protected By FirstName=By.xpath("//input[@maxlength='60'][1]");
    protected By LastName=By.xpath("//input[@name='lastName']");
    protected By Number=By.xpath("//input[@name='phone']");
    protected By Email=By.xpath("//input[@maxlength='64']");
    protected By Adress1=By.xpath("//input[@name='address1']");
    protected By Adress2=By.xpath("//input[@name='address2']");
    protected By City=By.xpath("//input[@name='city']");
    protected By State=By.xpath("//input[@name='state']");
    protected By PostalCode=By.xpath("//input[@name='postalCode']");
    protected By user_name=By.xpath("//input[@name='email']");
    protected By passWord=By.xpath("//input[@name='confirmPassword']");
    protected By confirm_Password=By.xpath("//input[@name='confirmPassword']");
    protected By submit_Button=By.xpath("//input[@type='image']");

}


