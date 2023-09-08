package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicit_Explicit_Wait {

	public static void main(String[] args) {
		//driver related statement
				WebDriverManager.firefoxdriver().setup();
				//opening the firefoxBrowser
				WebDriver driver=new FirefoxDriver ();
				//Maximize the browser
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//explicit wait
				//1st create object
				WebDriverWait wait=new WebDriverWait(driver,10);
				 driver.get("https://www.facebook.com");
				 //2end store in any object
				 WebElement kittu=driver.findElement(By.id("email"));
				 //using Explicit wait
				 wait.until(ExpectedConditions.visibilityOf(kittu));
				 kittu.sendKeys("hi");
				 WebElement click=driver.findElement(By.linkText("Forgotton password?"));
				 wait.until(ExpectedConditions.elementToBeClickable(click));
				 click.click();

	}

}
