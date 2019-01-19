package com.cybertek.tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class IFrameDemo {

    @Ignore
    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/tinymce");

        WebElement iFrame = driver.findElement(By.id("mce_0_ifr"));

        driver.switchTo().frame(iFrame);

        WebElement body = driver.findElement(By.tagName("body"));
        body.clear();
        body.sendKeys("JAHDJASHDJHAJDADHASJ");

        driver.switchTo().parentFrame();

        driver.findElement(By.linkText("Elemental Selenium")).click();
    }

    @Test
    public void nestedFrames() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        WebElement frame1 = driver.findElement(By.name("frame-top"));
        driver.switchTo().frame(frame1);

        WebElement frame2 = driver.findElement(By.name("frame-left"));
        driver.switchTo().frame(frame2);

        WebElement left = driver.findElement(By.tagName("body"));
        System.out.println(left.getText());

        driver.switchTo().parentFrame();

        WebElement frame3 = driver.findElement(By.name("frame-middle"));
        driver.switchTo().frame(frame3);

        WebElement middle = driver.findElement(By.id("content"));
        System.out.println(middle.getText());

        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        WebElement frame4 = driver.findElement(By.name("frame-bottom"));
        driver.switchTo().frame(frame4);

        WebElement bottom = driver.findElement(By.tagName("body"));
        System.out.println(bottom.getText());







    }

}



