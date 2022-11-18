package botPages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.helpBot.baseclass.BaseClass;

public class SearchPage extends BaseClass
{
	By searchIndex=By.xpath("//input[@id='search_input_element']");
	
	public void clickOnIt()
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(searchIndex));
		driver.findElement(searchIndex).click();
		
	}
	
	public TopicSelect typeTopic(String topic)
	{
		driver.findElement(searchIndex).sendKeys(topic);
		return new TopicSelect();
	}
}
