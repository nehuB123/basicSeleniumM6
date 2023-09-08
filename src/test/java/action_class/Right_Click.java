package action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Right_Click {

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
				driver.get("https://www.amazon.in/");
				//address of course web element
				WebElement kittu=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
				Actions a=new Actions(driver);
				a.contextClick(kittu).perform();

	}

}
