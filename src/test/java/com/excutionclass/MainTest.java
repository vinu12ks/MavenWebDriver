package com.excutionclass;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pageobjects.Flight_Register_page;
import pageobjects.Hotels_Page;
import pageobjects.Login_Page;
import pageobjects.Logoff_page;
import pageobjects.Register_Page;
import reusablecomponent.Openbrowser;
import utilities.Driver;
import org.apache.log4j.PropertyConfigurator;

public class MainTest {
	public static WebDriver driver = Driver.getDriver();
	ExtentHtmlReporter reporter=new ExtentHtmlReporter("./test-output/extentreports.html");
	ExtentReports extent=new ExtentReports();
	Logger log = Logger.getLogger(MainTest.class);
	
	
public static void takeScreenshot(String fileName) throws Exception{
		
    File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(file, new File("E:\\WorkBench\\Bookings\\Screenshots\\"+fileName+".png"));
}

	 @BeforeMethod(alwaysRun = true)
	public void openAppln() throws IOException {
		 Openbrowser.openBrowser(driver);
	
		 extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("browser opening");
		logger.log(Status.INFO, "opening the browser");
		logger.log(Status.PASS, "successfully opened");
	
	   	}
	  
	  @Test(alwaysRun = true)
   public void Registration() throws Exception  {
		Register_Page reg = new Register_Page(driver);
		reg.Registration();
		log.info("user register is done succesfuly");
		extent.attachReporter(reporter);
		ExtentTest logger1=extent.createTest("user registering to newtours");
		logger1.log(Status.INFO, "register ");
		logger1.log(Status.PASS, "successfully registered");
		extent.flush();
		takeScreenshot("Registration page");
		
	     }
     @Test(alwaysRun=true) 
	 public void booking_Flight() throws Exception { 
		Flight_Register_page fp = new Flight_Register_page();
	       fp.Flight_Book();
	       takeScreenshot("Flight page");
	       log.info("user not able to reach flight page");
	       extent.attachReporter(reporter);
			ExtentTest logger1=extent.createTest("user click on flight page");
			logger1.log(Status.INFO, "flight");
			logger1.log(Status.PASS, "Go to flight page");
	        extent.flush();
		  Thread.sleep(5000);
		 
	  }
	 
     @Test(alwaysRun=true) public void booking_Hotel() throws Exception
		 {
		  Hotels_Page hp=new Hotels_Page();
		  hp.Hotel_Booking();
		 
   String title = driver.getTitle(); System.out.println(title); 
    Thread.sleep(5000);
    takeScreenshot("Hotel page true");
     Assert.assertEquals(title,"http://newtours.demoaut.com/mercuryunderconst.php");
     System.out.println("true");
		 log.info("user not able to reach hotel page");
		 extent.attachReporter(reporter);
			ExtentTest logger1=extent.createTest("user click on hotel page");
			logger1.log(Status.INFO, "hotelpage");
			logger1.log(Status.PASS, "Go to hotel page");
		    extent.flush();
			takeScreenshot("Hotel page false");
		 }
		 
     
     @Test(alwaysRun = true)
public void logoff() throws Exception {
    	 
	Logoff_page lp = new Logoff_page(driver);
	lp.user_Logoff();
	log.info("logff is done succefuly");
	extent.attachReporter(reporter);
	ExtentTest logger1=extent.createTest("user click on signoff page");
	logger1.log(Status.INFO, "logout");
	logger1.log(Status.PASS, "Go to home page");
	logger1.pass("passed successfully",MediaEntityBuilder.createScreenCaptureFromPath("E:\\WorkBench\\Bookings\\Screenshots").build() );
	extent.flush();	
	takeScreenshot("Logoff page");
}
	  
		
}
