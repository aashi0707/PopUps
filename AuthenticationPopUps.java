package PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUps {

	public static void main(String[] args) {

		
		
		// Launching browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
				
       // Launching application
	   //driver.get("https://the-internet.herokuapp.com/basic_auth");
		
	   // Syntax: driver.get(https://Username:Password@Url");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
