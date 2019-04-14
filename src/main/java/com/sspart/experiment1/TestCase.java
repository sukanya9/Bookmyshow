package com.sspart.experiment1;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.sspart.experiment.utils.AndroidUtils;
import com.sspart.experiment.utils.DriverUtils;

public class TestCase extends AndroidUtils {
@Test
public void test02() throws MalformedURLException, InterruptedException {
	initiateMobileDriver();
	mobileDriver.findElementById(props.getProperty("calculator.3.button")).click();
	mobileDriver.findElementById(props.getProperty("calculator.add.button")).click();
	mobileDriver.findElementById(props.getProperty("calculator.9.button")).click();
	mobileDriver.findElementById(props.getProperty("calculator.equal.button")).click();
	Thread.sleep(2000);
	quitMobileDriver();
	
	
}
}
