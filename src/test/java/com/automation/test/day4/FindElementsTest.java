package com.automation.test.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsTest {
    public static void main(String[] args) throws InterruptedException {
        //we can skip some of them like we can do instead of ++ we can do x+=1 x+=2

        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        Thread.sleep(3000);

        //how to collect all links from the page?
        List<WebElement> links = driver.findElements(By.tagName("a"));



        for(WebElement link: links){
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
            System.out.println();
            // link.click();
            //Thread.sleep(2000);
            //driver.navigate().back();   It didn't work try fori loop
        }

        for(int i=1; i < links.size(); i++){
            links.get(i).click();
//            Thread.sleep(2000);

            driver.navigate().back();

//            Thread.sleep(2000);
            //refresh list we found them but we never initiliazed them so we need links=tagname
            //you have to find it first !! for using go to the link find the element go back again again
            //do debug
            links = driver.findElements(By.tagName("a"));
        }



        driver.quit();
    }
}
