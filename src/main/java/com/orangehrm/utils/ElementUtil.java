package com.orangehrm.utils;

import org.openqa.selenium.WebElement;
import static com.orangehrm.base.BasePage.driver;


public class ElementUtil {

    public static String doGetPageTitle(){
        try {
            return driver.getTitle();
        }catch(Exception e){
            System.out.println("Some exception occured while getting the page title");
            return null;

        }
    }

    public static void doSendText(WebElement element, String value){
        try{
            element.sendKeys(value);
        }catch(Exception e){
            System.out.println("Some exception occured while sending text at "+element);
        }
    }
    public static void doClick(WebElement element){
        element.click();
    }
    public static String doGetText(WebElement element){
        try {
            return element.getText();
        }catch (Exception e){
            System.out.println("Some exception occured while getting text from "+element);
            return null;
        }
    }
}
