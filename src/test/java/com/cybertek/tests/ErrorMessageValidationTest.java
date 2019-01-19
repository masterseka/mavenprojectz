package com.cybertek.tests;

import com.cybertek.pages.HomePage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMessageValidationTest extends TestBase {
    HomePage homePage = new HomePage();
    @Test
    public void wrongEmail() {


        driver.get(ConfigurationReader.getProperty("url"));

        //Entering Invalid Email
        homePage.username.sendKeys("admin");
        //Entering the Valid Password
        homePage.password.sendKeys("test");
        //Clicking on Login
        homePage.loginButton.click();

        String error = "Invalid Login or Password.";
        String actualError = homePage.errorMessage.getText();
        Assert.assertEquals(actualError, error);
    }

    @Test
    public void wrongPasswordTest() {

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        //Entering Invalid Email
        homePage.username.sendKeys("Tester");
        //Entering the Valid Password
        homePage.password.sendKeys("wrong pass");
        //Clicking on Login
        homePage.loginButton.click();
        String  actualError = homePage.errorMessage.getText();
        String expectedError = "Invalid Login or Password.";
        Assert.assertEquals(actualError, expectedError);

    }

    @Test
    public void blacnkUsername(){
        homePage.open();
        homePage.login("", "");

        String  actualError = homePage.errorMessage.getText();
        String expectedError = "Invalid Login or Password.";
        Assert.assertEquals(actualError, expectedError);
    }




}