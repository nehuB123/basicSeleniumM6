package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS 
{
	public static void main(String[] args) 
	{
		//driver related statement
		WebDriverManager.firefoxdriver().setup();
		//opening the ChromeBrowser
		WebDriver driver=new FirefoxDriver ();
		//Maximize the browser
		driver.manage().window().maximize();
		//opens the browser
	   driver.get("https://www.facebook.com");
	   //fetching address using css
	   driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Hi");
	   
	}

}
