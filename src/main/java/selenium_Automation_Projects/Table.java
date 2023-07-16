package selenium_Automation_Projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int priceinteger;		
		String baseurl = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(baseurl);
		/* WebElement table =
		 driver.findElement(By.xpath("//table[@class='table-display']"));
		WebElement table = driver.findElement(By.xpath("//table[@class='table-display']"));
		/html/body/div[3]/div[1]/fieldset/table/tbody/tr[2]/td[3]
	/html/body/div[3]/div[2]/fieldset[2]/div[1]/table/tbody/tr[1]/td[3]
		//*[@id="product"]/tbody/tr[11]/td[3]*/
		
		WebElement table = driver.findElement(By.xpath("//body/div[3]/div[1]/fieldset/table/tbody"));
		List<WebElement> Tabletitle = table.findElements(By.xpath("//tr/th"));
		for (int i = 0; i < Tabletitle.size(); i++) {
			String Header = Tabletitle.get(i).getText();
			System.out.println(Header);
			if (Header.equalsIgnoreCase("price")) {
				break;
			}
		}
		List<WebElement> tableinfo = table.findElements(By.xpath("//tr/td"));
		for (int j = 0; j < tableinfo.size(); j++) {
			String tabledata = driver.findElements(By.xpath("//tr/td")).get(j).getText();
			System.out.println(tabledata);
			if (tabledata.equals("0")) {
				break;
			}
		}
		List <WebElement> pricesum = driver.findElements(By.xpath("//body/div[3]/div[1]/fieldset/table/tbody//tr/td[3]"));
		System.out.println("Total size of the table"+ pricesum.size());
		int total=0;
		for (int k=0;k < pricesum.size();k++) {
			String pricetext = table.findElements(By.xpath("//tr/td[3]")).get(k).getText();
			priceinteger = Integer.parseInt(pricetext);
			total = total+priceinteger; 
		}
		System.out.println("Final Total:"+total);
		}
	
	}
