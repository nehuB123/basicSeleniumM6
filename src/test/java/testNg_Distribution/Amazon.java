package testNg_Distribution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	@Test
	public void amazon()
	{
	//driver related statement
			WebDriverManager.edgedriver().setup();
			//opening the firefoxBrowser
			WebDriver driver=new EdgeDriver ();
			//Maximize the browser
			driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//entering theURL
			driver.get("https://www.amazon.in/");
}
}
