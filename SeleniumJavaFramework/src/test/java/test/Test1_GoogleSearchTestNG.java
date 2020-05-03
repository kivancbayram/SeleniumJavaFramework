package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1_GoogleSearchTestNG {
	
		public static String browserName=null;
		WebDriver driver = null;
	@BeforeTest	
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		
		
	}
	
	@Test
	public void googleSearch() throws InterruptedException {
		

		
		//go to google.com
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Best Test Automation Programming Language");
		Thread.sleep(2000);
		
		//click on search button
		driver.findElement(By.name("btnK")).click();

	}
	
	@AfterTest
	public void tearDownTest() throws InterruptedException {
		
		Thread.sleep(5000);
		//close browser
		driver.close();
		Thread.sleep(2000);
		
		System.out.println("Test completed successfully");
	}
}
