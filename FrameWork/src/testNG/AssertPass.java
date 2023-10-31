package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertPass {
	@Test
	public void test1() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./sft/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	driver.findElement(By.name("username")).sendKeys("9731454448");
	driver.findElement(By.name("pwd")).sendKeys("saranya89");
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	Thread.sleep(2000);
	String title=driver.getTitle();
	Assert.assertEquals(title,"Facebook");
	System.out.println("1");


}
}
