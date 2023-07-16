package week4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class TC02_Salesforce {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications--");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		
		//mobile publisher
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		
		//confirm direct
		System.out.println(driver.getWindowHandle());
		String Ptitle = driver.getTitle();
		System.out.println(Ptitle);
		
		Set<String> windowhandles = driver.getWindowHandles();
		List<String>winlist=new ArrayList<>(windowhandles);
		System.out.println("Window size"+ winlist.size());
		driver.switchTo().window(winlist.get(1));

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
	
		Shadow shadow1=new Shadow(driver);
		Thread.sleep(5000);
		shadow1.findElementByXPath("//span[text()='Learning']").click();
		WebElement trailhead = shadow1.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions trail=new Actions(driver);
		Thread.sleep(5000);
		trail.moveToElement(trailhead).perform();
		
		
	
		WebElement salesforcecert = shadow1.findElementByXPath("//a[text()='Salesforce Certification']");
	
		driver.executeScript("arguments[0].click();", salesforcecert);
		System.out.println("sales force cert clicked");
		//driver.switchTo().window(winlist.get(2));
			
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Reject All Cookies']")).click();
		driver.findElement(By.xpath("(//img[@class='roleMenu-item_img'])[2]")).click();
		List<WebElement> certificates = driver.findElements(By.xpath("//div[@class='credentials-card_type']"));
		certificates.size();
		Thread.sleep(3000);
		for (int i = 0; i < certificates.size(); i++) {
		System.out.println(certificates.get(i).getText());
		
	}
	driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
	System.out.println("appln arch clicked");
	File source = driver.getScreenshotAs(OutputType.FILE);
	File destination = new File("./screenshots/salesforce2.png");
	FileUtils.copyFile(source, destination);
	driver.close();

	}

}
