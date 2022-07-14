package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.genericlib.BaseTest;

public class LoginPage {

	@FindBy(id = "username") private WebElement untb;
	@FindBy(name = "pwd") private WebElement pwtb;
	@FindBy(xpath = "//div[text()='Login ']") private 
	WebElement loginBtn;
	
	public LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getUntb() {
		return untb;
	}

	public WebElement getPwtb() {
		return pwtb;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void login(String un, String pw)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pw);
		loginBtn.click();
		
	}
	
	
	
}















