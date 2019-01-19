package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class JSAlerts {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Ignore
    @Test
    public void accept() {
        driver.get("https://sweetalert.js.org/");
        // trigger the pop up
        driver.findElement(By.xpath("(//button[@class='preview'])[1]")).click();

        //switch to alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @Ignore
    @Test
    public void dismiss() {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        // trigger the pop up
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

        //switch to alert
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    @Test
    public void prompt() {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        // trigger the pop up
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("I'm Tarik, nice to meet you");
        alert.accept();
    }


    @AfterMethod
    public void cleanUp() throws InterruptedException {
        Thread.sleep(5000);
//        driver.quit();
    }

}

// (//h5[@class='content_list--title'])[1]