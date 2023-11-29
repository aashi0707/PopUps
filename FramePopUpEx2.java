package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramePopUpEx2 {

	public static void main(String[] args) {

		// Launching browser
				WebDriverManager.edgedriver().setup();
				WebDriver driver = new EdgeDriver();

				driver.get("https://demo.automationtesting.in/Frames.html");
				driver.manage().window().maximize();
				
				//switching frame by using index value
			/*	driver.switchTo().frame(0);	
				driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("aashi_manakbohara");
				*/
				
				//switching frame by using Id and name attribute
				/*driver.switchTo().frame("singleframe");
				driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("hieeee");
              */

				//switching frame by using web elements
				WebElement text = driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
				driver.switchTo().frame(text);
				driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("spider&mosquito");
				
				
				
				
				
		
	}

}
