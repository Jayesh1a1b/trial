package seleniumPractice;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Writeascripttosearchforspecifiedoptioninthelistbox {

	public static void main(String[] args) {
		
		
	int found=0;
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	driver.manage().window().maximize();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter option to search:");
	String itemName = sc.next();
	
	WebElement dropdown = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
    Select s=new Select(dropdown);
    List<WebElement> allValues = s.getOptions();
    
    for(int i=0;i<=allValues.size()-1;i++)
    {
    	String actualDropdownName = allValues.get(i).getText();
    	if(actualDropdownName.equalsIgnoreCase(itemName))
    	{
    		found++;
    	}
    }
    if(found==0)
    {
    	System.out.println(itemName+" Not Found");
    }
    else if(found==1)
    {
    	System.out.println(itemName+"Found");
    }
    else
    {
    	System.out.println(itemName+" is duplicate");
    }
    
driver.close();
	}

}
