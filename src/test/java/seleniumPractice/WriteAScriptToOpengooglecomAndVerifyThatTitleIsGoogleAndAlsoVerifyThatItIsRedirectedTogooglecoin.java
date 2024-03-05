package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteAScriptToOpengooglecomAndVerifyThatTitleIsGoogleAndAlsoVerifyThatItIsRedirectedTogooglecoin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		if(title.equals("Google"))
		{
			System.out.println("TC pass");
		}
		else
		{
			System.out.println("TC Fail");
		}
		
		//verify that it is redirected to google.co.in
		
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println(currentUrl);
		 if(currentUrl.contains("google.co.in"))
		 {
			 System.out.println("TC 2 Pass");
		 }
		 else
		 {
			 System.out.println(" TC 2 Fail");
		 }
		
 driver.close();
	}

}
