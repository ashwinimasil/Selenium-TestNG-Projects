package week5.testng.Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class AssigntheIncident extends IncidentLoginInfo {
	@Test
	public void assignIncident() throws InterruptedException {
		// search button
		Thread.sleep(5000);
		Shadow shadow = new Shadow(driver);
		WebElement search = shadow.findElementByXPath("//input[@id='sncwsgs-typeahead-input']");
		search.click();
		search.sendKeys("INC0010016", Keys.ENTER);
		// click on assignment button...
		shadow.setImplicitWait(20);
		WebElement openIncident = shadow.findElementByXPath("//div[text()='Number']");
		driver.executeScript("arguments[0].click();", openIncident);
		// openIncident.click();
		// next window
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> winlist = new ArrayList<>(windowhandles);
		driver.switchTo().window(winlist.get(1));
		// search software group
		driver.findElement(By.xpath("//*[contains(@id,'lookup.incident.assignment_group')]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'submit the search')]/following::input)[1]"))
				.sendKeys("software", Keys.ENTER);

		driver.findElement(By.xpath("//a[text()='Software']")).click();

		driver.switchTo().window(winlist.get(0));
		// update work notes
		driver.findElement(By.xpath("//*[contains(@id,'activity-stream-textarea')]")).sendKeys("NA");

	}
}
