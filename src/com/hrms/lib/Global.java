package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global 
{
	// To Provide TestData & Object of Whole Application
	public WebDriver driver;
	
	//*************** Test Data***************
	
	public String url="http://183.82.103.245/nareshit/login.php";
	public String username="nareshit";
	public String password="nareshit";
	public String EFN="Aman";
	public String ELN="Kumar";
	
	//*************** Objects ***************
	
	public String txt_loginname="txtUserName";
	public String txt_password="txtPassword";
	public String btn_login="Submit";
	public String link_logout="Logout";
	public String frame_empinfo="rightMenu";
	public String btn_Add="//input[@value ='Add']";
	public String txt_EFN="txtEmpFirstName";
	public String txt_ELN="txtEmpLastName";
	public String btn_Save="btnEdit";
	
	
}
