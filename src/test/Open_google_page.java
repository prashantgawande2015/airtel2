package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_google_page {

	public static void main(String[] args) {
		
		// print swami
		System.out.println("Shree swami Samarth");
		
		// set the properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			// initilize the web driver
		
		WebDriver driver = new ChromeDriver();
		
		// call the web page
		driver.get("https://www.google.co.in/");
		

	}

}
