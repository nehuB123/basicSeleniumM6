package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alter_Pop_Up {

	public static void main(String[] args) throws Throwable {
		//driver related statement
		WebDriverManager.edgedriver().setup();
		//opening the ChromeBrowser
		WebDriver driver=new EdgeDriver ();
		//Maximize the browser
		driver.manage().window().maximize();
		//entering the URL
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		//address of add to cart
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		//shifting the control
	  Alert a1=driver.switchTo().alert();
	  Thread.sleep(3000);
	  a1.accept();
	  System.out.println(a1.getText());
	  
	 //a1.dismiss();
	  Thread.sleep(3000);
	  driver.quit();
	  //not 
	}

}
