package w3.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("MS");
		driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("Cape");
		WebElement button =	driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
		button.sendKeys(Keys.F5);
	
		
		driver.findElement(By.id("disha-banner-close")).click();
		
		
		

	}

}
