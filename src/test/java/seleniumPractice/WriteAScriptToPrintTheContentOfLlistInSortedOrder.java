package seleniumPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteAScriptToPrintTheContentOfLlistInSortedOrder {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	driver.manage().window().maximize();
	
	WebElement dp = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[2]"));
	
	Select s=new Select(dp);
	
	List<WebElement> allOptions = s.getOptions();
	
	ArrayList al=new ArrayList();
	
	System.out.println(allOptions.size());
	
	for(int i=0;i<=allOptions.size()-1;i++)
	{
		String opnName = allOptions.get(i).getText();
		System.out.println(opnName);
		al.add(opnName);
	}
	Collections.sort(al);
	System.out.println("====================================");
	System.out.println(" after Sorting option list");
	for(Object sortList:al)
	{
		System.out.println(sortList);
	}

	}

}
