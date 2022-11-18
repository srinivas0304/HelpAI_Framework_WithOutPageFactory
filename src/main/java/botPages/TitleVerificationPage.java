package botPages;

import org.openqa.selenium.By;
import com.helpBot.baseclass.BaseClass;

public class TitleVerificationPage extends BaseClass
{
	By header=By.xpath("//header[@id='gh']");
	
	public SigninPage isDisplay()
	{
		driver.findElement(header).isEnabled();
		return new SigninPage();
	}
	
	public TitleVerificationPage()
	{
		this.driver=driver;
	}
}
