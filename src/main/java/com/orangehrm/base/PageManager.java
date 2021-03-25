package com.orangehrm.base;

import com.orangehrm.pages.LoginPage;

public class PageManager {

    public static LoginPage loginPage;

    public static void initializePageObjects(){

        loginPage=new LoginPage();
    }
}
