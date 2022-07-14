package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.genericlib.BaseTest;

public class EnterTimeTrackPage {

	@FindBy(xpath = "//div[text()='Tasks']") private WebElement tasksTab;
	
	
	public EnterTimeTrackPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}


	public WebElement getTasksTab() {
		return tasksTab;
	}
	
	public void clickTasksTab()
	{
		tasksTab.click();
	}
	
	
	
	
	
	
	
	
	
}
