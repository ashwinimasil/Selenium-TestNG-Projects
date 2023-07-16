package week4;

import java.time.Duration;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Mergecontract {

	public static void main(String[] args) throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver driver =  new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.partialLinkText("CRM")).click();
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	//click on Merge Contacts
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	
	//from widget 
	driver.findElement(By.xpath("//span[text()='From Contact']/following::img[1]")).click();
	String pWindowTitle = driver.getTitle();
	
		
	Set<String>parentwindow = driver.getWindowHandles();
	List<String> FarrayList = new ArrayList<>(parentwindow);
	driver.switchTo().window(FarrayList.get(1));
	String FromTitle = driver.getTitle();
	System.out.println(FromTitle);
	
		
	//first result in from window
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")).click();
	
	driver.switchTo().window(FarrayList.get(0));
	
	
		
	//click on the To widget
	Thread.sleep(5000);
	System.out.println(driver.getTitle());

	driver.findElement(By.xpath("//span[text()='To Contact']/following::img")).click();
	//windowhandles for To widget
	Set<String>ChildTowindow  = driver.getWindowHandles();
	List<String> childTolist = new ArrayList<>(ChildTowindow);
	

	//click on the first result in to window
	driver.switchTo().window(childTolist.get(1));
	driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
	driver.switchTo().window(FarrayList.get(0));
	//click on the Merge
	driver.findElement(By.xpath("//a[text()='Merge']")).click();
	driver.switchTo().alert().accept();
	String Error = driver.findElement(By.xpath("//li[@class='errorMessage']")).getText();
	System.out.println(Error);
	
}
}