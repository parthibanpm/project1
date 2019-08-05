package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	public static void chromeBrowser() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\java\\xpath\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com/");
driver.manage().window().maximize();
/*
Thread.sleep(4000);
driver.navigate().to("https://www.google.com/");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
String t = driver.getTitle();
System.out.println(t);
String c = driver.getCurrentUrl();
System.out.println(c);
driver.quit();

WebElement f = driver.findElement(By.id("email"));
f.sendKeys("sjhj.@gmail.com");
WebElement fg = driver.findElement(By.name("pass"));
fg.sendKeys("qwerty");
WebElement fe = driver.findElement(By.xpath("//input[@value='Log In']"));
fe.click();
//span[contains(@class,'border')]
 * (//span[@class='nav-line-2'])[4]
 * (//span[@class='nav-line-2'])[1]
*/
	}
	public static void main(String[] args) throws InterruptedException {
		chromeBrowser();
	}

}
