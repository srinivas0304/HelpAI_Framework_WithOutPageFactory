package com.helpBot.testcases;

import org.testng.annotations.Test;

import com.helpBot.baseclass.BaseClass;

import botPages.SigninPage;
import botPages.TitleVerificationPage;

public class SigninTest extends BaseClass
{
	TitleVerificationPage test;
	SigninPage signinCheck;
	
	@Test
	public void signIn() throws Exception
	{
		test=new TitleVerificationPage();
		signinCheck=test.isDisplay();
		signinCheck.signinBtn();
		signinCheck.msg();
	}
}
