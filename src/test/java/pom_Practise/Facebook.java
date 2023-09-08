package pom_Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pom.Fb_Loginpage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		//driver related statement
		WebDriverManager.edgedriver().setup();
		//opening the ChromeBrowser
		WebDriver driver=new EdgeDriver ();
		//Maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//opens the browser
	    driver.get("https://www.facebook.com");
	    Fb_Loginpage login = new Fb_Loginpage (driver);
	    login.emailTextField("neha");
	    login.passwordTextField("nehu123");
	    login.loginButton();

	}

}
