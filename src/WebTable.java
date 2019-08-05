import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void getData(String value) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\java\\xpath\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
Thread.sleep(2000);
		/*
		 * WebElement table = driver.findElement(By.tagName("Table")); List<WebElement>
		 * trow = table.findElements(By.tagName("tr")); WebElement row = trow.get(5);
		 */
/*for(WebElement xRow : trow) {
if (xRow.getText().contains("Burj Khalifa")) {
*/
	/*List<WebElement> tdata = row.findElements(By.tagName("td"));
	for (WebElement xCell : tdata) {
		String text = xCell.getText();
		System.out.println(text);
		
	
}}

	private static void webtable1(int i) {
		// TODO Auto-generated method stub
		
	}}
*/

WebElement table = driver.findElement(By.tagName("table"));
List<WebElement> trow = table.findElements(By.tagName("tr"));
for (int i=0; i<trow.size(); i++) {
	List<WebElement>thead=trow.get(i).findElements(By.tagName("th"));
	for (int j = 0; j < thead.size(); j++) {
		String text = thead.get(j).getText();
		System.out.println("row" +i+"cell" + j + text);
		if (text.equals(value)) {
			List<WebElement> tdata = trow.get(i).findElements(By.tagName("td"));
			for (WebElement xdata : tdata) {
				System.out.println("row" + i + xdata.getText());
				}}}}}
public static void main(String[] args) throws InterruptedException {
	getData("Taipei 101");
	}}
	