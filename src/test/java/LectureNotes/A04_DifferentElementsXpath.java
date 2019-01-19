package LectureNotes;

public class A04_DifferentElementsXpath {
    /*
    for a selenium, we will need the following libraries in our pom file?

selenium java

webdriver manager





we get all dependencies from online repositories: http://mvnrepository.com, http://search.maven.org



in the repository do not choose options that say beta, RC (release candidate)



Do we need internet to use maven, what if company blocks internet?





Companies have their local repository (local nexus), companies download and test the required libraries in their nexus first. T use maven with the local nexus, we need to get the settings from our developers, team etc.

if the company does not ahve my dependency like selenium in their nexus, I have to request them to download and add it to nexus





there are 2 ways of submitting a form;

1. input.sendKeys("aasdfsadf"+ Keys.ENTER);  --> enters text and hits enter



2. input.submit();  --> will submit the form will all the data, just like hitting enter



3. Click on on the submit button





___



HOW TO GET TEXT from an element:



1. element.getText();



2. element.getAttribute("value");



3. element.getAttribute("innerHTML");



TEXT INPUT FIELDS

sendKeys

clear

submit

click

_________

CHECKBOX and RADIO BUTTON



element.isSelected()  :  returns true / false based on checkbox/radio button is selected or not



CHECKBOX: if we select/unselect one, others are not affected

RADIOBUTTON: if we select/unselect one, others are affected, only on radiobutton in the group can be selected

_____







go to : http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox



select on monday only if it is not select

_____







DROPDOWN



In selenium dropdowns are handled using a separate class: Select.

In order to create a select object, we need to pass a webelement of tag select as a constructor



in HTML, dropdowns are represented with Select tag, options in the dropdown are represented by option tag, option tag is the child of select tag



getFirstSelectedOption --> returns the selected option in the dropdown (webelement



getOptions() --> returns a list of all the options in the dropdown(selected, not selected all will returned)



___



If in your applicatoin, dropdown menus do not use select tag, you cannot use the select class.

1. you will have to select and click on the dropdown sperately

2. you will have to locate and click on the option in the second step



___



BY CLASSNAME locator does not work if the class has multiple words/class spearated by space.

class="btn btn-primary"

___





when none of the options : id, name, class, tag, link text, partial link text does not work, we use xpath or css.



XPATH



xpath is a type of locator which used the HTML information of an element to locate it. Based on HTML of any element we can write xpath which uniquely identifies it in the page





<input type="checkbox">

<input type="checkbox" checked="">

____





<button class="btn btn-primary" type="submit" value="Search" aria-label="Search">

                    Search

</button>



______



element that has a tag 'button' and attribute 'type' with the value 'submit'



XPATH:  //button[@type='submit']



E - tag name

A - attribute

t - value of that attribute



//E[@A='t']



//button[@type='submit']

_____



element that has a tag 'button' and attribute 'class' with the value 'btn btn-primary'



//button[@class='btn btn-primary']



____





<input id="search-query" class="search-input clearable dropdown-relative-positioned rounded



                    " type="text" placeholder="Search for items or shops" name="search_query" value="" autocomplete="off" autocorrect="off" autocapitalize="off">





//input[@id='search-query']

______



//form[@id='checkboxes']/input[2]   : finding the form with id checkboxes and giving the second child

___





HOW to find the second help link on amazon



(//a[.='Help'])[2]


     */
}
