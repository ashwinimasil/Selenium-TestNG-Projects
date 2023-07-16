package week6;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import week5.testng.Day1.RetryFailedTests;

		public class CreateLead extends Baseclass{

		@BeforeTest
		public void setValues() {
			excelFileName = "CreateLead";
		}
		
		

		@Test(dataProvider = "sendData")
		public void runCreateLead(String cName,String FName,String LName, String phno) {
			
		driver.findElement(By.linkText("Leads1")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
}


 /* 
 *  String[][] data = new
 * String [2][4]; //1setdata data[0][0] = "CTS"; data[0][1] ="Ashwini";
 * data[0][2]="Masil"; data[0][3]="44";
 * 
 * //2setdata data[1][0] = "TCS"; data[1][1] ="Ramya"; data[1][2]="Masil";
 * data[1][3]="91"; return data; }
 */


}
