package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	public static void main(String[] args) throws Throwable {

		// Launching browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
				
		driver.get("https://www.foundit.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[contains(text(),\"Upload Resume\")]")).click();
		
		WebElement file = driver.findElement(By.id("file-upload"));
		file.sendKeys("C:\\Users\\Dell\\Desktop/project-integration-scenarios.docx");
		Thread.sleep(1000);
		
		driver.findElement(By.id("pop_upload")).click();
		
	}

}
