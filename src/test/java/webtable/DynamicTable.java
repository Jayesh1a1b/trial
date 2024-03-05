package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		int TotalRows = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		System.out.println(TotalRows);
		
		 int TotalColumn = driver.findElements(By.xpath("//table[@class='dataTable']//tr//th")).size();
          System.out.println(TotalColumn);
          
          for(int i=1;i<=TotalRows;i++)
          {
        	  for(int j=1;j<=TotalColumn;j++)
        	  {
        		  if(i==1)
        		  {
        			 WebElement data = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//th["+j+"]"));
        			 System.out.print(data.getText()+"  ");
        		  }
        		  else
        		  {
        			 WebElement data = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]"));
        			 System.out.print(data.getText()+"  ");
        		  }
        	  }
        	  System.out.println();
          }
	}

}
