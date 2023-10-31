package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunnerScrpit extends GenericClass
{
	@Test
	public void validLogin() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		
		
	}

}
