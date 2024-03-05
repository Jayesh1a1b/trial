package seleniumPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutSelectTagDropdownHandled {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();

ChromeOptions options=new ChromeOptions();
options.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver(options);
driver.get("https://www.hdfcbank.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

WebElement ProductType = driver.findElement(By.xpath("(//div[@class='dropdown'])[1]"));
ProductType.click();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//List<WebElement> PT = driver.findElements(By.xpath("(//div[@class='dropdown'])[1]"));
//ArrayList al=new ArrayList();
//for(WebElement values:PT)
//{
//	al.add(values);
//}
//System.out.println(al);
driver.close();

	}

}
