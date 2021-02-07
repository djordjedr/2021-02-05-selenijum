package prozori;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pesma {
	public static final String EXPECTED="https://www.youtube.com/results?search_query=Rick+Astley";

	public static void pesma(WebDriver driver) {
		WebElement we= driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string"));
		we.click();
		//we.sendKeys(Keys.ENTER);
		
		
		
	}
	
	
}
