package autosuggesion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleMobileSearch {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("mobile");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		List<WebElement> multipleElements = driver.findElements(By.xpath("//div[@class='OBMEnb']//li"));
String AS="mobile tracker";
		for(WebElement singleElement:multipleElements)
		{
			System.out.println(singleElement.getText());
			if(AS.equalsIgnoreCase(singleElement.getText()))
			{
				singleElement.click();
				break;
			}
		}
	}

}
