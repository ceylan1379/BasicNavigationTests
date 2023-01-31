package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {
        //1. Open	browser
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go	to	website	https://google.com
        driver.get("https://google.com");

        //3. Save the	title in	a	string	variable
        String expectedTitle="Google";
        String actualTitle=driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        StringUtility.getStringUtility(actualTitle,expectedTitle);

        //4. Go	to	https://etsy.com
        driver.navigate().to("https://etsy.com");

        //5. Save the	title	in	a	string	variable
        String expectedTitle1="Etsy Poland - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle1=driver.getTitle();
        System.out.println("actualTitle = " + actualTitle1);
        StringUtility.getStringUtility(actualTitle1,expectedTitle1);

        //6. Navigate	back	to	previous page
        driver.navigate().back();

        //7. Verify that	title	is	same	is	in	step	3
        String expectedTitle2="Google";
        String actualTitle2=driver.getTitle();
        System.out.println("actualTitle = " + actualTitle2);
        StringUtility.getStringUtility(actualTitle,expectedTitle);

        //8. Navigate	forward	to	previous	page
        driver.navigate().forward();

        //9. Verify	that	title	is	same	is	in	step	5
        String expectedTitle3="Etsy Poland - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle3=driver.getTitle();
        System.out.println("actualTitle = " + actualTitle3);
        StringUtility.getStringUtility(actualTitle1,expectedTitle1);






    }
}
