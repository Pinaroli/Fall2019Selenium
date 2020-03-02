package com.automation.test.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();

        driver.get("http://google.com");

        driver.manage().window().maximize();
        Thread.sleep(3000);
        String title=driver.getTitle();
        String expectedTitle="Google";
        System.out.println("Title is: "+title);
        if(expectedTitle.equals(title)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("Test failed");
        }

        driver.navigate().back();


    }
    //public static void verify
}
