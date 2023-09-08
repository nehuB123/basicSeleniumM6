package drop_downs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Single_Drop_Down {

	public static void main(String[] args) throws Throwable {
		//driver related statement
		WebDriverManager.edgedriver().setup();
		//opening the firefoxBrowser
		WebDriver driver=new EdgeDriver ();
		//Maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//entering the URL
		driver.get(" https://www.amazon.in/");
		
		//address of drop down
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		//create an object
		Select s=new Select(dropDown);
		s.selectByIndex(4);
		Thread.sleep(3000);
		s.selectByValue("search-alias=baby");
		Thread.sleep(2000);
		s.selectByVisibleText("Electronics");
		//checking the type of drop down
		System.out.println(s.isMultiple());
		List<WebElement> allOptions=s.getOptions();
		for (WebElement b:allOptions)
		{
			System.out.println(b.getText());
		}
	}
}
