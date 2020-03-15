package com.automation.test.day5;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxesTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver =new ChromeDriver();
        //verify that 1st checkbox is not selected and 2nd is selected

        driver.get("http://practice.cybertekschool.com/checkboxes");
        //<form id="checkboxes">
        //    <input type="checkbox" checked=""> checkbox 1<br>
        //    <input type="checkbox" checked=""> checkbox 2
        //  </form>
        List<WebElement>checkbox= driver.findElements(By.tagName("input"));
        BrowserUtils.wait(2);

        if((!checkbox.get(0).isSelected()) && checkbox.get(1).isSelected()){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        BrowserUtils.wait(2);
        //let's click on the first checkbox and verify it's clicked
      //  checkbox.get(0).click();
        WebElement firstCheckBox=checkbox.get(0);
        firstCheckBox.click();//click on it

        if(firstCheckBox.isSelected()){
            System.out.println("Test Passed");
            System.out.println("checkbox  #1 is selected");

        }else{
            System.out.println("Test Failed");
            System.out.println("checkbox  #1 is not selected!");
        }
driver.quit();

    }
}
