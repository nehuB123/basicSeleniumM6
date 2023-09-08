package test_Ng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {
	@Test
	public void assertn()
	{
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
	String title = driver.getTitle();
	//using hard Assert
	//using this method when test script get failed beolw steps willnot get executed
	//Assert.assertEquals(title,"dghjyrf");

	//soft asssert
	//using this method when test script get failed that step get skiped and beolw steps will get executed
	SoftAssert s=new SoftAssert();
	s.assertEquals(title,"dghjyrf");
	System.out.println(driver.getCurrentUrl());
	}

}
