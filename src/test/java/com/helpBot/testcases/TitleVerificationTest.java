package com.helpBot.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.helpBot.baseclass.BaseClass;

import botPages.TitleVerificationPage;

public class TitleVerificationTest extends BaseClass
{
	TitleVerificationPage test;
	
	@Test
	public void title()
	{
		test=new TitleVerificationPage();
		test.isDisplay();
		String expected="Electronics, Cars, Fashion, Collectibles & More | eBay";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
		System.out.println(driver.getTitle());
	}
}
