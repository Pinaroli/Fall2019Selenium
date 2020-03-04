package com.automation.test.day3;

import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsPractice {
    public static void main(String[] args) throws InterruptedException {
   //     WebDriverManager.chromedriver().setup();
     //   WebDriver driver=new ChromeDriver();

     //   WebDriver driver2=DriverFactory.createADriver("chrome");
       // driver2.get("http://zara.com/us/");
       // Thread.sleep(2000);
       // List<WebElement> allLinks=driver2.findElements(By.tagName("a"));
       // System.out.println("amount of link "+allLinks.size());

        //        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        WebDriver driver = DriverFactory.createADriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullName = driver.findElement(By.name("full_name"));
        fullName.sendKeys("Mister Twister");

        Thread.sleep(2000);

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("sdet@cybertek.com");

        Thread.sleep(2000);

        WebElement signUp = driver.findElement(By.name("wooden_spoon"));
        //when you see type="submit", you can use submit() instead of click()
        //it make sense to use when click() method doesn't work
        signUp.submit();
        Thread.sleep(2000);

        String expected = "Thank you for signing up. Click the button below to return to the home page.";

        WebElement message = driver.findElement(By.className("subheader"));

        String actual = message.getText(); // To get the text <h3>Text</h3>

        if(expected.equals(actual)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        driver.quit();//to close everything
    }
}


