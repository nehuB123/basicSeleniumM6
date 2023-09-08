package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_Name_Link_Partial_Linktext
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
	   //fetching the address of email text field
	   driver.findElement(By.id("email")).sendKeys("neha");
	   //address of password
	   driver.findElement(By.name("pass")).sendKeys("nehupas");
	   Thread.sleep(3000);
	   //address of link using linkText()
	   driver.findElement(By.linkText("Forgotten password?")).click();
	   Thread.sleep(3000);
	   //address of link using partialLinktext()
	   //driver.findElement(By.partialLinkText("forgotten")).click(); 
	   driver.quit();
	   
}
}
