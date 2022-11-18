package com.helpBot.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
/*import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;*/
import extentReport.ExtentUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public static WebDriver driver;
	public static Properties prop;
//	public static ExtentReports extent;
//	public static ExtentTest test;
//	public static ExtentSparkReporter sparkReport;
	
	@BeforeTest
	public void loadConfig() throws Exception
	{
		try
		{
			prop=new Properties();
			FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\config.properties");
			prop.load(fs);
		}
		catch(FileNotFoundException a)
		{
			a.printStackTrace();
		}
		catch(IOException b)
		{
			b.printStackTrace();
		}
	}
	
	@BeforeMethod
	public void load()
	{
		launchBrowser();
		
		//************************Extent Report*****************//
//		String testMethodName=method.getName();
//		String des=method.getAnnotation(Test.class).testName();
//		extent=new ExtentReports();
//		File path=new File("Ebay_NewReports.html");
//		sparkReport=new ExtentSparkReporter("./SparkReports/Ebay_NewReports.html");
//		extent.attachReporter(sparkReport);
//		test=extent.createTest("Test1");
//		test=extent.createTest(des);
//		test.info("This is info message");
		
		ExtentUtility.extentUtility();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		ExtentUtility.flushMethod();
	}
	
//	@Parameters("browser")
	public void launchBrowser()
	{
		String browserName=prop.getProperty("browser");
		if(browserName.contains("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(browserName.contains("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().deleteAllCookies();
		}
		else if(browserName.contains("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
