package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mavenexec 
{
	@Test
	public void testName() throws Exception {
		
		{
			Reporter.log("hello",true);
		}

	}


}
