package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTextDisappearTest extends TestBase {

    @Test
    public void verify1(){

        //element exist on HTML and also visible on the page
        //after clicking
        //element exist on HTML but not visible on the page


        //go to the URL
        driver.get("https://www.w3schools.com/howto/howto_js_toggle_hide_show.asp");

        //Find the target text element
        WebElement text = driver.findElement(By.id("myDIV"));
        //Verify that web element is displayed
        Assert.assertTrue(text.isDisplayed());

        //click on the hiding button
        WebElement button = driver.findElement(By.xpath("//button[.='Toggle Hide and Show']"));
        button.click();

        //Verify that web element is not displayed
        Assert.assertFalse(text.isDisplayed());
    }

    @Test
    public void verify2(){

        //element exist on HTML and also visible on the page
        //after clicking
        //element doesnt exist on HTML

        //go to the URL
        driver.get("https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_html_remove");

        //switch to iframe
        driver.switchTo().frame("iframeResult");

        //verify the text is displayed
        WebElement text = driver.findElement(By.xpath("//body/p"));
        Assert.assertTrue(text.isDisplayed());

        //click on the button
        WebElement button = driver.findElement(By.xpath("//body/button"));
        button.click();

        Assert.assertFalse(elementDisplayed(By.xpath("//body/p")));




    }

    /*
    takes a locator and returns if element matching this locator exists
    @param by
    @return
     */


    //By is refference variable for the locator
    public boolean elementDisplayed(By by){
        //try find it
        //if cant find it, return false
        try{
           return driver.findElement(by).isDisplayed();
        }catch(NoSuchElementException e){
            return false;
        }
    }

    //elements array
    public boolean elementDisplayedS(By by){
        return driver.findElements(by).isEmpty();
    }

}
