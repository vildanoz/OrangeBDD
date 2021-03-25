package com.orangehrm.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BasePage {
    public static WebDriver driver;

    public static WebDriver initializeDriver(){
        ConfigReader.readProperties("./src/test/resources/configuration/config.properties");
        String browser= ConfigReader.getProperty("browser");
        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("opera")) {
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
        }
        else {
            throw new RuntimeException("Invalid browser name");

        }

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("url"));
        PageManager.initializePageObjects();
        return driver;
    }

    public static void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
