package week4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("oneplus 9 pro",Keys.ENTER);
		
		String oneplusprice = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]")).getText();
		System.out.println("One plus price starts from" +oneplusprice);
		
		String	noofcustomerreview = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text'][1]")).getText();
		System.out.println("No of customers reviewed" +noofcustomerreview);
		
		//Click the first text link of the first image

		//snapshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/firstphone.png");
		FileUtils.copyFile(source, destination);
		
		driver.findElement(By.xpath("//img[@class='s-image'][1]")).click();
		
		Thread.sleep(4000);
		
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> arraylist = new ArrayList<>(windowhandles);
		driver.switchTo().window(arraylist.get(1));
		
		//Add cart
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		//verify subtotal
		Thread.sleep(3000);
		WebElement subtotal = driver.findElement(By.id("attach-accessory-cart-subtotal"));
		String subtotaltext = subtotal.getText();
		System.out.println("Subtotal in the cart is"+subtotaltext);
		//
		driver.close();
		
		
		
	}

}
