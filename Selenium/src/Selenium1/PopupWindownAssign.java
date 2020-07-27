package Selenium1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindownAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\seleniumjars\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement e2=driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div[1]/div[1]/ul/li[1]/a/img"));
	 js.executeScript("arguments[0].click();", e2);		
	 String parent=driver.getWindowHandle();
	 
	 	Set<String> allwndIds=driver.getWindowHandles();
	// 	Iterator<String> idInOrder=allwndIds.iterator();
	 	for(String winHandle : allwndIds){
	 		
			   if (driver.switchTo().window(winHandle).getTitle().equals("Cognizant Jobs - Career Opportunities in Cognizant - Naukri.com")) {
				   driver.findElement(By.xpath("//*[@id=\"search_bar\"]/div/main/div/div/form/fieldset/p[12]/input[2]")).click();
			     
			   } 
			   else {
			      driver.switchTo().window(parent);
			   } 

	 	
	 	//driver.switchTo().window(parent);

	}
	}

}
