package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GmailSend {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://gmail.com");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement emailAddress = driver.findElement(By.id("identifierId"));
        emailAddress.sendKeys("seka.bro7@gmail.com");

        WebElement nextButton = driver.findElement(By.className("CwaK9"));
        nextButton.click();

        Thread.sleep(3000);

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("suka3571891");

        WebElement nextButtonForPassword = driver.findElement(By.className("CwaK9"));
        nextButtonForPassword.click();

        Thread.sleep(3000);

        WebElement composeEmail = driver.findElement(By.className("z0"));
        composeEmail.click();

        Thread.sleep(3000);

        WebElement toField = driver.findElement(By.name("to"));
        toField.sendKeys("tarikkzc@gmail.com");

        Thread.sleep(3000);

        WebElement subjectField = driver.findElement(By.name("subjectbox"));
        subjectField.sendKeys("Selenium Test Automation");

        Thread.sleep(3000);

        WebElement textBody = driver.findElement(By.xpath("//div[@role='textbox']"));
        textBody.sendKeys("Hi from Selenium!");

        WebElement sendButton = driver.findElement(By.xpath("//div[@role='button' and text()='Send']"));
        sendButton.click();

    }

}
