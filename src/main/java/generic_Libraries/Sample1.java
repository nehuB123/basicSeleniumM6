package generic_Libraries;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {

	public static void main(String[] args)
	{
	WebDiverUtilities utilities=new WebDiverUtilities();
	 //driver related statement
				WebDriverManager.edgedriver().setup();
				//opening the ChromeBrowser
				WebDriver driver=new EdgeDriver ();
				//Maximize the browser
				driver.manage().window().maximize();
				utilities.implicitWaitMethod(driver, 10);
				//entering the URL
				driver.get("https://www.amazon.in/");
				WebElement dropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
				utilities.dropDown(dropDown,"Baby");
	}

}
