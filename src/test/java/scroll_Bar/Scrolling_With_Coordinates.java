package scroll_Bar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling_With_Coordinates {

	public static void main(String[] args) throws Throwable {
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
				//address of career
			WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));
		Point  coOrdinates=career.getLocation();
		int x=coOrdinates.getX();
		int y=coOrdinates.getY();
		
		//down casting statement
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(4000);
		js.executeScript("arguments[0].click();",career);
		//career.click();
			

	}

}
