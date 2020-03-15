package com.automation.test.dayOfOffice;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class SwitchWindows01 {
    public static void main(String[] args) {
        WebDriver driver= DriverFactory.createDriver("chrome");
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        //simdi facebookun icerisindeki instegram bolumunu initiliazed yap
        driver.findElement(By.xpath("//*[@id='pageFooterChildren']/ul/li[14]/a")).click();

        //windowslardan birbirine gecis yapmam icin(iteration) bir tane windows Id olusturmam lazim
        Set<String> windowsId=driver.getWindowHandles();
        Iterator<String> iterator=windowsId.iterator();
        //ana sayfami ve child olusturmam lazim
        String anasayfa=iterator.next();
        String child=iterator.next();

        //simdi childa geciyorum
        driver.switchTo().window(child);
        BrowserUtils.wait(2);
        driver.close();

        //tekrar geri anasayfaya gel
        driver.switchTo().window(anasayfa);
        BrowserUtils.wait(2);

        BrowserUtils.wait(2);
        driver.close();
    }
}
