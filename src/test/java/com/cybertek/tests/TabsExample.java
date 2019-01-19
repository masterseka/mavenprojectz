package com.cybertek.tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.Set;

public class TabsExample {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
    }

    @Test
    public void changeTab() {
        System.out.println(driver.getWindowHandles().size());
        System.out.println(driver.getWindowHandle());

        System.out.println("-----------------------");

        driver.findElement(By.linkText("Click Here")).click();

        System.out.println(driver.getWindowHandles().size());

        Set<String> windowHandles = driver.getWindowHandles();

        System.out.println("-----------------------");

        for (String handle : windowHandles) {
            System.out.println(handle);

            //switching tabs
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());

            if (driver.getTitle().equals("New Window")) {
                break;
            }
        }
        Assert.assertEquals(driver.getTitle(),"New Window");
        Assert.assertNotEquals(driver.getTitle(),"The Internet");
    }

    @Ignore
    @Test
    public void changeTab01() {
        driver.get("https://www.w3schools.com/html/");
        driver.findElement(By.linkText("Try it Yourself »")).click();
        // title of the second tab: Tryit Editor v3.6
        // get all handles
        // switch 1 by 1
        //if the title is the right, break the loop

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals("Tryit Editor v3.6")) {
                break;
            }
        }

        Assert.assertTrue(driver.getCurrentUrl().contains("default"));
    }

    @AfterMethod
    public void cleanUp() throws InterruptedException {
        Thread.sleep(3000);
//        driver.quit();
    }

}