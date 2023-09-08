package autosuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_group_index {

	public static void main(String[] args) throws Throwable {
		//driver related statement
		WebDriverManager.edgedriver().setup();
		//opening the firefoxBrowser
		WebDriver driver=new EdgeDriver ();
		//Maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//entering the url
		driver.get("https://www.google.com");
		//address of search textfield
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("IPhone");
		Thread.sleep(3000);
		//address of the list
		WebElement thirdposition=driver.findElement(By.xpath("//li[@data-view-type='1']"));
		System.out.println(thirdposition.getText());
		


	}

}
