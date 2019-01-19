package com.cybertek.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
    @Test
    public void test01(){
        String a = "A";
        String b = "A";

        Assert.assertEquals(a,b);

    }
    @Test
    public void test02(){
        String a = "A";
        String b = "A";

        Assert.assertEquals(a,b);
    }

    //AssertTrue checks booleans
    @Test
    public void test03(){
        boolean b = 1==1;
        Assert.assertTrue(b);
    }
}
