package generic_Libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class WebDiverUtilities
{
	//generic method for right click
		public void doubleClick(WebDriver driver,WebElement ele)
		{
			Actions a=new Actions(driver);
			a.doubleClick(ele).perform();
		}
		
		//generic method for Double click
	public void rightClick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	//generic method for mouse over
		public void mouseOvering(WebDriver driver,WebElement ele)
		{
			Actions a=new Actions(driver);
			a.moveToElement(ele).perform();
		}
		
//generic method for mouse over
	public void dragAnddrop(WebDriver driver,WebElement ele1,WebElement ele2)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();
	}
	
//generic method for drop down
	public void dropDown(WebElement ele,String value)
	{
		Select s=new Select (ele);
		s.selectByVisibleText(value);
	}
	
	
//generic method for handle a frame
	public void frame(WebDriver driver,String ele)
	{
		driver.switchTo().frame(ele);
	}

//generic method for shift control back to normal web page
	public void frame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
//generic method for implicit wait
	public void implicitWaitMethod(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
//generic method for frames
	public void alterPopUpAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
//generic method for frames	
	public void alterPopUpDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();	
	}
	
//generic method for parent window
	public void parentWindow(WebDriver driver)
	{
		driver.getWindowHandle();
	}
	
	//generic method for child window
	public void childtWindow(WebDriver driver)
	{
		driver.getWindowHandles();
	}
}
