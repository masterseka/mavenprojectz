package com.cybertek.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesTest {

    @Test
    public void login(){
        System.out.println("Login");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "login")
    public void zbuySth(){
        System.out.println("Buy buy baby");
    }

    @Test
    public void homePage(){
        System.out.println("Home page");
    }
}
