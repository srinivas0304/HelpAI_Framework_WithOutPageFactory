package botPages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.helpBot.baseclass.BaseClass;

public class ClickonHelpAnContact extends BaseClass
{
	By clickOnHelpAndContactBtn=By.xpath("//a[text()=' Help & Contact']");
	
	
	public SearchPage helpAndContact()
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(clickOnHelpAndContactBtn));
		driver.findElement(clickOnHelpAndContactBtn).click();
		return new SearchPage();
	}
}
