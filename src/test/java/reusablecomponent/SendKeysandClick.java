package reusablecomponent;

import org.openqa.selenium.WebElement;

public class SendKeysandClick {
	public static void eventClick(WebElement webelement) {
	webelement.click();
}
public static void eventSendKeys(WebElement webelement,String keys) {
	webelement.sendKeys(keys);

}

}
