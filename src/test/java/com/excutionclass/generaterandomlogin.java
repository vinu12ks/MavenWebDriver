//package com.excutionclass;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.commons.io.FileUtils;
//import org.apache.commons.lang3.RandomStringUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import reusablecomponent.Openbrowser;
//import utilities.Driver;
//
//public class generaterandomlogin {
//	public static WebDriver driver = Driver.getDriver();
//	
//	public String generateRandomString(int length){
//	    return RandomStringUtils.randomAlphabetic(length);
//	} 
//	public String generateRandomNumber(int length){
//	    return RandomStringUtils.randomNumeric(length);
//	    
//	}  
//
//	@BeforeMethod(alwaysRun = true)
//	public void openAppln() throws IOException {
//		 Openbrowser.openBrowser(driver);
//	}
//	
//public static void takeScreenshot(String fileName) throws Exception{
//		
//		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        
//		 FileUtils.copyFile(file, new File("E:\\WorkBench\\Bookings\\Screenshots"+fileName+".png"));
//}
//
//	@Test
//    public void login() throws Exception{
//
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	
//	driver.findElement(By.partialLinkText("SIGN-ON")).click();
//
//	for (int i = 0; i < 5; i++) {
//		
//	driver.findElement(By.name("userName")).sendKeys(RandomStringUtils.randomAlphabetic(3) + RandomStringUtils.randomNumeric(5));
//	
//	driver.findElement(By.name("password")).sendKeys(RandomStringUtils.randomAlphabetic(3) + RandomStringUtils.randomNumeric(5));
//	
//	driver.findElement(By.name("login")).click();
//	
//	takeScreenshot("Login_page");
//	
//	
//}
//}
//}
