package com.automation.test.day3;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinElements2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= DriverFactory.createDriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullName=driver.findElement(By.name("full_name"));
        fullName.sendKeys("Mister Twister");
        Thread.sleep(2000);

        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("sdet@cybertek.com");
        Thread.sleep(2000);

        WebElement signUp=driver.findElement(By.name("wooden_spoon"));
        signUp.click(); //signUp.submit()->the same task,if it doesn't work use submit
        Thread.sleep(2000);

        String expected= "Thank you for signing up .Sign up for our mailing list here.";
        WebElement message=driver.findElement(By.className("subheader"));

        String actual=message.getText();
        if(expected.equals(actual)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED!");
        }

        //driver.close();
          driver.quit();

    }
}
