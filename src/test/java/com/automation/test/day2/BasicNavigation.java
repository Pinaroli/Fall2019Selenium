package com.automation.test.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {
        //to start selenium script we need:
        //setup webdriver(browser driver)
        WebDriverManager.chromedriver().setup();
        // ChromeDriver driver= new ChromeDriver();
        // RemoteWebDriver driver1=new SafariDriver();
        WebDriver driver=new ChromeDriver();
        driver.get("http:google.com");//for openning the website this is the key of the open the door of website
        Thread.sleep(6000);
        //method that return page title
        //you can also see as tab name,in the browser
        String title=driver.getTitle();//returns <title>some title</title> text
        String expectedTitle="Google";
        System.out.println("Title is ..."+title);
        if(expectedTitle.equals(title)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }


        //must be at the end
        driver.close();// to close browser without this method the browser can't close
        //this driver close method has to be end other than that we can't get the connect
    }
}
