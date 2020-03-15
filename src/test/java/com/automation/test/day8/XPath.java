package com.automation.test.day8;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XPath {
    public static void main(String[] args) {
        WebDriver driver= DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement btn1=driver.findElement(By.xpath("//button[@onclick='button1()']"));
        btn1.click();
         WebElement result=driver.findElement(By.id("result"));
        System.out.println(result.getText());

        BrowserUtils.wait(2);
        driver.quit();
    }
}
/**
 * Level of testing:
 * unit
 * integration
 * system
 * UAT
 * iN MY PROJECT, DEVELOPERS WERE FOLLOWING THIS FLOW:
 * developers they write a code-->unit tests to test their code-->code review-->
 * same thing as testers code review: code will go to github, new build can be deployed to the test env-->and here we do
 * functional testing(test the code compile it on not executing)
 *smoke test should be automatically if it could be manually? new funcionality deployed if you would doing user testing
 * ua testing.. without unit testing the application would be more fragile..
 * who writes unit test?For application code - developers.
 * Can I write some unit tests for my automation framework?yes
 *you have to use assertion for testing pass or not
 * */
