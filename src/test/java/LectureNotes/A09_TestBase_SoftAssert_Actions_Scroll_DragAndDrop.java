package LectureNotes;

public class A09_TestBase_SoftAssert_Actions_Scroll_DragAndDrop {

    /*
    Test Base Class

Test Base class is a class which contains common methods for all tests, other tests will extend the test base class

Create a new package
    1 . Right click on Java
    2. New --> package
    3. enter name : "com.cybertek.utilities"
    4. hit ENTER

Create a new class in side the utilities package
Name: TestBase


Create a new class in the Tests package
Name: GoogleDemo


Tests: contains actual tests, all classes in this pacjage have method with @Test annotation

utilities: contain common and repeated code
_____


Assertion/Verifcation: if fails, whole test will fail
Validation:             if something fails, it does not stop the test




In TestNG/Junit, in any test, if any assertion fails, the resot of the method will be skipped


SoftAssert is a class that comes from testng, it allows doing soft assertions, meaning if something fails, it will not stop the execution

HOW TO USE:
we create a variable of type SoftAssert. SoftAssert has assertions methods.
we call as many assertion method from SoftAssert as we want

at then the end of the testm, we call softAssert.assertAll(); which reports all the failures.

__


ACTIONS

actions lets us do advanecd interactions with browser
    double click
    right click
    drag drop
    hover

Tp use actions class we need to create pbject of the Actions class and pass a webdriver object as a constructor


scrolling:
1. actions.moveTo(element)
2. actions.sendKeys(Keys.PAGE_DOWN)
3. using javascript


FILE DOWNLOAD
    Selenium cannot test file downloads. Selenium can to a website and click on the download link and thats it.
    We can use java to verify is a file exists in certain location

in announcement there is a file test.txt
downlaod it to our Downlods folder



Downlaod folder is always in the user folder

/users/my usernae / downlaods / file name

     */
}
