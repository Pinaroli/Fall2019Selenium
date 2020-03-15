package com.automation.test.day2;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.WebDriver;

public class TryToOpenNewWindow {
    public static void main(String[] args) {
    WebDriver driver= DriverFactory.createDriver("chrome");
    driver.get("http://amazon.com");
    String windowHandle=driver.getWindowHandle();
   System.out.println("get window handle:  = " + driver.getWindowHandle());




 BrowserUtils.wait(2);
driver.quit();

 }
}
