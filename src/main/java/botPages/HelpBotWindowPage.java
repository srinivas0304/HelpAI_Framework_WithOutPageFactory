package botPages;

import org.openqa.selenium.By;
import com.helpBot.baseclass.BaseClass;

public class HelpBotWindowPage extends BaseClass
{
	By feedBack=By.xpath("(//div[@id='ocs_help_bot']//div[3]//button[1])[1]");
	
	By textArea=By.xpath("//textarea[@name='ohb_gc_15_widget_comments']");
	
	By sendFeedback=By.xpath("(//button[@class='ohb-gc-btn'])[1]");
	
	public void clickingOnFeedback()
	{
		driver.findElement(feedBack).click();
	}
	
	public void text()
	{
		driver.findElement(textArea).sendKeys("hi");
	}
	public void sendFeed() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(sendFeedback).click();
	}
}
