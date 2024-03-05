package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLanch {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.name("q")).sendKeys("indore");
		
		List<WebElement> MultipleElements = driver.findElements(By.xpath("//div[@class='OBMEnb']//li"));
		
		String Actual="indore weather";
		for(WebElement element:MultipleElements)
		{
			String name = element.getText();
			if(Actual.equalsIgnoreCase(name))
			{
				element.click();
				break;
			}
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.close();

	}

}
