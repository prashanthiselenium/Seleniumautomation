package Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BbcLink {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\seleniumjars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		driver.manage().window().maximize();
				List<WebElement> links=driver.findElements(By.tagName("a"));
				
				System.out.println(links.size());
				  for (int i =0; i<links.size(); i++)
				 {
					  System.out.println(links.get(i).getText());
				  System.out.println(links.get(i).getAttribute("href"));//{to get the links}
				  }
	}
}
	
				  
