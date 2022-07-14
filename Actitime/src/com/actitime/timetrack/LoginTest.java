package com.actitime.timetrack;

import org.testng.annotations.Test;

import com.actitime.genericlib.BaseTest;
import com.actitime.genericlib.FileLib;
import com.actitime.genericlib.WebDriverCommonLib;
import com.actitime.pages.LoginPage;
//Open the browser enter URL
public class LoginTest extends BaseTest{
	
	public void loginToApp() throws Throwable
	{
		//Login to Application
		LoginPage lp=new LoginPage();
		FileLib flib=new FileLib();
		String un = flib.readPropertyData(PROP_PATH, "username");
		String pw = flib.readPropertyData(PROP_PATH, "password");
		lp.login(un, pw);
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		
		wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH, "homeTitle"));
		
		wlib.verify(wlib.getPageTitle(),
				flib.readPropertyData(PROP_PATH, "homeTitle"),
				"Enter Time Track Page");
		
		
	}
}




