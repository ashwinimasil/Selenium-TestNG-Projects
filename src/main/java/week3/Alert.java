package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		String AlertText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(AlertText);
		if (AlertText.contains("simple alert")) {
		
		System.out.println("Alert accepted");
	}
	}
	}
