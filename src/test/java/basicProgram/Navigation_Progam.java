package basicProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_Progam 
{
public static void main(String[] args)throws Throwable
{
	//driver related statement
	WebDriverManager.firefoxdriver().setup();
	//opening the chromeBrowser
	WebDriver driver=new FirefoxDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//enters the URL and loads until application will get loaded 
	driver.get("https://www.facebook.com/");
	Thread.sleep(4000);
	//navigating from one URL  to another URL 
	driver.navigate().to("http://www.amazon.in/");
	//navigating to back page
	driver.navigate().back();
	Thread.sleep(4000);
	//navigating to front page
driver.navigate().forward();
Thread.sleep(4000);
driver.navigate().refresh();
Thread.sleep(4000);
driver.close();

	
}
}
