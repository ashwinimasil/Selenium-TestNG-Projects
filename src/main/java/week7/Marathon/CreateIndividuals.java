package week7.Marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateIndividuals extends BaseClass {
	
	@BeforeTest
	public  void setvalues() {
		excelFileName ="CreateIndividuals";
	}
	@Test(dataProvider = "sendData")
	public void createIndividuals(String LName) {
		WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
		driver.executeScript("arguments[0].scrollIntoView();", scroll);
		WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
		driver.executeScript("arguments[0].click();", individual);
		driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']//a")).click();
		WebElement clk = driver.findElement(By.xpath("//span[text()='New Individual']"));
		driver.executeScript("arguments[0].click();", clk);
		driver.findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys("Kumars");
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		String message = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(message);
		if (message.contains("created")) {
			System.out.println("Individuals created" + message);
		} else
			System.out.println("Doesnt contains" + message);
	}
}
	