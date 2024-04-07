package cyient_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// print swami
		System.out.println("Shree swami samarth");
		
		// set the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		// initilze the webdriver
		WebDriver driver = new ChromeDriver();
		
		// call the URL
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		// FIND the xpath of countrydropdown
		WebElement countrydropdown = driver.findElement(By.xpath("//select [@name='country']"));
// Create object of Select class
		Select objselect = new Select(countrydropdown );
		
		objselect.selectByIndex(0);
		objselect.selectByValue("INDIA");
		
			
		// printing all elements of from dropdown list
	List <WebElement>	 alldropdownoptions = objselect.getOptions();
		
	for(WebElement option : alldropdownoptions	)
		
	{
System.out.println(option.getText());
	}
	}
}
