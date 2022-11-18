package botPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.helpBot.baseclass.BaseClass;

public class TopicSelect extends BaseClass
{
	By clickOnArticle=By.xpath("(//span[@class='main_title'])[1]");
	
	By clickingOnChatBot=By.xpath("//a[@id='helpBotChat']");
	
	public HelpBotWindowPage articleAndChatbot() throws Exception
	{
		driver.findElement(clickOnArticle).click();
		System.out.println("clicks on "+clickOnArticle);
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,8000);");
		Thread.sleep(2000);
		driver.findElement(clickingOnChatBot).click();
		return new HelpBotWindowPage();
		
	}
}
