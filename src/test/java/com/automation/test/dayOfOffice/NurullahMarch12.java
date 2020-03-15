package com.automation.test.dayOfOffice;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class NurullahMarch12 {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

      //click on Youtube
  driver.findElement(By.xpath("//*[@id='social_block']/ul/li[3]/a")).click();

  //we need to get windowId for using iteration
  Set<String> windowsId=driver.getWindowHandles();
  Iterator<String> iterator =windowsId.iterator();

  String parentId=iterator.next();
  String childId=iterator.next();
  //switch the youtube window
  driver.switchTo().window(childId);

        BrowserUtils.wait(2);
        driver.close();
        //switch to parent application window
        driver.switchTo().window(parentId);
        BrowserUtils.wait(2);

        //click on women link
        driver.findElement(By.xpath("//*[@id='footer']/div/section[2]/div/div/ul/li/a")).click();
 }
}
