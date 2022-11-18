package botPages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.helpBot.baseclass.BaseClass;

public class LoginPage extends BaseClass
{
	By username=By.xpath("//input[@id='userid']");
	
	By continu=By.xpath("//button[@id='signin-continue-btn']");
	
	By password=By.xpath("//input[@id='pass']");
	
	By welcomeMsg=By.xpath("//h1[text()='Welcome']");
	
	By signinBtn=By.xpath("//button[@id='sgnBt']");
	
	By mayBeLater=By.xpath("//button[@id='webauthn-maybe-later-link']");
	
	public void typeUsername(String user)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(username));
		driver.findElement(username).sendKeys(user);
	}
	
	public void clickOnContinue() throws Exception
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(continu));
		//Thread.sleep(2000);
		driver.findElement(continu).click();
	}
	
	public void welcomeMessage()
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(welcomeMsg));
		System.out.println("welcome msg: "+welcomeMsg);
	}
	public void typePassword(String pass)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(password));
		driver.findElement(password).sendKeys(pass);
	}
	public ClickonHelpAnContact clickOnSignBtn() throws Exception
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(signinBtn));
		driver.findElement(signinBtn).click();
		driver.getCurrentUrl();
		driver.navigate().refresh();
		return new ClickonHelpAnContact();
	}
	
//	public ClickonHelpAnContact clickOnMayBeLater()
//	{
//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(mayBeLater));
//		driver.findElement(mayBeLater).click();
//		return new ClickonHelpAnContact();
//	}
}
