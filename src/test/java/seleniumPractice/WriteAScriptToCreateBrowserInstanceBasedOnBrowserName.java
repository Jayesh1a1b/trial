package seleniumPractice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteAScriptToCreateBrowserInstanceBasedOnBrowserName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter browser name");
		String br = sc.next();
		
		if(br.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.cricbuzz.com/");
		}
		else if(br.equals("FireFox"))
		{
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.nextgenerationautomation.com/post/selenium-coding-exercises");

		}

	}

}
