package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\java\\xpath\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	driver.manage().window().maximize();
	WebElement selectOption = driver.findElement(By.id("multi-select"));
	Select s=new Select (selectOption);
	boolean multiple=s.isMultiple();
	if (multiple) {
		s.selectByVisibleText("California");
		s.selectByValue("New Jersy");
		s.selectByIndex(3);
		List<WebElement> all = s.getAllSelectedOptions();
		for (int i = 0; i < all.size(); i++) {
			System.out.println(all.get(i).getText());
		
			}
		Thread.sleep(10000);
		s.deselectByVisibleText("California");
		s.deselectAll();
	}
	
		
	
	
}
}
