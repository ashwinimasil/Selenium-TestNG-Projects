package week5.testng.Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.sukgu.Shadow;

public class NewIncident extends IncidentLoginInfo {
	public String attribute;

	@Test
	public void newincident() throws InterruptedException {
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(40);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.setImplicitWait(5);
		shadow.findElementByXPath("//input[@id='filter']").click();
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Create New");

		System.out.println("Create New typed");
		Thread.sleep(5000);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.findElementByXPath("//mark[text()='Create New']").click();
		// get insitance number

		// click on caller search
		WebElement caller = shadow.findElementByXPath("//iframe[@id='gsft_main']");

		driver.switchTo().frame(caller);
		WebElement callersearch = driver.findElement(
				By.xpath("//span[@class='icon icon-search']/preceding::button[@id='lookup.incident.caller_id']"));
		driver.executeScript("arguments[0].click();", callersearch);
		Set<String> handles = driver.getWindowHandles();
		List<String> arraylist = new ArrayList<>(handles);
		driver.switchTo().window(arraylist.get(1));
		// click on Abel Tuter
		driver.findElement(By.xpath("//a[text()='Abel Tuter']")).click();
		driver.switchTo().window(arraylist.get(0));
		Thread.sleep(6000);
		// Short Description
		WebElement shortDesc = shadow.findElementByXPath("//input[@id='incident.short_description']");
		shortDesc.sendKeys("NA");
		attribute = driver.findElement(By.id("incident.number")).getAttribute("value");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		System.out.println(attribute);
		shadow.findElementByXPath("//input[@id='sncwsgs-typeahead-input']").sendKeys(attribute, Keys.ENTER);
	}
}
