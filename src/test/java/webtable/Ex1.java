package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	public static void main(String[] args) {
		// IdentifyWebTable
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				//tr-table row,td-table data,th-table header
				
				//identify web table
				WebElement webTable = driver.findElement(By.xpath("//table[@name='BookTable']"));
				
				
				//how many rows in table
				List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
                int noOfRows = rows.size();
                System.out.println("Number of rows "+noOfRows);
                
                //total column in row
                List<WebElement> noOfColumn = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
                int totalCellNo = noOfColumn.size();
                System.out.println(totalCellNo);
                driver.close();
	}

}
