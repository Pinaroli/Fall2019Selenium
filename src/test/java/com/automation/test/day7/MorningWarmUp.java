package com.automation.test.day7;


import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;

public class MorningWarmUp {
    static WebDriver driver;
    public static void main(String[] args) {
ebayTest();
wikiTest();


    }
public static void ebayTest(){
        driver= DriverFactory.createDriver("chrome");
        driver.get("http://ebay.com");
        driver.findElement(By.id("gh-ac")).sendKeys("java book");
        driver.findElement(By.id("gh-btn")).click();


    WebElement searchResult=driver.findElement(By.tagName("h1"));
    System.out.println(searchResult.getText());
    String split=searchResult.getText().split(" ")[1];
    System.out.println("the specific elemenet print it out: "+split);


    BrowserUtils.wait(2);
   driver.close();
}
public static void wikiTest(){
    driver=DriverFactory.createDriver("chrome");
    driver.get("http://en.wikipedia.org/wiki/Main_Page");
    driver.findElement(By.id("searchInput")).sendKeys("Selenium(software)", Keys.ENTER);
    String link=driver.getCurrentUrl();
    if(link.endsWith("Selenium-Wikipedia")){
        System.out.println("passed");
    }else{
        System.out.println("failed");
    }
    driver.quit();
}

}
