package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo1 {
	
	@Test(priority=1)
	public void test1()
	{
Reporter.log("1", true);
}
	@Test(invocationCount=2)
	public void test2()
	{
Reporter.log("sentitmes", true);
}
	/*@Test(priority=2)
	public void test3()
	{
Reporter.log("trash", true);
}*/
	/*@Test(enabled=false,priority=2)
	public void test3()
	{
Reporter.log("sentitmes", true);
}*/
	
	@Test(dependsOnMethods="test1")
	public void test4()
	{
Reporter.log("sentitmes", true);
}
}
