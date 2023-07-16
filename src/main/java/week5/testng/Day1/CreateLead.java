package week5.testng.Day1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends Baseclass {

	@BeforeTest
	public void setValues() {
		excelFileName = "CreateLead";

	}

	@Test(dataProvider = "sendData", retryAnalyzer = RetryFailedTests.class)
	public void CreateLeadTestng(String cName, String fName, String lName, String pNo) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyNam")).sendKeys(cName);// CompanyName misspelt for
																					// RetryAnalyser
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}
	}

}
