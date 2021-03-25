package com.orangehrm.pages;
import static com.orangehrm.base.BasePage.driver;

import com.orangehrm.utils.ElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id="txtUsername")
    private static WebElement username;

    @FindBy(id="txtPassword")
    private static WebElement password;

    @FindBy(id="btnLogin")
    private static WebElement loginBtn;

    @FindBy(id="spanMessage")
    private static WebElement errorMsg;

    public LoginPage(){
        //this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public static String verifyTitle(){

        return ElementUtil.doGetPageTitle();
    }
    public static void enterUserName(String user){

        ElementUtil.doSendText(username,user);
    }
    public static  void enterPassword(String pass){

        ElementUtil.doSendText(password,pass);
    }
    public static void clickLoginBtn() {

        ElementUtil.doClick(loginBtn);
    }

    public static String getErrorMessage(){

        return ElementUtil.doGetText(errorMsg);
    }
}
