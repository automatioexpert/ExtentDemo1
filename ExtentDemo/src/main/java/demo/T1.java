package demo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class T1 {

	public static void main(String[] args) {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("ThankGod/Spark.html");
		extent.attachReporter(spark);
		extent.createTest("MyFirstTest").log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
		extent.flush();
		System.out.println("Test Passed..Thank God!!!");
		
		extent.createTest("MyHomePageTest").log(Status.PASS, "This is a HomePage event for MyHomePageTest, and it passed!");
		extent.flush();
		System.out.println("Test Passed..Thank God Again for Billion times!!!");
		
		
	}
}
