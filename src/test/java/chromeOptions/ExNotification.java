package chromeOptions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExNotification {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
       ChromeOptions opt= new ChromeOptions();
		
		//opt.addArguments("--headless");
		//opt.addArguments("incognito");
		//opt.addArguments("-disable-notifications");
		//opt.addArguments("start-maximized");
		
		
		ArrayList<String>al= new ArrayList<String>();
		
		al.add("incognito");
		al.add("-disable-notifications");
		al.add("start-maximized");
		
		opt.addArguments(al);
		
		WebDriver driver= new ChromeDriver(opt);
		//driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
