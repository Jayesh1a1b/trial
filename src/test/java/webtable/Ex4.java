package webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		int totalNoOfRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		  System.out.println(totalNoOfRows);
		int totalColumn = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")).size();
          System.out.println(totalColumn);
          
          
          for(int i=1;i<=totalNoOfRows;i++)
          {
        	  for(int j=1;j<=totalColumn;j++)
        	  {
        		 if(i==1)
        			 {
        			 WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/th["+j+"]"));
        			 System.out.print(data.getText()+"  ");
        			 }
        		 else
        		 {
        			 WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]"));
        			 System.out.print(data.getText()+"  ");
        			 
        		 }
        		 
        	  }
        	  System.out.println();
          }
           
          driver.close();
	}

}
