package seleniumPractice;

public class WriteAScriptToPrintAllTheOptionsForDuplicatesAddEntryOnlyOnce {

	public static void main(String[] args) {
		// Practice website not getting so solution provided here
		
	/*	If I want to remove duplicate from dropdown by using Selenium WebDriver and Java I found some solutions.

		They store the elements in List then they use Set for remove duplicate as blow. Why we are using List then we store the list in Set? I know if there are multiple elements we need List but, can we use only Set without using List?

		WebElement element = driver.findElement(By.id(“dropdown“));
		Select select= new Select(element)     
		List<WebElement> list = select.getOptions();
		Set set = new HashSet ();
		for (WebElement element : list) {    
		    set.add(element);
		}
		

	}*/

}
}
