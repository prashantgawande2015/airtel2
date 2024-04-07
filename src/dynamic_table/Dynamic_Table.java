package dynamic_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Table {

	public static void main(String[] args) {

		// print swami
		System.out.println("Shree swami samarth");
		// set the path

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		// initilize the webdriver
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/web-table-element.php");

		WebElement tablecell=	driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]"));

		// print the value
		System.out.println(tablecell.getText());


		// find the number of col
		List<WebElement> totalcol=	driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println("total COL size" +totalcol.size());

		// find the total row
		List<WebElement> totalrow= driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Total ROW size"+totalrow.size());


		// how to iterate through the table
		for(int i=1;i<totalrow.size();i++)
		{

			for(int j=1;j<totalcol.size();j++)
			{
				WebElement  alltablecell = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(alltablecell.getText() +" | ");

			}
			System.out.println();
		}
		driver.close();
	}



}
