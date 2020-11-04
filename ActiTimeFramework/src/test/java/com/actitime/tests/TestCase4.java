package com.actitime.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase4 {
	@Test
	public void demoM()
	{
		Assert.fail();
		Reporter.log("execute test case 1",true);
	}
}
