package com.actitime.generics;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ScreenshotPage implements ITestListener
{
	public void onTestFailure(ITestResult result)
	{
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		if(result.getStatus()==1)
		{
			Reporter.log("test is success",true);
		}
		
		else if(result.getStatus()==2)
		{
			Reporter.log("test is failed",true);
		}
		
		else if(result.getStatus()==3)
		{
			Reporter.log("test is skipped", true);
		}
		
		String methodName=result.getName();
		Date date=Calendar.getInstance().getTime();
		String today=date.toString().replaceAll(":", "_");
		
		File destFile=new File("./failedscreenshot/" +methodName +today + ".png");
		try
		{
			FileHandler.copy(srcFile, destFile);
		}
		catch (IOException e) 
		{
			
		}
	}
}