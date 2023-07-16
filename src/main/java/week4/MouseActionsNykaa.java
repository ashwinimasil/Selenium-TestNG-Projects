package week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsNykaa {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable notifications--");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.nykaa.com/");
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		System.out.println("brands clicked");
		Actions actions = new Actions(driver);
		actions.moveToElement(brands).perform();
		driver.findElement(By.xpath("//a[text()='L']")).click();
		WebElement loreal = driver.findElement(By.xpath("//a[text()=\"L'Oreal Paris\"]"));
		Actions Loreal = new Actions(driver);
		String textloreal= loreal.getText();
		Loreal.moveToElement(loreal).click().perform();
		System.out.println("L'oreal Paris");
		
		
			
		if(textloreal.contains("L'Oreal Paris")) 
		{
			System.out.println("L'Oreal Paris is clicked");
		}
		
		//driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
		//driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		//*[name()='svg' and @class='arrow-icon']//*[local-name()='path']
	/*	WebElement webElement = driver.findElement(By.cssSelector("//*[name()='svg' and @class='arrow-icon']//*[local-name()='path']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);*/
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[name()='svg' and @class='arrow-icon']//*[local-name()='path'])[1]")).click();
		
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//div[@class='control-indicator checkbox active']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		driver.findElement(By.xpath("//img[@class='css-11gn9r6']")).click();
		String pwindowHandle = driver.getWindowHandle();
		String PTitle = driver.getTitle();
		System.out.println();
		Set<String> windowHandles = driver.getWindowHandles();
		int size = windowHandles.size();
		for (String each : windowHandles) {
			System.out.println(each);
		}
		List<String> parrayList = new ArrayList<>(windowHandles);
		System.out.println(parrayList.get(size));
		driver.switchTo().window(parrayList.get(1));
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		String MRPShampoo = driver.findElement(By.xpath("//span[text()='₹209']")).getText();
		System.out.println(MRPShampoo);
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		
		//add to cart
		driver.findElement(By.className("cart-count")).click();
		
		//grandtotal text
		String Grandtotal = driver.findElement(By.xpath("//span[text()='₹279']")).getText();
		System.out.println(Grandtotal);
		//proceed -- couldnt find the control anywhere
		
		/*16) Click on Continue as Guest
		17) Check if this grand total is the same in step 14
		18) Close all windows*/

		
		
	}

}
