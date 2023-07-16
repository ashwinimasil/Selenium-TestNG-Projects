package week3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonMobilePrices {
public static void main(String[] args) {
	//WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile",Keys.ENTER);
	List<WebElement> prices = driver.findElements(By.className("a-price-whole"));
	List<Integer> list = new ArrayList();
	for (WebElement mymatch: prices) {
		String Mytext = mymatch.getText();
		System.out.println(Mytext);
		String replacedtext = Mytext.replaceAll(","," ");
		if(!replacedtext.isEmpty()) 
		{
			int pricevalues = Integer.parseInt(replacedtext);
			list.add(pricevalues);
		}
		}
Collections.sort(list);
System.out.println("Least price" +list.get(0));
}
}
