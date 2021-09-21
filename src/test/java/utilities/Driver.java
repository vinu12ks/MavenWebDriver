package utilities;


import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Driver {/*
	public static WebDriver driver=null;*/
	static Logger log = Logger.getLogger(Driver.class);
	  public static Actions actions=null;
	  static Properties properties=Readconfig.Readconfi();
	  public static WebDriver getDriver() {
		  System.setProperty("webdriver.chrome.driver","E:\\WorkBench\\Bookings\\Drivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  log.info("Launching is done successfuly");
		  /*String driver_path=properties.getProperty("Driver_path");*/
		  /*System.setProperty("webdriver.chrome.driver","E:\\WorkBench\\Bookings\\Drivers\\chromedriver.exe");*/
		  
		  return driver;
		    }
	  
	/* public static Actions getActions() {
		  actions=new Actions(driver);
		  return actions;
}
	 public static Select getselect(String findele)
	 {
		 Select card = new Select(driver.findElement(By.name(findele)));
		   return card;
	 }*/
}
