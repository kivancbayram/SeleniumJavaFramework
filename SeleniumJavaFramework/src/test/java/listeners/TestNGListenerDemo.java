package listeners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {
	
	@Test
	public void test1() {
		System.out.println("I am inside Test 1");
	}
	
	@Test
	public void test2() throws InterruptedException {
		System.out.println("I am inside Test 2");
		String projectPath = System.getProperty("user.dir");
		
		System.out.println("Project path :"+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Best Test Automation Programming Language");
	// alttaki satýr ozellikle fail etsin diye boyle bir name yok
		
		Thread.sleep(4000);
		//driver.findElement(By.name("qsadfsaf")).sendKeys("Best Test Automation Programming Language");
		
		driver.close();
		
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside Test 3");
		throw new SkipException("This test is skipped");
	}

	
}
