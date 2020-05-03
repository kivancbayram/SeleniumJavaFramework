package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import pages.GoogleSearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearchPom {

	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		googleSearch();
	}
	
	public static void googleSearch() throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path :"+projectPath);
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		
		//go to google.com
		driver.get("https://www.google.com/");
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		Thread.sleep(2000);
		//enter text in search textbox
		//driver.findElement(By.name("q")).sendKeys("Best Test Automation Programming Language");
		
		Thread.sleep(2000);
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		Thread.sleep(5000);
		//close browser
		driver.close();
		Thread.sleep(2000);
		
		System.out.println("Test completed successfully");
	}
}
