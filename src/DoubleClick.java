import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\java\\xpath\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://artoftesting.com/sampleSiteForSelenium.html");
	driver.manage().window().maximize();
WebElement txtBox = driver.findElement(By.id("fname"));
WebElement submit = driver.findElement(By.id("idOfButton"));
WebElement dclick = driver.findElement(By.id("dblClkBtn"));
Actions ma = new Actions(driver);
ma.sendKeys(txtBox,"asdfgh").build().perform();
Thread.sleep(2000);
ma.click(submit).build().perform();
Thread.sleep(2000);
ma.doubleClick(dclick).build().perform();

}
	
	

}
