package autosuggesion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartPriceAndReviewPrint {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement searchTextField = driver.findElement(By.name("q"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		searchTextField.sendKeys("iphone13",Keys.ENTER);
		
		//when not using keys.Enter and using search icon
//		WebElement searchIconButton = driver.findElement(By.xpath("//button[@class='_2iLD__']"));
//		searchIconButton.click();
		//Note: if we have multiple search and we want particular product information then indexing is compulsory
		//ex-(//div[@class='_30jeq3 _1_WHN1'])[1]
		
		// print price of iphone
		WebElement iphonePrice = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]"));
		System.out.println(iphonePrice.getText());
	    System.out.println("--------------------------------------");	
		//print specification 
		List<WebElement> allSpecifications = driver.findElements(By.xpath("(//ul[@class='_1xgFaf'])[1]//li"));
		for(WebElement element:allSpecifications)
		{
			System.out.println(element.getText());
		}
		System.out.println("--------------------------------------");	
		//print ratings
		
		WebElement rating = driver.findElement(By.xpath("(//div[@class='_3LWZlK'])[1]"));
		System.out.println(rating.getText());
	}

}
