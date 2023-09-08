package pop_up;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Browser {

	public static void main(String[] args) throws Throwable {
		//driver related statement
		WebDriverManager.edgedriver().setup();
		//opening the ChromeBrowser
		WebDriver driver=new EdgeDriver ();
		//Maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//entering the URL
		driver.get("https://skillrary.com/");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath(" (//a[text()=' SkillRary Essay'])[2]")).click();
		//shifting control to the child browser
		Set<String> child = driver.getWindowHandles();
		for (String b:child)
		{
			driver.switchTo().window(b);
		}
		driver.findElement(By.xpath("//input[@placeholder='Enter name to continue']")).sendKeys("neha");
	Thread.sleep(2000);
	//shifting control to the parent browser
	driver.switchTo().window(parent);
	driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
}
	
}
