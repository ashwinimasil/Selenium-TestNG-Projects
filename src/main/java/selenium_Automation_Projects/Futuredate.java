package selenium_Automation_Projects;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Futuredate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String expected = "2026";
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[text()='Travel'])[1]")).click();//travel
		driver.findElement(By.xpath("//span[contains(text(),'TRAVEL COMPANION')]")).click();//travel companion
		
		
		String javascript = "window.scrollBy(0,1000)";  
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		jsExecutor.executeScript(javascript); 
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("form-field-travel_comp_date")).click(); //fromdate
		int i=0;
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//input[@class='numInput cur-year']"))).build().perform();
		
		System.out.println(driver.findElement(By.xpath("//input[@title='Scroll to increment']")).getText());
		/*do {
			driver.findElement(By.xpath("//span[@class='arrowUp']")).click();
			test =
			System.out.println(test);
			}while(test.contains("2025"));*/
	   
		
		
		//Do(!driver.findElement(By.xpath("//input[@class='numInput cur-year']")).getText().contains("2025")) {
		/*if (!current.equals(expected)) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@class='arrowUp']")).click();
			System.out.println("link clicked");*/
		for (int j=0;j<4;j++) {
			driver.findElement(By.xpath("//span[@class='arrowUp']")).click();	
			}
		
					
		/*while(!driver.findElement(By.xpath("//div[@class='flatpickr-current-month']")).getText().contains("April")) 
		{
			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();//next button click
			
		}*/
		List<WebElement> day = driver.findElements(By.xpath("//span[@class='flatpickr-day ']"));
		for (i=0;i<day.size();i++) 
		{
		String dates = day.get(i).getText();
		System.out.println(dates);
		if(dates.contains("28"))
		{
		driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).click();
		break;
		}
		
	}
}
}
