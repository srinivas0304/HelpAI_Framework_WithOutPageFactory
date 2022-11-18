package extentReport;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.helpBot.baseclass.BaseClass;

public class ExtentUtility extends BaseClass
{
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static void extentUtility()
	{
		extent=new ExtentReports();
		File path=new File("NewReport123.html");
		ExtentSparkReporter sparkReport=new ExtentSparkReporter("./SparkReports/"+path);
		extent.attachReporter(sparkReport);
		test=extent.createTest("Test");
	}
	public static void flushMethod()
	{
		extent.flush();
	}
}
