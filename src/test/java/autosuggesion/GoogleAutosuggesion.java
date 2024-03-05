package autosuggesion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleAutosuggesion {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https//www.google.co.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

}
