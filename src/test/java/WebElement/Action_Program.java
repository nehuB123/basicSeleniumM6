package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Program {

	public static void main(String[] args) throws Throwable {
		//driver related statement
		WebDriverManager.firefoxdriver().setup();
		//opening the ChromeBrowser
		WebDriver driver=new FirefoxDriver ();
		//Maximize the browser
		driver.manage().window().maximize();
		//entering the url
		driver.get("https://www.facebook.com/");
		//address of email text field
		WebElement kittu=driver.findElement(By.id("email"));
		kittu.sendKeys("hello");
		Thread.sleep(3000);
		kittu.clear();
		
	}

}
