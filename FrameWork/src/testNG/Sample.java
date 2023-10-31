package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void testName() throws Exception {
		
		{
			Reporter.log("hello",true);
		}

	}

}
