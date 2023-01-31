package com.cbt.tests.week2_Selenium;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class practice {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //syntax of css
        //1.tagName[artibute='value'];
        driver.get("https://practice.cydeo.com/registration_form");


    }
}
