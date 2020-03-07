package com.automation.test.dayOfOffice;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MiraOH2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://automationpractice.com");

        WebElement searchBox = driver.findElement(By.id("search_query_top"));
        searchBox.sendKeys("tshirts", Keys.ENTER);//we can put  + after"t-shirts" too
        Thread.sleep(3000);
        // System.out.println(driver.findElement(By.className("alert alert-warning")).getText());
        WebElement error = driver.findElement(By.xpath("//p[@class='alert alert-warning']"));
        String errorText = error.getText();
        System.out.println("errorText = " + errorText);
        //  String errorText= error.getText();
        //   System.out.println("Error message: "+errorText);
        //  NoSuchElementException:it means we could not locate the element
        searchBox = driver.findElement(By.id("search_query_top"));
        searchBox.clear();
        searchBox.sendKeys("t-shirt" + Keys.ENTER);
        WebElement productCount = driver.findElement(By.className("product-count"));
        System.out.println("product count: " + productCount.getText());


        /*
        <a class="button ajax_add_to_cart_button btn btn-default"
        href="http://automationpractice.com/index.php?controller=cart&amp;add=1&amp;id_product=1&amp;token=e817bb0705dd58da8db074c69f729fd8"
        rel="nofollow" title="Add to cart" data-id-product="1">
            <span>Add to cart</span>
        </a>
        a - link
        span - description
         */
        WebElement addToCart = driver.findElement(By.className("button ajax_add_to_cart_button btn btn-default"));
        addToCart.click();
//        driver.quit();
    }
}
