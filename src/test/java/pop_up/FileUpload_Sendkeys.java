package pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_Sendkeys {

	public static void main(String[] args) {
		//driver related statement
				WebDriverManager.edgedriver().setup();
				//opening the ChromeBrowser
				WebDriver driver=new EdgeDriver ();
				//Maximize the browser
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//entering the URL
				driver.get("https://www.foundit.in/");
				//address of upload Resume
				driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
				driver.findElement(By.id("C:\\Resume"));
			
//not run
	}

}
