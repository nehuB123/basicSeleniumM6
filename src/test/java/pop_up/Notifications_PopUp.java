package pop_up;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notifications_PopUp {

	public static void main(String[] args) {
		HashMap<String, Integer> contentStrings=new HashMap<String, Integer>();
		HashMap<String, Object> profile=new HashMap<String, Object>();
		HashMap<String, Object> prefs=new HashMap<String, Object>();
		
	
		contentStrings.put("notifications", 0);
		profile.put("managed_default_content_settings", contentStrings);
		prefs.put("profile", profile);
		
		//handeling notification pop up in edge browser
		EdgeOptions options=new EdgeOptions();
		options.setCapability("preferences",prefs);
		
	//driver related statement
				WebDriverManager.edgedriver().setup();
				//opening the ChromeBrowser
				WebDriver driver=new EdgeDriver (options);
				//Maximize the browser
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//entering the URL
                driver.get("https://www.quikr.com/");
	}

}
