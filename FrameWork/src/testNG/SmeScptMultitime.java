package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SmeScptMultitime {
	@Test(invocationCount =3,priority = 1)
	public void test1()
	{
		Reporter.log("hello", true);
	}
	@Test
	public void test2()
	{
		Reporter.log("world", true);
	}

}
