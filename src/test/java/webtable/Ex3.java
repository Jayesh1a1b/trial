package webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        
        //whole table print dynamically
        for(int i=1;i<=7;i++)// outer loop-for row
        {
        	for(int j=1;j<=4;j++)// to print column
        	{
        		if(i==1)//for table header print
        		{
        			WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//th["+j+"]"));
        			System.out.print(data.getText()+"  ");
        		}
        		else
        		{
        			WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]"));
        			System.out.print(data.getText()+"  ");
        		}
        		
        	}
        	System.out.println();
        }
        
        
        driver.close();
	}

}
