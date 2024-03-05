package autosuggesion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAutosuggetion {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		List<WebElement> multipleElement = driver.findElements(By.xpath("//div[@class='left-pane-results-container']//div[@class='s-suggestion-container']"));
		String actualResult="iphone";
for(WebElement singleElement:multipleElement)
{
System.out.println(singleElement.getText());
if(actualResult.equalsIgnoreCase(singleElement.getText()))
{
	singleElement.click();
}

}
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.close();

	}

}
