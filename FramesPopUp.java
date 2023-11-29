package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPopUp {

	public static void main(String[] args) {

		// Launching browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		   WebElement drag = driver.findElement(By.id("draggable"));
		   WebElement drop = driver.findElement(By.id("droppable"));
		
          Actions act = new Actions(driver);
          act.dragAndDrop(drag, drop).perform();
	
	}

	
}
