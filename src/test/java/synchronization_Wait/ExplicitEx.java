package synchronization_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitEx {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.titleContains("Google"));
		System.out.println("Explicit wait used 1");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='हिन्दी']")));
		System.out.println("Explicit wait used 1");
		driver.close();

	}

}
