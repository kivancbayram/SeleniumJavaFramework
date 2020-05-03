package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPageObjects {
	
	// null vermesek te olur ancak verirsek bosu bosuna memoryi mesgul etmis olmay�z
	WebDriver driver = null;
	
	//By bir class oldugu icin objelerimizi asag�daki gibi olusturabiliyoruz
	By textbox_search = By.name("q");
	
	By button_search = By.name("btnK");
	
	//constructor methodu olustural�m driver icin
	
	public GoogleSearchPageObjects(WebDriver driver) {
		
		this.driver = driver;
		
	}
	// asag�daki class ana test class�m�zdan yaz�lan� gidip searchbox a yazd�racak
	public void setTextInSearchBox(String text) {
		
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	// Keys
	public void clickSearchButton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
	
	public void WaitFor(int time) throws InterruptedException {
		
		Thread.sleep(time);
	}
}
