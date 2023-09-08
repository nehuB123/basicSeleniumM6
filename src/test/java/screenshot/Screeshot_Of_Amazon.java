package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Screeshot_Of_Amazon {

	public static void main(String[] args) throws Throwable  {
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
		//down casting
		TakesScreenshot ts =(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./Screenshots/amazon.png");
	//coping from src and pasting in dest
	FileUtils.copyFile(src, dest);
		
		

	}

}
