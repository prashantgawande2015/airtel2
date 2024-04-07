package cyient_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// print swami
		System.out.println("Shree swami samarth");
		// set the property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			// initillie the webdriver
		WebDriver driver = new ChromeDriver();
		
		// call the webpage
		driver.get("https://demoqa.com/alerts");
		// find the xpath of click button
		WebElement click_btn=driver.findElement(By.xpath("//button[@id='alertButton']"));
		 click_btn.click();
		// print the name of alert ( if require)
		Thread.sleep(4000);
		System.out.println(driver.switchTo().alert().getText());
		
		// accept() / dismiss() the alert
		driver.switchTo().alert().accept();
		
		
		

	}

}
