package selenium_Automation_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.in");
		WebElement move =  driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions ac = new Actions(driver);
		ac.moveToElement(move).build().perform();
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.id("nav-search-bar-form"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().perform();
		ac.moveToElement(move).contextClick().build().perform();
		System.out.println("The End");
		//driver.close();
	}

}
