package com.actitime.tasks;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseTest;
import com.actitime.genericlib.FileLib;
import com.actitime.genericlib.WebDriverCommonLib;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.timetrack.LoginTest;
//Open the browser enter URL -> Verify Login Page

@Listeners(com.actitime.genericlib.MyListeners.class)
public class VerifyTasksTest extends BaseTest{

	@Test
	public void verifyTasks() throws Throwable
	{
		//Login to App -> Verify Home Page
	LoginTest lt=new LoginTest();
	lt.loginToApp();
		//Click on Tasks Tab -> Verify Tasks List Page
	EnterTimeTrackPage etp=new EnterTimeTrackPage();
	etp.clickTasksTab();
	Assert.fail();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	FileLib flib=new FileLib();
	wlib.verify(wlib.getPageTitle(),
			flib.readPropertyData(PROP_PATH, "tasksTitle"),
			"Task List Page");
	
	
	
	
	
	
	
	
	}
}
