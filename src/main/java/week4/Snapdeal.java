package week4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
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
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.google.common.base.Verify;

public class Snapdeal {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		//options.AddUserProfilePreference("profile.default_content_setting_values.cookies",2);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[@class='btn col-xs-8 btn-line-skyblue push-deny']")).click();
		driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]")).click();
		//sports shoes
		WebElement sportsshoes = driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
		Actions shoesaction = new Actions(driver);
		shoesaction.moveToElement(sportsshoes).click().perform();
		
		WebElement Sportsshoes = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[1]"));
		String Sportsshoescount = Sportsshoes.getText();
		System.out.println("Sports shoes for men"+Sportsshoescount);
				
		//training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		//driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		//low to high click
		driver.findElement(By.xpath("//li[normalize-space()='Price Low To High']")).click();
		WebElement fromval = driver.findElement(By.name("fromVal"));
		fromval.clear();
		fromval.sendKeys("900");	
		
		
		WebElement Toval = driver.findElement(By.name("toVal"));
		Toval.clear();
		Toval.sendKeys("1200");
		//choose navy colour is not available
		//verify is not learnt
		
		//first shoe quickview
		WebElement shoefirstview=driver.findElement(By.xpath("//div[normalize-space()='Quick View'][1]"));
		Actions firstshoequickview = new Actions(driver);
		firstshoequickview.moveToElement(shoefirstview).click().perform();
		
		//print mrp and %
		
		System.out.println("quick view and accept window opens");
		//driver.findElement(By.xpath("//div[text()='Allow All']")).click();
		
		//WebElement acceptall = driver.findElement(By.xpath("//div[text()='Allow All']"));
		//driver.executeScript("arguments[0].click();", acceptall);
		//System.out.println("allow all clicked");
		
		Thread.sleep(7000);
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> arraylist= new ArrayList<>(windowhandles);
		
		driver.switchTo().window(arraylist.get(1));
		WebElement price = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
		System.out.println("price"+price.getText());
				
		//snapshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/shoeselect.png");
		FileUtils.copyFile(source, destination);
		driver.close();
		driver.switchTo().defaultContent();
		driver.close();
		
	}

}
