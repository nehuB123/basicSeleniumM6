package pop_up;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload_Robot {

 public static void main(String[] args) {
	//driver related statement
	WebDriverManager.edgedriver().setup();
	//opening the ChromeBrowser
	WebDriver driver=new EdgeDriver ();
	//Maximize the browser
	driver.manage().window().maximize();
	//entering the URL
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp 22636");			
	Thread.sleep(3000);
	Robot r=new Robot();
				

	}

}
