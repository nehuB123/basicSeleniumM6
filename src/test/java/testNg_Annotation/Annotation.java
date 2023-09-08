package testNg_Annotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation 
{
 WebDriver driver;
 
 @BeforeMethod
 public void openingbrowser()
 {
	//driver related statement
			WebDriverManager.edgedriver().setup();
			//opening the edgeBrowser
			WebDriver driver=new EdgeDriver ();
			//Maximize the browser
			driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 }
 @Test(priority=1,invocationCount=2)
 public void fbBrowser()
 {
	//entering the url
	    driver.get("https://www.facebook.com");
 }
 
}
