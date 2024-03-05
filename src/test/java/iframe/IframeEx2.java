package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeEx2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//change focus from main page to i frame page
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jayesh");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().frame("frame2");
		//we are working on drop down which have select tag
		// identify drop down and store within a reference variable
		
		//below code not working in frame2
//		WebElement DropDownMenu = driver.findElement(By.id("animals"));
//		Select S=new Select(DropDownMenu);
//		S.selectByVisibleText("Avatar");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

	}

}
