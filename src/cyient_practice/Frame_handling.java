package cyient_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// print swami
		System.out.println("SHREE SWAMI SAMARTH");
// Set the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
// Initialize the webdriver
		WebDriver driver = new ChromeDriver();
// call the webpage
		driver.get("https://demo.guru99.com/test/guru99home/");
// find the iframe tag
		
		driver.switchTo().frame("a077aa5e");
// find xpath of frame
		
	WebElement frame_element  =	driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		frame_element.click();
// now swith to orifinal frame
		driver.switchTo().defaultContent().getTitle();
	WebElement email_textbox=	driver.findElement(By.xpath("//input[@placeholder='Enter Email']"));
	email_textbox.sendKeys("test@gmail.com");
	
		
	}

}
