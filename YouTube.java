package prozori;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class YouTube {
	
	public static final String URL="https://www.youtube.com/";
	
	public static void trazi(WebDriver driver,String search1) {
		 WebElement we=driver.findElement(By.cssSelector("input#search"));
		 we.click();
		 we.sendKeys(search1);
		 we.sendKeys(Keys.ENTER);
	}

	
	
}
