package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
go to https://the-internet.herokuapp.com/upload
upload file
click upload
verify text uploaded
 */
public class FileUploadTest extends TestBase {

    @Test
    public void test(){
        //go to https://the-internet.herokuapp.com/upload
        driver.get("http://the-internet.herokuapp.com/upload");





        //upload file
        driver.findElement(By.id("file-upload")).sendKeys("/Users/serik/Downloads/ERKAM.png");
        //AutoIT only works in windows
        //Robot framework -> java library works anywhere java works
        //Sikuli: works on windows and unix
        // Selenium handles file uploads in very special way, without opening the pop up window


        //click upload
        driver.findElement(By.id("file-submit")).click();

        //verify text uploaded
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='example']/h3")).getText().contains("Uploaded"));

        //Assert.assertTrue(driver.findElement(By.xpath("//*[.='File Uploaded']")).isDisplayed());



    }

}
