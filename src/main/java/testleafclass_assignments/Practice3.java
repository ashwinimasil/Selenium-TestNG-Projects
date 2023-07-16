package testleafclass_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("abcd");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ash");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Masil");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sour = new Select(source);
		sour.selectByIndex(4);
		WebElement marketing = driver.findElement(By.name("marketingCampaignId"));
		Select marketing1 = new Select(marketing);
		marketing1.selectByVisibleText("Automobile");
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select marketing2 = new Select(ownership);
		marketing2.selectByValue("OWN_CCORP");
		driver.findElement(By.name("submitButton")).click();
		String Title = driver.getTitle();
		System.out.println(Title);
	}

}