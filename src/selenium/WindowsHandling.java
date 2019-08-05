package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsHandling {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\java\\xpath\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
	
	driver.manage().window().maximize();
	String fId = driver.getWindowHandle();
	WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
	WebDriverWait wb = new WebDriverWait(driver,70);
	wb.until(ExpectedCondition.VisibilityOf(gmail));
	
	
	Actions ac = new Actions(driver);
	ac.contextClick(gmail).build().perform();
	Thread.sleep(2000);
	Robot v = new Robot();
	v.keyPress(KeyEvent.VK_DOWN);
	v.keyRelease(KeyEvent.VK_DOWN);

	v.keyPress(KeyEvent.VK_DOWN);
	v.keyRelease(KeyEvent.VK_DOWN);

	v.keyPress(KeyEvent.VK_ENTER);
	v.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	
	WebElement images = driver.findElement(By.xpath("//a[text()='Images']"));
Thread.sleep(2000);
ac.contextClick(images).build().perform();
Robot r = new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(3000);

Set<String> pid = driver.getWindowHandles();
for (String x : pid) {
	if (!x.equals(fId)) {
		driver.switchTo().window(x);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Mobile");
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);	
	} else {}}
WebElement search = driver.findElement(By.className("q"));
search.sendKeys("Mobile");
driver.close();

String Gmail = driver.getTitle();
String Fid = driver.getWindowHandle();
WebElement gs = driver.findElement(By.xpath(("//a[@class='h-c-header__nav-li-link '])[4])")));
ac.contextClick(gmail).build().perform();
Thread.sleep(2000);
Robot p = new Robot();
p.keyPress(KeyEvent.VK_DOWN);
p.keyRelease(KeyEvent.VK_DOWN);

p.keyPress(KeyEvent.VK_DOWN);
p.keyRelease(KeyEvent.VK_DOWN);

p.keyPress(KeyEvent.VK_ENTER);
p.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(3000);


}}

