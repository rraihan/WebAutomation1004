package abc_practices;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleFooterLinks {

	public static void main(String[] args) throws InterruptedException  {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakib\\workspace\\WebAutomation1004\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://Google.com");
		Thread.sleep(2000);
		//driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		driver.findElement(By.linkText("Privacy")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		if (driver.getPageSource().contains("Privacy"))
		    System.out.println(" Privacy HyperLink Test Passed");
		else
			System.out.println("Privacy Test Failed");
		
		Assert.assertEquals(true,driver.getPageSource().contains("Privacy"));
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println();
		driver.findElement(By.linkText("Terms")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		if (driver.getPageSource().contains("Terms"))
		    System.out.println("Terms HyperLink Test Passed");
		else
			System.out.println("Terms HyperLink Test Failed");
		Assert.assertEquals(true, driver.getPageSource().contains("Terms"));
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println();
		
				
		driver.findElement(By.linkText("Settings")).click();
		System.out.println(driver.getTitle());
		
		
		if(driver.getPageSource().contains("Settings"))
			System.out.println("Setting HyperLink Test Passed.");
		else
			System.out.println("Setting HyperLink Test Failed.");
		Assert.assertEquals(true, driver.getPageSource().contains("Settings" ));
		
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		/*driver.findElement(By.xpath("//*[@id=\"fsr\"]/a[1]")).click();
		String url = "https://youtu.be/ggoJFaE71W8";
		driver.get(url);
		driver.get("http://Google.com");
		*/
		
			
		
		
		
		
		
		
		
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"fsr\"]/a[1]")).click();
		//String url = "https://youtu.be/ggoJFaE71W8";
		
		//driver.get(url);
		//System.out.println("Bellow is the link for the privecy video");
		//*[@id="yDmH0d"]
		//System.out.println(driver.getCurrentUrl());
		
		
		
	
		
		
	}

	

}
