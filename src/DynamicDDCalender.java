import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDDCalender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
	/*	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);;
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		*/
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']")).click();

		WebElement month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));

		while(!month.getText().contains("February")) {

		driver.findElement(By.xpath("//a[@title='Next']")).click();

		}

		List<WebElement> element = driver.findElements(By.cssSelector("div[class='ui-datepicker-group ui-datepicker-group-last']"));

		int datesCount= driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[@class='ui-state-default'][contains(text(),'14')]")).size();

		for(int i=0;i<datesCount;i++)

		{

		String date =driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[@class='ui-state-default'][contains(text(),'14')]")).get(i).getText();
		System.out.println(date);
/*		if(date.equalsIgnoreCase("14"))

		{

		driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[@class='ui-state-default'][contains(text(),'14')]")).get(i).click();

		System.out.println(date);

		break;*/

		}		
		
	}

	}
