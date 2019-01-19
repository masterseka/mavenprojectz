package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class AbsoluteXPath {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//      driver.get("http://the-internet.herokuapp.com/upload");
//      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//      WebElement upload = driver.findElement(By.xpath("/html/body/div/div/div/form/input[2]"));
//      WebElement uploadRelative = driver.findElement(By.xpath("//form//input[2]"));
//      WebElement link = driver.findElement(By.xpath("/html/body/div/div/div/a"));

//     =====================================================================

        driver.get("https://the-internet.herokuapp.com/frames");
//      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement iFrameWRelative = driver.findElement(By.xpath("//ul//li[2]//a"));
        WebElement iFrameWAttribute = driver.findElement(By.xpath("//a[@href='/iframe']"));
        WebElement iFrameWText = driver.findElement(By.xpath("//a[.='iFrame']"));

//     =====================================================================

        driver.get("https://amazon.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement helpWTagAttrIndex = driver.findElement(By.xpath("(//a[.='Help'])[1]"));
        WebElement helpWTagAndAttr = driver.findElement(By.xpath("//a[.='Help' and @class= 'nav-a']"));

        //two xpaths together to find second Help link
        // //div[@id='navFooter']//a[.='Help']

//     =====================================================================

        driver.get("https://www.primefaces.org/showcase/ui/button/button.xhtml");
        //button[contains(@id, 'j_idt')]
        //button[starts-with(@id, 'j_idt')]


    }
}



