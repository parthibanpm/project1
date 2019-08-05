package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void threeAlerts() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\java\\xpath\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		

		WebElement a1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
		a1.click();
		Thread.sleep(1000);
		Alert a1Alert = driver.switchTo().alert();
		a1Alert.accept();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		WebElement a2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
		a2.click();
		Thread.sleep(1000);
		Alert a2Alert = driver.switchTo().alert();
		a2Alert.accept();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		WebElement a3 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
		a3.click();
		Thread.sleep(2000);
		Alert a3Alert = driver.switchTo().alert();
		a3Alert.sendKeys("muditu poo");
		a3Alert.accept();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
}
	public static void main(String[] args) throws InterruptedException {
		threeAlerts();
	}
}
