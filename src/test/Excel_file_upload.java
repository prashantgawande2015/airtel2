package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_file_upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// print swami
		System.out.println("SHREE SWAMI SAMARTH");
// set the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
// Initialize  the web driver
		
		WebDriver driver = new ChromeDriver();
// upload the page
		driver.get("https://demo.guru99.com/test/upload/");
// find the xpath of choosebutton
WebElement choosebutton =		driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
	choosebutton.sendKeys("C:\\Users\\HP\\Desktop\\Sample_text_file.xlsx");
	
	// click on checkbox
WebElement checkbox=	driver.findElement(By.xpath("//input[@id='terms']"));
checkbox.click();
// click on submit button
WebElement submitbutton =driver.findElement(By.xpath("//button[@id='submitbutton']"));
submitbutton.click();

	
		
// 

		
		
	}

}
