package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel 
	{
		public WebDriver driver;
		@Parameters({"browser"})
		@Test
		public void test1(String browser) throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			
			if(browser.equals("firefox"))
			{
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("http://www.facebook.com");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9731454448");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("saranya89*");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@name='login']")).click();
			}
			else
			{
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://www.facebook.com");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9731454448");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("saranya89*");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@name='login']")).click();
			}
			}
				
		
		{
		
		
	}

}
