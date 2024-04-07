package cyient_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_file_upload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// print swami
		System.out.println("Shree swami samarth");
// set the property		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		
// Initialize the webdriver
		WebDriver driver= new ChromeDriver();
		
		// load the webpage
		driver.get("https://demo.guru99.com/test/upload/");
		// find xpath of 'choose file' button 
	WebElement choosebtn =	driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
	// use sendkeys method
	
		choosebtn.sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\Sample_text_file.xlsx");
	Thread.sleep(3000);
		// find xpath of terms and condition checkbox
		WebElement checkbox= driver.findElement(By.xpath("//input[@type='checkbox']"));	
		
		checkbox.click();
		
	// click on submit button
		WebElement submitbtn=driver.findElement(By.xpath("//button[@type='button']"));
		submitbtn.click();
		
	
		
		

	}

}
