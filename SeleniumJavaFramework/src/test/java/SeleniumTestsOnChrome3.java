import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTestsOnChrome3 {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path :"+projectPath);
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.selenium.dev/");
	}
	
}