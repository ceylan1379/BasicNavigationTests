package com.cbt.tests;

import com.cbt.utilities.ConfigurationReader;
import com.cbt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest {
    @Test
    public void amazon_test() {
        //1. Go to 'https://www.amazon.com.tr/'
        Driver.getDriver().get("https://www.amazon.com.tr/");
        WebElement cookies=Driver.getDriver().findElement(By.xpath("//a[@id='sp-cc-rejectall-link']"));
        cookies.click();
        //2. Search iPhone13 512
        WebElement searchApple=Driver.getDriver().findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchApple.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);
        //3. Check that the results are listed
        WebElement checkResult=Driver.getDriver().findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base a-text-normal']"));
        Assert.assertTrue(checkResult.isDisplayed());
        //4. Click iPhone13 at the top of the list
        WebElement iPhone13AtTheTopOfTheList=Driver.getDriver().findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        iPhone13AtTheTopOfTheList.click();

        //5. Log the following values for each size
        //.Size information .Price .Color .Stock status
        WebElement sizeOfIPhone13=Driver.getDriver().findElement(By.xpath("(//span[@class='selection'])[1]"));
        System.out.println("iphone 13 Size: " + sizeOfIPhone13.getText());

        WebElement colorOfIPhone13=Driver.getDriver().findElement(By.xpath("(//span[@class='selection'])[2]"));
        System.out.println("Color: " + colorOfIPhone13.getText());

        WebElement priceOfIPhone13=Driver.getDriver().findElement(By.xpath("//span[@class='a-price-whole']"));
        WebElement priceOfDecimalPart=Driver.getDriver().findElement(By.xpath("//span[@class='a-price-fraction']"));
        WebElement symbolOfPrice=Driver.getDriver().findElement(By.xpath("//span[@class='a-price-symbol']"));

        System.out.println("Price: " + priceOfIPhone13.getText()+","+priceOfDecimalPart.getText()+symbolOfPrice.getText());

        WebElement stockOfIPhone13=Driver.getDriver().findElement(By.xpath("//span[@class='a-size-medium a-color-success']"));
        System.out.println("Stock: " + stockOfIPhone13.getText());


    }
}