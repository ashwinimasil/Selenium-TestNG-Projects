package w3.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouseactionsscroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ChromeOptions chromop = new ChromeOptions();
		ChromeDriver driver =  new ChromeDriver(chromop);
		chromop.addArguments("--disable notifications");
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		WebElement termsandcondns = driver.findElement(By.xpath("//a[@title='Promotions Terms & Conditions']"));
		Actions scrolldown = new Actions(driver);
		scrolldown.scrollToElement(termsandcondns).perform();
		termsandcondns.click();

	}

}
