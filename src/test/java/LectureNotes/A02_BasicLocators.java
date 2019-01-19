package LectureNotes;

public class A02_BasicLocators {
    /*
    Selenium does not see the page as a human does.
Selenium can only see the html of a page


<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">


findElement() --> this method comes from the webdriver class. it locates an element on the page.

to interact with any element, frist we need to locate it using the findElement() method.
then we can do other operations.


driver.findElement(By.id("session_email")); --> returns an element whose id is session_email


WebElement = class that represents a specific element on the apge. we can do click, type .... operations on webelement

In selenium all elements in the page are represented by webelement object

sendKeys() --> method used to type on an element, takes a string as argument

clear() --> clears the contents of an input element

getText() --> gets the text of an element. webelement is not the text, we need to call the getTEst() explicitly to get the text of the element

findElement --> requires a By object (locator) as parameter
findElement --> returns a webelement
________




HOW TO INCREASE THE FONT IN INTELLIJ?

___


<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">


selenium only sees the html of a page. it uses the html ibformation: tag, attriobute and value to locate an element

there are 8 ways of finding elements in selenium. the ways of finding elements is called locators.


1. Finding by id; if the element has an attribute called id, we can use to find the element. IDs are unique (%99 of time)


By.id("session_email") --> syntax for writing a locator with id. this locator will be passed to findElement() method as parameter
Ids are case sensitive and every else sensitive. has to be exact text

when we pass a wrong locator NoSuchElementException will be thrown. IN the NoSuchElementException message, it tells the what locator was used, what was the value and also it shows at what line the locator was used

2. Finding by NAME: name is another attribute, just like id. but names can be repeated

By.name("commit")


3. Finding by CLASSNAME: we can also use the value of the class attrobute, class repeats a lot (usually)


By.className("nav-sad")

4. Finding by TAGNAME

uses the tag of the element to find the element

if there are multipe elements matching a locator, findElement method will return that first element. It will not find other elements matching teh same locator


5. Finding by LINKTEXT: locates links by their exact text


6. Finding by partialLINKTEXT: locates links by their partial text

______________


what should I do when I get NoSuchElementException?
1. read the exception and find what line is throwting the error
2. read the exception and chech the error is




___


WHere and how we can run selenium code?

1. use our own machine and open our browser
2. use our own machina and open invisible browser

1. HTML UNITDRIVER by selenium
2. PhantomJS driver (3rd party)
3. have our code in our machine, but open browsers in different machine
4. have our code in some repository (GitHub) and open browsers in different machine
     */
}
