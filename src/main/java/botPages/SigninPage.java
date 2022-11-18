package botPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.helpBot.baseclass.BaseClass;

public class SigninPage extends BaseClass
{
	By clickingOnSigninBtn=By.xpath("(//div[@id='gh-top']//ul//li//span//a)[1]");
	
	By message=By.xpath("//h1[text()='Hello']");
	
	public void signinBtn() throws Exception
	{	
		WebElement ele=driver.findElement(clickingOnSigninBtn);
//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(clickingOnSigninBtn));
		Thread.sleep(3000);
		ele.click();
	}
	
	public LoginPage msg() throws Exception
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(message));
		boolean b=driver.findElement(message).isDisplayed();
		System.out.println(b);
		System.out.println("clicking on signin button "+message);
		return new LoginPage();
	}
}
