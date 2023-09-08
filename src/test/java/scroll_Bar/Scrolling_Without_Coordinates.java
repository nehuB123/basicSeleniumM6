package scroll_Bar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.JavascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling_Without_Coordinates {

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
	//down casting statement
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",career);
	Thread.sleep(4000);
	js.executeScript("arguments[0].click();",career);
	//career.click();
	}
}
