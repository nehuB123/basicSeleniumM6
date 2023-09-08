package action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_Click {

 public static void main(String[] args) {
	//driver related statement
	WebDriverManager.edgedriver().setup();
	//opening the firefoxBrowser
	WebDriver driver=new EdgeDriver ();
	//Maximize the browser
	driver.manage().window().maximize();
    //implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//entering the URL
	driver.get("https://demoapp.skillrary.com/");
	//address of course web element
	WebElement ele = driver.findElement(By.xpath("//a[text()='COURSE']"));
	//creating an object for actions class
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
	//address of selenium training 
	 driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
	//address of + icon
	WebElement plus = driver.findElement(By.id("add"));
	a.doubleClick(plus).perform();
	
	

	}

}
