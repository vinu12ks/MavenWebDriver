package reusablecomponent;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import utilities.Readconfig;

public class Openbrowser {
	/*static Properties properties=Readconfig.Readconfi();*/
	public static  void openBrowser(WebDriver driver) 
	{
		/*String path = properties.getProperty("Driver_path");
		driver.get(path);*/
		/*String url=properties.getProperty("URL");*/
		//System.out.println(url);//
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		

}
}
