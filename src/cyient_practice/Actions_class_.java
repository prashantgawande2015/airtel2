package cyient_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class_ {
	public static void main(String[] args) throws InterruptedException {
				// print swami
		System.out.println("Shree Swami Samarth");
		// set the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		// initialize the webdriver
		WebDriver driver = new ChromeDriver();
		// call the webpage
		driver.get("https://www.google.com/");
		// use actions class
		Actions objactions = new Actions(driver);
		Thread.sleep(3000);
		// find the xpath of the textbox
		WebElement voice_icon= driver.findElement(By.xpath("//div[@aria-label='Search by voice']"));

		// use build().perform() method to select the voice_icon

		objactions.moveToElement(voice_icon).build().perform();

		WebElement google_search=driver.findElement(By.xpath("//textarea[@name='q']"));
		google_search.sendKeys("sachin Tendulkar");
		objactions.sendKeys(Keys.ARROW_DOWN).build().perform();
		for(int i=0;i<10;i++)
		{
			Thread.sleep(2000);
			objactions.sendKeys(Keys.ARROW_DOWN).build().perform();
		}




	}

}
