package basicProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchingBrowser 
{
public static void main(String[] args) throws Throwable
{
	//driver related statement
	WebDriverManager.firefoxdriver().setup();
	//opening the ChromeBrowser
	WebDriver driver=new FirefoxDriver ();
	//Maximize the browser
	driver.manage().window().maximize();
	//opens the browser
driver.get("https://www.facebook.com");
//get the title of the web page
System.out.println(driver.getTitle());
//printing the current url
System.out.println(driver.getCurrentUrl());
Thread.sleep(300);
driver.close();
	
}
}
