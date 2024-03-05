package screenshotStudy;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class ScreenshotWithTheHelpOfRandomString {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//typecast webdriver object to TakesScreenshot Interface and call function getScreenshotAs() and passing parameter as OutputType.File
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//return type is file type it store screenshot as temporarily 
		
		
		// to store screenshot as drsired location we use copy method which is present in FileHandler class
		
		String r = RandomString.make(3);
       File dest=new File("E:\\dance video\\Camera\\P\\src\\test\\java\\screenshotStudy\\flipkart"+r+".png");
       
       try {
		FileHandler.copy(src, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
       driver.close();
	}

}
