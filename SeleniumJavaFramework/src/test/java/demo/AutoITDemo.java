package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITDemo {
		
	
		public static void main(String[] args) throws Exception {
			test();
		}
		
	
		public static void test() throws Exception {
			
			String projectPath = System.getProperty("user.dir");
			System.out.println("Project path :"+projectPath);
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();
			
			//System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			
			driver.get("http://tinyupload.com/");
			
			Thread.sleep(4000);
			driver.findElement(By.name("uploaded_file")).click();
			
			Runtime.getRuntime().exec("D:\\FileUploadScript.exe"); // bu satýr AutoIT scriptini calýstýrmak icin
			
			Thread.sleep(3000);
			driver.close();
		}
	
}
