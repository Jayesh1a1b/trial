package findElementsMethodAllElementPrint;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAllLinksPrint {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		List<WebElement> allElements = driver.findElements(By.tagName("a"));
		System.out.println(allElements.size());
		
		for(WebElement element:allElements)
		{
			System.out.println(element.getText());
		}
		driver.close();
	}

}
