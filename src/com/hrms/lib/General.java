package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global 
{
	public void openApplication()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Aman_Selenium\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		Reporter.log("Application Opened");
		Log.info("Application Opened");
				
	}
	public void closeApplication()
	{
		driver.close();
		System.out.println("Application Closed");
		Reporter.log("Application Close");
		Log.info("Application Closed");
	}
	public void login()
	{
		driver.findElement(By.name(txt_loginname)).sendKeys(username);
		driver.findElement(By.name(txt_password)).sendKeys(password);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Completed");
		Reporter.log("Login Completed");
		Log.info("Login Completed");
				
	}
	public void logout()
	{
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout Completed");
		Reporter.log("Logout Completed");
		Log.info("Logout Completed");
	}
	public void enterFrame()
	{
		driver.switchTo().frame(frame_empinfo);
		System.out.println("Enter into frame");
		Reporter.log("Enter into frame");
		Log.info("Enter into frame");
	}
	public void exitFrame()
	{
		driver.switchTo().defaultContent();
		System.out.println("Exit the Frame");
		Reporter.log("Exit the Frame" );
		Log.info("Exit the Frame");
		
	}
	public void addNewEmp()
	{
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_EFN)).sendKeys(EFN);
		driver.findElement(By.name(txt_ELN)).sendKeys(ELN);
		driver.findElement(By.id(btn_Save)).click();
		System.out.println("New Emp Added");
		Reporter.log("New Emp Added");
		Log.info("New Emp Added");
		
	}
}













