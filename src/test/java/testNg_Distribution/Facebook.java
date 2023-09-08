package testNg_Distribution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	@Test
	public void fb() throws Throwable {
		
	
	//driver related statement
			WebDriverManager.edgedriver().setup();
			//opening the ChromeBrowser
			WebDriver driver=new EdgeDriver ();
			//Maximize the browser
			driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//opens the browser
		    driver.get("https://www.facebook.com");
		    Thread.sleep(2000);
		    driver.close();
	}
}
