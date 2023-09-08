package testNg_Distribution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	
	@Parameters(("browsername"))
	
   @Test
 public void crossbrwsr(String browser) throws Throwable 
 {
	 WebDriver driver;
	 if (browser.equals("edge"))
	 {
		 WebDriverManager.edgedriver().setup();
			//opening the edgeBrowser
			 driver=new EdgeDriver ();
	 }
	 else
	 {
		 WebDriverManager.firefoxdriver().setup();
			//opening the firefoxBrowser
			 driver=new FirefoxDriver ();
	 }
	 
	//Maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//entering theURL
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		driver.close();
 }
}
