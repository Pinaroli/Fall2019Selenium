package com.automation.test.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.Callable;

public class BasicNavigation3 {
    public static void main(String[] args) throws Exception {
      WebDriverManager.chromedriver().setup();//we don't create it we just call it

     ChromeDriver driver=new ChromeDriver();
     driver.get("http://google.com");
     Thread.sleep(3000);
     driver.close();

    }
}