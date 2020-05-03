package test;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import pages.GoogleSearchPage;
import pages.GoogleSearchPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPageTest {

	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		googleSearchTest();
		
		
	}
	
	public static void googleSearchTest() throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		
		System.out.println("Project path :"+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();		
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		
		driver.get("https://www.google.com/");
		
		searchPageObj.WaitFor(4000);
		
		searchPageObj.setTextInSearchBox("A B C D");
		
		searchPageObj.WaitFor(4000);		
		
		searchPageObj.clickSearchButton();
		
		searchPageObj.WaitFor(4000);
		
		driver.close();
		
		
	
	}
	
}
