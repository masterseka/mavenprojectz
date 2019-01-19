package LectureNotes;

public class A05_MavenPomToolsReview {
    /*
    why pom file?

pom file is the most important fiel in a maven project.
it manages the dependenccies of the project. to be able to use any dependency like selenium we have to add it to the pom file.
dependecies in the pom file are added inside the <dependencies> tag

<dependencies>
<dependency>
<groupId>io.github.bonigarcia</groupId>
<artifactId>webdrivermanager</artifactId>
<version>3.0.0</version>
</dependency>

</dependencies>



_______

JAVA --> programming language

MAVEN --> tool creating and managing java projects, adding dependencies

SELENIUM --> bunch of java classes and methods. we can use it by adding it as a dependency

INTELLIJ --> ide, tool which makes writing code easy. we can use it to write any type of code with any tool
java, javascript, html, c...., python, ruby, selenium maven

ECLIPSE ---> another ide, tool which makes writing code easy. we can use it to write any type of code with any tool
java, javascript, html, c...., python, ruby, selenium maven
___

not all companies use maven, maven is only for java projects.
maven alternatievs: ant, gradle



BREAK: come back 8.20

ONLINE: please let us know how is audio, video and screen share quality
please report any and all issues. thank you too much.

PACKAGES AND FOLDERS AND FILE IN A MAVEN PROJECT
.IDEA --> this is a folder created by intellij in all types of projects. it stores project related ifformation which is only important for intellij. WE IGNORE THIS FOLDER

SRC -- > this is where all the code written. when we look for any code, we have to look inside the src package.
when we write a new java class, we have to write it inside the src package.

SRC/MAIN --> all the application code is written in this package. we ignore it for now
SRC/TEST --> test code will go in this folder

TARGET --> all the compiled files, reports and other maven related stuff will be created in this folder. we dont write code here.
FOR NOW we ignore the target folder as well

EXTERNAL LIBRARIES --> all the dependencies in the pom file are shown here. IGNORE

*.IML file --> this is a file created by intellij in all types of projects. it stores project related ifformation which is only important for intellij. WE IGNORE THIS FOLDER

SCRATCHES AND CONSOLES --> Sometimes you may need to create temporary notes or draft up some code outside of the project context. Instead of switching to a different application for this purpose, you can use scratch files and scratch buffers, IGNORE

pom file --> manages the dependencies and other stuff.



BREAK
Again? yess

9 pm

_____


LOCATORS

ID
NAME
CLASS
TAGNAME
LINKTEXT
PARTIALLINKTEXT
CSS
XPATH

how to locate elements?
1. inpect the element on the page
<input type="text" name="email" id="email">

2. analyze the html and see if it has the attributes used by selenium
ID
NAME
CLASS
TAGNAME


<input id = "query" class="querybox flatinput ui-autocomplete-input" name="query">
u_0_c
u_0_n
u_0_p

//*[@id="u_0_c"]

___
3. if the element is link, before we look for id, name, class, tagname we have to try with LINKTEXT or PARTIALLINKTEXT

NOTE: if the class name has a space, we cannot use by.CLASSNAME option

WHAT IS THE DIFFERENCE BETWEEN LINKTEXT AND PARTIALLINKTEXT?

LINKTEXT uses the exact, it has to match 100 percent including spaces.
PARTIALLINKTEXT --> it has to match to some the the text of the link. it can be any part of the text
___


How do you get the number of all the links in the page?

My page always loads different files as links. file names has extensions. how can I guarantee that I click on the first word document?
____


if out locator matches multiple elements, selenium will always pick up the first one.
     */
}
