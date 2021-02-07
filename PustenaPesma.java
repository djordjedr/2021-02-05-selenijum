package prozori;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PustenaPesma {
	public static final String EXPECTED="https://www.youtube.com/watch?v=dQw4w9WgXcQ";
	public static final String ZAVRSNI="https://www.youtube.com/channel/UCuAXFkgsw1L7xaCfnd5JJOw";
	
	public static void Sacekaj(WebDriver driver) {
		driver.navigate().to(PustenaPesma.EXPECTED);
		
	}
	
	public static void Maximiziranje(WebDriver driver) {
		
		driver.manage().window().maximize();	
		driver.findElement(By.xpath(" //*[@id=\"img\"]"));     //*[@id="img"]
		driver.findElement(By.xpath(" //*[@id=\"img\"]")).click();
	}
	
	public static void preskociEPP(WebDriver driver) {
	
		try {
			driver.findElement(By.cssSelector("button.ytp-ad-skip-button ytp-button")).click();
		}
		catch(Exception e) {
			System.out.println("Nema reklame duze od 5 sekundi)");
		}
	}
}
