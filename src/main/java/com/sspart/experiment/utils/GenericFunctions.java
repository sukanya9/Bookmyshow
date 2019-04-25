package com.sspart.experiment.utils;

import org.openqa.selenium.By;
//import com.sspart.experiment.utils.DriverUtils;
import org.openqa.selenium.WebElement;
import static com.sspart.experiment.utils.DriverUtils.*;

public class GenericFunctions {
public static void click(String locator) {
	getDriver().findElement(By.xpath(getProp(locator))).click();
}
public static void click(String xpath, String desc) {
	getDriver().findElement(By.xpath(xpath)).click();
}
public static void click(WebElement element,String desc) {
	element.click();
}
}
