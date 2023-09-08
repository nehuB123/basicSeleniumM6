package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// Print all the Link WebElements in the console

public class Print_WebEement_Link 
{
public static void main(String[] args)
{
	//driver related statement
			WebDriverManager.firefoxdriver().setup();
			//opening the FirefoxBrowser
			WebDriver driver=new FirefoxDriver ();
			//Maximize the browser
			driver.manage().window().maximize();
			//opens the browser
		   driver.get("https://www.facebook.com");
		   List<WebElement>allLinks=driver.findElements(By.tagName("a"));
		   for (WebElement b:allLinks)
		   {
			   System.out.println(b.getText());
		   }
}
}
