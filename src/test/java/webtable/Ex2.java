package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//single Header data print
		
		WebElement singleHeadValue = driver.findElement(By.xpath("(//table[@name='BookTable']//tr)[1]//th[3]"));
		System.out.println(singleHeadValue.getText());
		
		//whole row of header
		
		List<WebElement> headerRow = driver.findElements(By.xpath("(//table[@name='BookTable']//tr)[1]//th"));
        for(WebElement HRow:headerRow)
        {
        	System.out.print(HRow.getText()+" ");
        }
        System.out.println();
        System.out.println("========================================");
        
      //print only one data form table
        
       WebElement singleValue = driver.findElement(By.xpath("(//table[@name='BookTable']//tr)[4]//td[4]"));
        System.out.println(singleValue.getText());
        
        
        //print how to read complete row from table
        
       List<WebElement> fifthRow = driver.findElements(By.xpath("//table[@name='BookTable']//tr[5]//td"));
        for(WebElement row:fifthRow)
        {
        	System.out.print(row.getText()+" ");
        }
        System.out.println();
        System.out.println("========================================");
        
        
      //read complete single column
        
        
        for(int i=2;i<=7;i++)
        {
        	WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]"));
        	System.out.println(data.getText());
        }
        System.out.println();
        System.out.println("========================================");
        
        //4th column
 //read complete single column
        
        
        for(int i=2;i<=7;i++)//1 index  table header
        {
        	WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]"));
        	System.out.println(data.getText());
        }
		
        driver.close();
        
        
        
	}

}
