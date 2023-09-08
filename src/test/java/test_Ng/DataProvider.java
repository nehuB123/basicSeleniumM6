package test_Ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
 
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider 
{
	@org.testng.annotations.DataProvider
	public Object[][] getData()
	{
 Object[][]a=new Object[3][2] ;
 a[0][0]="adfghfg";
 a[0][1]="12wertty";
 
 a[1][0]="123445";
 a[1][1]="cvbnhd";
 
 a[2][0]="seu@#4";
 a[2][1]="bnmkjui)(*&^%$";
 return a;
	}
@Test(dataProvider="getData")
public void demo(String username,String pswd)
{
	WebDriverManager.edgedriver().setup();
	//opening the ChromeBrowser
	WebDriver driver=new EdgeDriver ();
	//Maximize the browser
	driver.manage().window().maximize();
	//opens the browser
    driver.get("https://www.facebook.com");
    
    driver.findElement(By.id("email")).sendKeys(username);
    driver.findElement(By.id("pass")).sendKeys(pswd);
    
    driver.findElement(By.name("login")).click();
    driver.close();
    
}

}
