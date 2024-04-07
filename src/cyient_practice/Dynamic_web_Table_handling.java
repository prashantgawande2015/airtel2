package cyient_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_web_Table_handling {

	public static void main(String[] args) {
			// print swami
		System.out.println("SHREE SWAMI SAMARTH");
		// set the property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			// initilize the webdriver
		WebDriver driver = new ChromeDriver();
		// call the webpage
		driver.get("https://demo.guru99.com/test/web-table-element.php");
	// print the one tablecell
		WebElement tablecell = driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]"));
		System.out.println(tablecell.getText());
		
		// print the total  number of col
		List<WebElement> totalcol= driver.findElements(By.xpath("//table/thead/tr/th"));
		// print the totol col
		System.out.println("Total col size is"+totalcol.size());
		
		// print the total number of Row
		List<WebElement> totalrow = driver.findElements(By.xpath("//table/tbody/tr"));
		// print the size of col
		System.out.println("Total row size"+totalrow.size());
		
// now iterate all the elements
		
		for(int i=1;i< totalrow.size(); i++)
		{
			for(int j=1;j< totalcol.size();j++)
			{
				WebElement  alltablecell = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
				
			//	WebElement alltablecell = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(alltablecell.getText() +" | ");
						
			}
			System.out.println();
		}
	}

}
