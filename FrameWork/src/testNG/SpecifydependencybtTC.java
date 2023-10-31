package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SpecifydependencybtTC {
	@Test 
	public void compose()
	
	{
		Reporter.log("compose", true);
	}
	@Test(dependsOnMethods="compose")
	public void SentItem()
	{
		Reporter.log("sent item",true);
		Assert.fail();
	}
	@Test(dependsOnMethods="sentitems")
	public void trash()
	{
		Reporter.log("trash", true);
	}

}
