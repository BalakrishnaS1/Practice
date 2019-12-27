import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoSuggestiveDD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(2000);
		WebElement source=driver.findElement(By.id("fromCity"));
		source.sendKeys("BLR");
		source.sendKeys(Keys.ENTER);
		//input[@placeholder='From']
		WebElement dest=driver.findElement(By.id("toCity"));
		dest.sendKeys("CHE");
		dest.sendKeys(Keys.ARROW_DOWN);
		dest.sendKeys(Keys.ENTER);
		
	}

}
