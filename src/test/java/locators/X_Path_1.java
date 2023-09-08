package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_Path_1 
{

	public static void main(String[] args) throws Throwable 
	{
		//chrome driver
		WebDriverManager.firefoxdriver().setup();
		//opening the firefoxBrowser
		WebDriver driver=new FirefoxDriver ();	
		//Maximize the browser
		driver.manage().window().maximize();
		//entering the URL
	   driver.get("https://www.facebook.com/");
	   //address of email text field using x path attribute
	   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("HI");
	   	//address of password text field using x path contains attribute
	   driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Hello");
	   Thread.sleep(4000);
	   //address of create page by x path text
	   driver.findElement(By.xpath("//a[text()='Create a Page']")).click();

	}

}