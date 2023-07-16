package week7.Marathon;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_SalesForce extends Parentclass {
	@BeforeTest
	public void setValues() 
	{
		excelFileName = "Oppo";
	}
	@Test(dataProvider = "sendData")
	public void newOpportunityClick(String Name, String Amount) throws InterruptedException {

		// sales button in new window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winList = new ArrayList<>(windowHandles);
		System.out.println(windowHandles.size());
		driver.switchTo().defaultContent();
		System.out.println("Window handled");
		WebElement toggle2 = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		driver.executeScript("arguments[0].click();", toggle2);
		// click sales
		WebElement sales = driver.findElement(By.xpath("//p[text()='Sales']"));
		driver.executeScript("arguments[0].click();", sales);
		System.out.println("sales clicked");
	
		Thread.sleep(3000);
		WebElement opportunities = driver.findElement(By.xpath("//span[text()='Leads']/preceding::span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", opportunities);
	
		driver.findElement(By.xpath("//div[@title='New']")).click();
		Set<String> newOppoWindow = driver.getWindowHandles();
		List<String> winList1 = new ArrayList<>(newOppoWindow);
		System.out.println(newOppoWindow.size());
		driver.switchTo().window(winList1.get(0));
		System.out.println("Window handled for opportunity window");

		Thread.sleep(5000);
		// Enter Close date
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("16/06/2023");
		Thread.sleep(5000);
		// Enter opportunity as 'salesforce Automation'
		driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input[@class='slds-input'][1]"))
				.sendKeys(Name);//xl data
		Thread.sleep(5000);
		//Enter amount
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(Amount);//xl data
		

		// click on the stage link
		driver.findElement(By.xpath("//span[text()='--None--']")).click();
		// click on the Needs Analysis row td
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='slds-media__body']//span[text()='Needs Analysis']")).click();
		//click on premium campaign source
		Thread.sleep(2000);
		WebElement premiumCampaign = driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[2]"));
		driver.executeScript("arguments[0].click();", premiumCampaign);
		driver.findElement(By.xpath("//span[text()='Rest API']")).click();

		// click on save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String verifyOppourtunity = driver.findElement(By.xpath(
				"//div[@class='slds-theme--success slds-notify--toast slds-notify slds-notify--toast forceToastMessage']"))
				.getText();

		if (verifyOppourtunity.equalsIgnoreCase("created")) {
			System.out.println(verifyOppourtunity);
		} else
			System.out.println(verifyOppourtunity);
	}
	
}