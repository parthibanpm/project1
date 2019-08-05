package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover1 {
	public static void mouseAction() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\java\\xpath\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement hello =driver.findElement(By.id("nav-link-accountList"));
		WebElement signin =driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
		
		Actions Sa=new Actions(driver);
		Sa.moveToElement(hello).build().perform();
		Thread.sleep(3000);
		Sa.click(signin).build().perform();

		WebElement department=driver.findElement(By.id("nav-link-shopall"));
		
		Actions Sc=new Actions(driver);
		Sc.moveToElement(department).build().perform();
		
		
				
	}
	public static void main(String[] args) throws InterruptedException {
		mouseAction();
	}


}
