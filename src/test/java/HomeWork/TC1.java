package HomeWork;
import com.sun.tools.javac.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TC1 {
    public static void main(String[] args) {
        // baab();
        // sports();
        // days();
        departments();
    }

    public static void baab(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //open a browser
        //go to http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        //Enter username kexesobepu@zsero.com
        WebElement emailInput = driver.findElement(By.id("session_email"));
        emailInput.sendKeys("kexesobepu@zsero.com");
        WebElement passwordInput = driver.findElement(By.id("session_password"));
        passwordInput.sendKeys("password");
        WebElement submit = ((ChromeDriver) driver).findElementByName("commit");
        submit.click();

        String actualLogin = driver.findElement(By.className("navbar-text")).getText();
        String expectedLogin = "kexesobepu@zsero.com";

        if(actualLogin.equals(expectedLogin)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedLogin = " + expectedLogin);
            System.out.println("actualLogin = " + actualLogin);
        }

        String actualTitle = driver.getTitle();
        if(!actualTitle.contains("Sign In")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actualTitle = " + actualTitle);
        }

    }

    public static void sports(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //open a browser
        //go to http://a.testaddressbook.com/sign_in
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwRadioButton");
        boolean baseball = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Baseball-input")).isSelected();
        boolean basketball = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Basketball-input")).isSelected();
        boolean football = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Football-input")).isSelected();
        boolean hockey = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Hockey-input")).isSelected();
        boolean soccer = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Soccer")).isSelected();
        boolean waterPolo = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-WaterPolo")).isSelected();



        System.out.println("Testing default is football: ");
        if(football && !baseball && !basketball && !hockey && !soccer && !waterPolo ){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        WebElement baseballButton = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Baseball-input"));
        baseballButton.click();

        baseball = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Baseball-input")).isSelected();
        basketball = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Basketball-input")).isSelected();
        football = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Football-input")).isSelected();
        hockey = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Hockey-input")).isSelected();
        soccer = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-Soccer")).isSelected();
        waterPolo = driver.findElement(By.id("gwt-debug-cwRadioButton-sport-WaterPolo")).isSelected();

        System.out.println("TEST selected baseball: ");
        if(!football && baseball && !basketball && !hockey && !soccer && !waterPolo ){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.quit();

    }
    public static void days(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement monday = driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));
        WebElement mondayLabel = driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-label"));
        System.out.println(mondayLabel.getText()+" "+monday.isSelected());
        monday.click();
        System.out.println(mondayLabel.getText()+" "+monday.isSelected());

        WebElement friday = driver.findElement(By.xpath("//input[@id='gwt-debug-cwCheckBox-Friday-input']"));
        WebElement fridayLabel = driver.findElement(By.xpath("//label[@id='gwt-debug-cwCheckBox-Friday-label']"));
        System.out.println(fridayLabel.getText()+" "+friday.isSelected());
        friday.click();
        System.out.println(fridayLabel.getText()+" "+friday.isSelected());

        driver.quit();
    }

    public static void departments(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://amazon.com");
        WebElement allDepartments = driver.findElement(By.id("searchDropdownBox"));
        Select list = new Select(allDepartments);

        for(int i = 0; i < list.getOptions().size(); i++){
            System.out.println(list.getOptions().get(i).getText());
        }

//        for(WebElement l : list.getOptions()){
//            System.out.println(l.getText());
//        }

        driver.quit();

    }



}
