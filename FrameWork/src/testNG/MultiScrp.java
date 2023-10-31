package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultiScrp {
@Test
public void test1() throws Exception {
	Reporter.log("hello",true);
}
@Test
public void test2() throws Exception {
	Reporter.log("world",true);
}

}
