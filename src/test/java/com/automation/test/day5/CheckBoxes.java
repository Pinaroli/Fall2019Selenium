package com.automation.test.day5;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        List<WebElement> checkBoxes=driver.findElements(By.tagName("input"));

        checkBoxes.get(0).click();
        BrowserUtils.wait(2);

        //go over collection of checkboxes
        for (int i = 0; i <checkBoxes.size() ; i++) {


//            if visible,                         eligible to click       and    not click yet
       if(checkBoxes.get(1).isDisplayed() && checkBoxes.get(1).isEnabled() && (!checkBoxes.get(1).isSelected())){
           //if checkbox is not selected click on it
        checkBoxes.get(1).click();//click on the checkbox
           System.out.println((i+1) +" checkbox is clicked");

       } else{
           System.out.println((i+1) +" checkbox wasn't clicked");
      }

    }
        BrowserUtils.wait(2);




driver.quit();


    }
}
