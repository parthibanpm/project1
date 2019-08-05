package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
public static void mouseAction () throws InterruptedException, IOException
{
	System.setProperty("webdriver.chrome.driver", "C:\\java\\xpath\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
	WebElement tshirt = driver.findElement(By.xpath("//a[text()='T-shirts']"));
	
	Actions ma = new Actions(driver);
	ma.moveToElement(women).build().perform();
	Thread.sleep(3000);
	ma.click(tshirt).build().perform();
	File des=new File ("C:\\java\\xpath\\ScreenShot\\text.png");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File ssrc = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(ssrc,des);
	
	
}
public static void main(String[] args) throws InterruptedException, IOException {
	mouseAction();

}}
