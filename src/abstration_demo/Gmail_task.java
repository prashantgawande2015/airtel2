package abstration_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Gmail_task {

	public static void main(String[] args) {
	
		// Write a script to login to Gmail/Outlook,
		//open 2nd email from a particular email ID, and take a 
		//screenshot of this page. 
		//Then compose an email, attach this file, 
		//and send
	// step 1] code to login into gmail account	
		
System.setProperty("webdriver.chrome.driver","path");
WebDriver driver =new ChromeDriver();
driver.get("https://www.google.com/");

WebElement gmail_click_link =driver.findElement(By.xpath("//a[text()='Gmail']"));
gmail_click_link.click();

WebElement username = driver.findElement(By.xpath("//input[@id='identifierId']"));
username.sendKeys("automationmasterprashant@gmail.com");
WebElement password = driver.findElement(By.xpath(""));
		
		
		

	}

}
