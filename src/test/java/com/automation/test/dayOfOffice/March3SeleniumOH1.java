package com.automation.test.dayOfOffice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class March3SeleniumOH1 {
    public static void main(String[] args) throws InterruptedException {
        /**Iterator:
         * -Lis, Set, Map, and other types of collections can use Iterator class to itarete over that collection
         * -List has indexes(for i, for each, while, Iterator)
         * -Map(for each, Iterator-to loop through keys)
         * Basic Selenium Navigation
         */
//create arrayList of String and iterate over it
        List<String> keyToResearch=new ArrayList<>(Arrays.asList());
        keyToResearch.add("fruits");
        keyToResearch.addAll(Arrays.asList("veggies","berries"));
        Iterator iterator=keyToResearch.iterator();
        //iterator()-return Iterator type which we can use with all iterator methods
        //we are checking the items with while->hasNext() methods
        //we are expecting fruits, next veggies, next berries and while loop will be done
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //print before modification and add * to each string and print again
       Iterator<String> iterator2=keyToResearch.iterator();
        while (iterator2.hasNext()){
            String item=iterator2.next();
            System.out.println(item);
            System.out.println("*" + item);
       }
        //create a map with <String, String>
        HashMap<String,String> personalInfo=new HashMap<>();
        personalInfo.put("name: ","Bryan");
        personalInfo.put("student _id","234566788");
        personalInfo.put("major","computer science");
        Iterator<String> mapIterator=personalInfo.keySet().iterator();
        while(mapIterator.hasNext()){
            String key=mapIterator.next();
            System.out.println(key+" : "+personalInfo.get(key));
        }
        //Selenium:
        /**
         * 1. id-unique(it is not always available)
         * 2. Class Name
         * 3. Tag Name :input,div,style..->everything with purple color is a tag
         * 4. Name
         * 5. Link Text
         * 6. Partial Link Test
         * locator that is using html(syntax)
         * 7. XPath
         * 8. CSS
         * <input id="global-enhancements-search-query" data-id="search-query"
         * data-global-enhancements-search-input="" type="text" name="arama yap"
         * class="wt-input wt-input-btn-group__input global-enhancements-search-input-btn-group__input
         * wt-pr-xs-7" placeholder="Search for items or shops" value="" autocomplete="off" autocorrect="off"
         * autocapitalize="off">
         * input->tag
         * key="value" - attributes
         * key is: id="global-enhancements-search-query"  -one of the attributes
         * we can use id for locating the element
         *   name="arama yap" -attribute we can use name to locate the element
         *  class="wt-input wt-input-btn-group__input global-enhancements-search-input-btn-group__input
         *          * wt-pr-xs-7" -we can use class to locate element
         * id-always unique
         * name,tag,class-are not unique very often
         * so how we find the element?
         */
        WebDriverManager.chromedriver().setup();//we don't create it we just call it

        ChromeDriver driver=new ChromeDriver();
        driver.get("http://etsy.com");
        WebElement searchBar= driver.findElement(By.id("global-enhancements-search-query"));
        //findElement() -> returns WebElement
        //as param we put By.locator(id,name,classname,class,.....)
    }
}
