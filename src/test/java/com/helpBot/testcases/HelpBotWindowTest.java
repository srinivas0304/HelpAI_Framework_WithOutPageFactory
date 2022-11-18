package com.helpBot.testcases;

import org.testng.annotations.Test;
import com.helpBot.baseclass.BaseClass;
import botPages.ClickonHelpAnContact;
import botPages.HelpBotWindowPage;
import botPages.LoginPage;
import botPages.SearchPage;
import botPages.SigninPage;
import botPages.TitleVerificationPage;
import botPages.TopicSelect;

public class HelpBotWindowTest extends BaseClass
{
	TitleVerificationPage test;
	SigninPage signinCheck;
	LoginPage loginPage;
	ClickonHelpAnContact hc;
	SearchPage searchpage;
	TopicSelect topicSelect;
	HelpBotWindowPage helpBotWindowPage;
	
	@Test
	public void feedBackTest() throws Exception
	{
		test=new TitleVerificationPage();
		signinCheck=test.isDisplay();
		signinCheck.signinBtn();
		loginPage=signinCheck.msg();
		loginPage.typeUsername(prop.getProperty("username"));
		loginPage.clickOnContinue();
		loginPage.welcomeMessage();
		loginPage.typePassword(prop.getProperty("password"));
		hc=loginPage.clickOnSignBtn();
		//hc=loginPage.clickOnMayBeLater();
		searchpage=hc.helpAndContact();
		searchpage.clickOnIt();
		topicSelect=searchpage.typeTopic(prop.getProperty("topicId"));
		helpBotWindowPage=topicSelect.articleAndChatbot();
		helpBotWindowPage.clickingOnFeedback();
		helpBotWindowPage.text();
		helpBotWindowPage.sendFeed();
	}
}
