import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws AWTException{
		System.setProperty("webdriver.chrome.driver", "C:\\java\\xpath\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	    WebElement clickRight = driver.findElement(By.xpath("//a[text()='Images']"));
	    Actions ma=new Actions(driver);
	    ma.contextClick(clickRight).build().perform();
	    
	    //Keyboard Interation
	    //robot is a class from java.awt
	    
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    }}
