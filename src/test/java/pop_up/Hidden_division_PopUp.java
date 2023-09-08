package pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hidden_division_PopUp {

	public static void main(String[] args) {
		//driver related statement
				WebDriverManager.edgedriver().setup();
				//opening the ChromeBrowser
				WebDriver driver=new EdgeDriver ();
				//Maximize the browser
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//entering the url
				driver.get("https://www.redbus.in/");
				//address of date web element
				driver.findElement(By.xpath("//span[text()='Date']")).click();
				//address of date
				driver.findElement(By.xpath("//div[text()='Aug']/../../..//span[text()='28']")).click();
				
				
				

	}

}
