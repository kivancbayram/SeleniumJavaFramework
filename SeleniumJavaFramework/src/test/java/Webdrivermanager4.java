import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdrivermanager4 {

		public static void main(String[] args) throws InterruptedException {
			//WebDriverManager.chromedriver().version("3.8.1").setup();
			String projectPath = System.getProperty("user.dir");
			System.out.println("Project path :"+projectPath);
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();
			
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://yandex.com.tr/");			
			
			//driver.findElement(By.id("text")).sendKeys("abcd");
			driver.findElement(By.xpath("//input[@id = 'text']")).sendKeys("abcd");
			
			//o sayfadki tum xpathleri yeani elementleri toplayýp bir liste olusturuyoruz
			java.util.List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
			//listedeki eleman sayýsý
			Thread.sleep(6000);
			int count = listOfInputElements.size();
			System.out.println("Element quantity : "+count);
			//WebElement textBox = driver.findElement(By.id("text"));
			//textBox.sendKeys("google");
			
			
			driver.close();
			//driver.quit();
		}
}
