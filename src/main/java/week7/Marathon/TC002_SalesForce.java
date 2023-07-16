package week7.Marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC002_SalesForce extends Parentclass {
	@BeforeTest
	public void setValues() {
		excelFileName = "KeyDeals";
	}

	@Test(dataProvider ="sendData")
	public void salesButtonclick(String questions, String details) throws InterruptedException {

		// sales button in new window
		// sales button in new window
		/*Set<String> windowHandles = driver.getWindowHandles();
		List<String> winList = new ArrayList<>(windowHandles);
		System.out.println(windowHandles.size());
		driver.switchTo().defaultContent();
		System.out.println("Window handled");
		WebElement toggle2 = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		toggle2.click();
		// Enter Content
		
		// driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("Content");*/
		System.out.println("contd");
		WebElement Content = driver.findElement(By.xpath("//p[text()='Content']"));
		Content.click();
		//driver.executeScript("arguments[0].click();", Content);
		// click Chatter
		WebElement Chatter = driver.findElement(By.xpath("//span[text()='Chatter']"));
		driver.executeScript("arguments[0].click();", Chatter);
		
		System.out.println(driver.getTitle());

		// questions tab
		driver.findElement(By.xpath("//span[text()='Question']")).click();
		// Enter the question
		driver.findElement(By.xpath("//textarea[@class='cuf-questionTitleField textarea']")).sendKeys(questions);// from
																													// xl
		// Enter the details
		driver.findElement(By.xpath(
				"//div[@class='ql-editor ql-blank slds-rich-text-area__content slds-text-color_weak slds-grow']"))
				.sendKeys(details);

		// click Ask
		driver.findElement(By.xpath("//button[text()='Ask']")).click();
		Thread.sleep(4000);
		// verify q & A
		String q = driver.findElement(By.xpath("//div[@class='cuf-body cuf-questionTitle forceChatterFeedBodyQuestionWithoutAnswer']")).getText();
		String a = driver.findElement(By.xpath("//div[@class='cuf-feedBodyText forceChatterMessageSegments forceChatterFeedBodyText']")).getText();
		System.out.println(q+a);
		//

	}
}