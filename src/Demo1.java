import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Sarva\\Downloads\\IEDriverServer_x64_3.141.59\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());

		
	}

}
