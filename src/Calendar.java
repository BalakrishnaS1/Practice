import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		// To open the date dialog
		driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).click();

		// March 5
		while (!driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText().contains("May")) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		}

		// To get the dates from the calendar
		// List<WebElement> dates=
		// driver.findElements(By.cssSelector("a.ui-state-default"));
		// We need the particular date, so put it in loop

		int count = driver.findElements(By.cssSelector("a.ui-state-default")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.cssSelector("a.ui-state-default")).get(i).getText();
			if (text.equalsIgnoreCase("5")) {
				driver.findElements(By.cssSelector("a.ui-state-default")).get(i).click();
				break;
			}
		}

	}

}
