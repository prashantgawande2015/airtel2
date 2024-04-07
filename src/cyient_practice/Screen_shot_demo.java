package cyient_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screen_shot_demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// print swami
		System.out.println("SHREE SWAMI SAMARTH");
		// set the path

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		// initialize the web driver
		WebDriver driver = new ChromeDriver();

		// call the webpage
		driver.get("https://www.google.com/");
		// use TakesScreeshot as Interface

		TakesScreenshot objshot = (TakesScreenshot) driver;
		// use FILE class & getScreenshotAs() method
		File objsourcefile = objshot.getScreenshotAs(OutputType.FILE);
		File objtargetfile = new File ("C:\\Users\\HP\\OneDrive\\Desktop\\screenshots\\sample.jpeg");


		Files.copy(objsourcefile, objtargetfile);
		//driver.close();



	}

}
