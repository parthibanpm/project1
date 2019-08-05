package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

public static void automationPractice1() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\java\\xpath\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

Thread.sleep(3000);


WebElement email = driver.findElement(By.xpath("//input[contains(@id,'email_create')]"));
email.sendKeys("pppppp@gmail.com");

WebElement createButton = driver.findElement(By.id("SubmitCreate"));
createButton.click();

Thread.sleep(8000);

WebElement firstName = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
firstName.sendKeys("parthiban");

WebElement lastName = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
lastName.sendKeys("pm");

WebElement passWord = driver.findElement(By.id("passwd"));
passWord.sendKeys("121291");

WebElement day = driver.findElement(By.id("days"));
Select daydd = new Select(day);
daydd.selectByIndex(27);

WebElement month = driver.findElement(By.id("months"));
Select monthdd = new Select(month);
monthdd.selectByValue("11");

WebElement year = driver.findElement(By.id("years"));
Select yeardd = new Select(year);
yeardd.selectByVisibleText("1992  ");

WebElement company = driver.findElement(By.id("company"));
company.sendKeys("Green Technology");

WebElement address1 = driver.findElement(By.id("address1"));
address1.sendKeys("4/96");

WebElement address2 = driver.findElement(By.id("address2"));
address2.sendKeys("ss colony");

WebElement city = driver.findElement(By.id("city"));
city.sendKeys("dumalpet");

WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
Select statedd = new Select(state);
statedd.selectByVisibleText("Tennesse");

WebElement zip = driver.findElement(By.id("postcode"));
zip.sendKeys("00001");

WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
Select countrydd = new Select(country);
countrydd.selectByIndex(1);


WebElement mobile = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
mobile.sendKeys("9715233521");

WebElement futurerefer = driver.findElement(By.id("alias"));
futurerefer.sendKeys("srirama home");

Thread.sleep(3000);
WebElement registerbutton = driver.findElement(By.id("submitAccount"));
registerbutton.click();

//Thread.sleep(3000);
//driver.quit();
}


public static void main(String[] args) throws InterruptedException {
automationPractice1();
}
}