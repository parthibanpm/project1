package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\java\\xpath\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement emailFeild = driver.findElement(By.id("email"));
		boolean displayed = emailFeild.isDisplayed();
		boolean enabled = emailFeild.isEnabled();
		if (displayed&&enabled) {
			emailFeild.clear();
			emailFeild.sendKeys("Hello");
			
		}
String attribute = emailFeild.getAttribute("Value");
System.out.println(attribute);
WebElement radioBtn = driver.findElement(By.xpath("//input[@value='1']"));
radioBtn.click();
boolean selected = radioBtn.isSelected();
System.out.println("Radio Button="+selected);
String text = driver.findElement(By.xpath("//div[@class='_5iyx']")).getText();
System.out.println("Get Text For Facebook Header"+ text);
WebElement mobFeild = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
String attribute2 = mobFeild.getAttribute("class");
mobFeild.getTagName();
System.out.println("Class attribute value="+attribute2);

WebElement month = driver.findElement(By.id("month"));
Select s = new Select(month);
WebElement firstSelectedOption = s.getFirstSelectedOption();
String beforeSelecting = firstSelectedOption.getText();
System.out.println("Before Selecting ="+beforeSelecting);
s.selectByValue("5");
WebElement firstSelectedOption2 = s.getFirstSelectedOption();
String afterSelectiong = firstSelectedOption2.getText();
System.out.println("After selecting"+afterSelectiong);
System.out.println("Options in Month Dropdown");
List<WebElement> options = s.getOptions();
for (int i = 0; i < options.size(); i++) {
	System.out.println(options.get(i).getText());
	
}}}