import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions a=new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"))).build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("bala").doubleClick().build().perform();
		a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"))).contextClick().build().perform();
		
	}

}
