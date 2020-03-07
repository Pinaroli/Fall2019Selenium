package com.automation.test.day4;

import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class DenemeOfWarmUp {

    public static void main(String[] args) throws Exception {

        //WebDriver driver=DriverFactory.createDriver("chrome");
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        Thread.sleep(3000);
        driver.findElement(By.id("disappearing_button")).click();
        Thread.sleep(2000);

        if(driver.findElements(By.id("disappearing_button")).size()==0){
            System.out.println("test passed");
        }  else{
            System.out.println("test failed");
        }
         Thread.sleep(2000);
        List<WebElement> buttons= driver.findElements(By.tagName("button"));
        for(WebElement button:buttons){
            button.click();
            Thread.sleep(2000);
        }

       driver.quit();
    }
}