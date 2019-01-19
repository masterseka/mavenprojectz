package LectureNotes;

public class A01_SeleniumIntroduction {
    /*
    Create a new project

FIle --> New ---> Project

click next ....

Name: Selenium Automation Framework


CLick finish

Seleck This wondow
___


create a package,
right click on src and select new --> package
com.cybertek

______


Adding libraries:
File --> Project Structure
___> MOdules --> Dependencies

Click on the plus sign --> Jars and Directories

---

After adding libaries it will still be red
we need to import now

click OPTION+ENTER to import

ALT+ENTER

____

webdriver.chrome.driver --> used for chrome browser


/Users/cybertekschool/Documents/selenium dependencies/drivers/chromedriver -- > path to the file

path includes location and the name

if you are using windows, you have to add the extension .exe
chromedriver.exe

webdriver.gecko.driver --> used for setting the path for firefox/geckodriver
___


We need to isntall firefox and chrome

WebDriver is the main class in selenium. It represent the browser

get() --> opens a website, get() waits for the page to load

navigate().to() --> opens a website, does not wait for the page to load

navigate().back() --> // goes back on previous page

navigate().forward() --> goes forward on next page

up and down

navigate().refresh(); // refreshes the page

_____

before we automate any functionality, we have to test the test case manually. Only automate functioinality that is working. There are 2 benefits from executing the test case manually:
1. we will understand the scenario better
2. we will find out if there are any bugs in that functionality


How to test if google opens correcly
1. Open chrome browser
2. go to url "https://google.com"
3. Verify title
Expected title: Google

driver.getTitle(); --> get the title of the page, returns a string


_____

assertion vs verification/validation?

assertion---> stop the execution fi something fails

verification/validation --> do not stop the test if something fails, move on the next test


How to test if google opens correcly 2
1. Open chrome browser
2. go to url "https://google.com"
3. Verify url
Expected url: "https://www.google.com/"

driver.getCurrentUrl() --> gets the url of the current page

http://static.javadoc.io/org.seleniumhq.selenium/selenium-api/2.50.1/org/openqa/selenium/WebDriver.html


     */
}
