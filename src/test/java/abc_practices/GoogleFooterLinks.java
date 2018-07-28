package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleFooterLinks {

	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakib\\workspace\\WebAutomation1004\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://Google.com");
		
		driver.findElement(By.xpath("//*[@id=\"fsr\"]/a[1]")).click();
		String url = "https://youtu.be/ggoJFaE71W8";
		driver.get(url);
		driver.get("http://Google.com");
		
		
		
	}

}
