package com.automation.test.day7;

public class ClassReview {
    public static void main(String[] args) {
        /**
         * LinkText:
         * <a href="http://google.com">Link text</a>
         * when you used it you can mention whole of the link
         * partialLinkText:
         * <a href="http://google.com">Link text</a>
         * when you use it, you can mention only part of the link, not complete of whole exact.
         * xpath-xml path
         * xml: it's document that looks like HTML, also based on TAGS!!
         * there are two types of xpath: relative and absolute
         * absolute, usually not used in test automation, for finding locators. In rear cases when it's useful:
         * when you expect some element in the specific place. You need to start from the root element.In case of HTML
         * it's a - <html></html>
         * /-->forward slash -xpath always starts with it
         * /html/body/div[2]/button/
         * you have to go from parent -> to child
         * node->it refers to any HTML element
         * html
         *    head
         *       body
         *          div
         *          div
         *          button
         * Instead, we mostly use relative xpath, and it starts with 2 forward slashes//
         * It can start from any element, not only from root element.
         *  //tagName[@attribute='value']
         *  //tagName[@attribute='value']
         *  tagName[text()="text of element"]
         *  fro example:
         *  <button onclick="button1()">Button 1</button>   -->be careful after Button 1< shouldn't be any space
         *   //button[@onclick='button1()']
         *   //button[text()='Button 1']
         *   Text is always in between > <
         *   //button[.='Button 1']
         *   . -means any element
         *
         *
         *   //button[contains(text()
         *
         *
         * Xpath
         *
         *
         *
         */



    }
}
