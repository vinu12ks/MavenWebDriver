package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreport {
	  public static ExtentHtmlReporter extentHtmlReporter;
	    public static ExtentTest extentTest;
	    public static ExtentReports extentReports;

	 

	    public ExtentTest extentReport()
	    {
	        
	        Date d=new Date();
	        SimpleDateFormat file=new SimpleDateFormat("yyyy-mm-dd hh-mm-ss");
	        String fileName=file.format(d);
	        
	           extentHtmlReporter=new ExtentHtmlReporter("E:\\WorkBench\\Bookings\\Reports\\"+fileName+".html");
	           extentReports=new ExtentReports();
	           extentReports.attachReporter(extentHtmlReporter);
	           extentTest=extentReports.createTest(getClass().getName());
	           return extentTest;    
	    }
	    
	public static void extentFlush()
	{
	        extentReports.flush();
	    
	}
	
}
	
