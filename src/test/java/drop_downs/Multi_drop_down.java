package drop_downs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multi_drop_down {

	public static void main(String[] args) throws Throwable {
		//driver related statement
				WebDriverManager.firefoxdriver().setup();
				//opening the firefoxBrowser
				WebDriver driver=new FirefoxDriver ();
				//Maximize the browser
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//entering the URL
				driver.get("https://demoapp.skillrary.com/");
				//address of dropDown
				WebElement dropDown=driver.findElement(By.id("cars"));
				Select s=new Select (dropDown);
				s.selectByIndex(0);
				Thread.sleep(2000);
				s.selectByValue("199");
				Thread.sleep(2000);
				//s.deselectByVisibleText("INR 200 - INR 299 ( 3 ) ");
				//Thread.sleep(2000);
				s.deselectByIndex(0);
				s.deselectByValue("199");
				//s.deselectByVisibleText("INR 200 - INR 299 ( 3 ) ");
				
				System.out.println(s.isMultiple());
				List<WebElement> options=s.getAllSelectedOptions();
				for (WebElement b:options)
				{
					System.out.println(b.getText());
				}
				

	}

}
