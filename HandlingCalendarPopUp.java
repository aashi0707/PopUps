package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCalendarPopUp {

	public static void main(String[] args) throws Throwable {

		// Launching browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		act.moveByOffset(10, 20).click().perform();
		act.moveByOffset(20, 10).click().perform();

		driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
		
		String month = "December";
		String date = "23";
		
		Thread.sleep(2000);
		
		
		//driver.findElement(By.xpath("//div[text()='December 2023']"  + "/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='14']")).click();

		// Dynamic 	XPath
	driver.findElement(By.xpath("//div[text()='"+month+"']"	+ "/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click(); 

		
		
		//driver.findElement(By.xpath(//div[text()='December 2023']/ancestor::div[@class="DayPicker-Month"]/descendant::p[text()='25']))
		
		
		// //div[text()=’November 2023’]/ancestor::div[@class=’DayPicker-Month’]/descendant::p[text()=’10’]
	}

}
