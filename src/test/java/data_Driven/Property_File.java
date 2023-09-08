package data_Driven;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Property_File {

	public static void main(String[] args) throws Throwable 
	{
     //create an object for properties class
     Properties p=new Properties();
     //create an object for physical file
    FileInputStream fis=new  FileInputStream(".\\src\\test\\resources\\Data.properties");
     p.load(fis);
     String appurl = p.getProperty("url");
     String user = p.getProperty("username");
     String password = p.getProperty("password");
     
   //driver related statement
	 WebDriverManager.edgedriver().setup();
   	//opening the edgeBrowser
	WebDriver driver=new EdgeDriver ();
	//Maximize the browser
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get(appurl);
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(user);
    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);

	}

}
