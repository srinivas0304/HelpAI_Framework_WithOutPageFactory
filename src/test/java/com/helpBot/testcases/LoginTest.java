package com.helpBot.testcases;

import org.testng.annotations.Test;

import com.helpBot.baseclass.BaseClass;

import botPages.LoginPage;
import botPages.SigninPage;
import botPages.TitleVerificationPage;

public class LoginTest extends BaseClass
{
	TitleVerificationPage test;
	SigninPage signinCheck;
	LoginPage loginPage;
	
	@Test
	public void login() throws Exception
	{
		test=new TitleVerificationPage();
		signinCheck=test.isDisplay();
		signinCheck.signinBtn();
		loginPage=signinCheck.msg();
		loginPage.typeUsername(prop.getProperty("username"));
		loginPage.clickOnContinue();
		loginPage.welcomeMessage();
		loginPage.typePassword(prop.getProperty("password"));
		loginPage.clickOnSignBtn();
		//loginPage.clickOnMayBeLater();
	}
}
