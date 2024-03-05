package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListboxEx {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
        driver.manage().window().maximize();
        
        // identify the dropdown 
        WebElement dp = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
        
        //dp.click();
        // create object of Select class
        Select s=new Select(dp);
        
        //By using any method select the item
        
        s.selectByVisibleText("Google");
        
        driver.close();
	}

}
