import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkscountinapage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());

		// Links in a footer section

		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());

		// Links in one section of footer
		WebElement section1 = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(section1.findElements(By.tagName("a")).size());

		// click on each link in the section

		for (int i = 1; i < section1.findElements(By.tagName("a")).size(); i++) {

			String clickonlinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			section1.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(5000);
		}
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> it = windows.iterator();

			while (it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}

		}
	}


