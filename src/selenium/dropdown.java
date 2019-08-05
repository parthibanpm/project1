package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void chromeBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\java\\xpath\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		WebElement emailField=driver.findElement(By.id("email_create"));
		emailField.sendKeys("paaarrrttt123@gmail.com");
		WebElement D = driver.findElement(By.name("SubmitCreate"));
		D.click();
		Thread.sleep(8000);
	   WebElement fn = driver.findElement(By.name("customer_firstname"));
		fn.sendKeys("Parthiban");
		WebElement ln = driver.findElement(By.name("customer_lastname"));
		ln.sendKeys("P M");
		WebElement p = driver.findElement(By.id("passwd"));
		p.sendKeys("123456789");
		WebElement day = driver.findElement(By.id("days"));
		Select day1= new Select(day);
		day1.selectByIndex(27);
		WebElement month = driver.findElement(By.id("months"));
		Select month1= new Select(month);
		month1.selectByValue("11");
		WebElement year = driver.findElement(By.id("years"));
		Select year1= new Select(year);
		year1.selectByVisibleText("1992  ");
			
	}
	public static void main(String[] args) throws InterruptedException {
		chromeBrowser();
	}}
