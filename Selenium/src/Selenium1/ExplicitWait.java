package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\seleniumjars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_TG_D']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ContentHolder_lbModels_11_D']")));
		WebElement e1=	driver.findElement(By.xpath("//*[@id='ContentHolder_lbModels_11_D']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", e1);		
		WebElement e2=driver.findElement(By.xpath("//*[@id='ContentHolder_lbFeatures_Bluetooth_D']"));
		 js.executeScript("arguments[0].click();", e2);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ContentHolder_lbModels_12_D']")));
		WebElement e3=driver.findElement(By.xpath("//*[@id='ContentHolder_lbModels_12_D']"));
	 js.executeScript("arguments[0].click();", e3);	
		System.out.println("Done");
		


	}

}
