package week5.testng.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class UpdateExistingIncident extends IncidentLoginInfo {
	@Test
	public static void updateexisting() {
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(30);

		WebElement search = shadow.findElementByXPath("//input[@id='sncwsgs-typeahead-input']");
		Actions actions = new Actions(driver);
		actions.moveToElement(search).sendKeys("incidentnumber").perform();
		// sendKeys(incidentnumber,Keys.ENTER);
		shadow.setImplicitWait(30);
		driver.findElement(By.xpath(null));
		shadow.findElementByXPath("(//span[@text()='Go to list view'])[1]").click();

	}
}
