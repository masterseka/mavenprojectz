package LectureNotes;

public class A10_WebTables {
    /*

File upload in selenium

go to https://the-internet.herokuapp.com/upload
upload file
click upload
verify text uploaded


Create a new test class : FileUploadTest

Selenium cannot deal with windows, pop ups that come from the native OS. For example when we are uploading files, we have to choose a file using a file explorer/finder. this cannot be automated using selenium


AutoIT: only works in windows
Robot framework: this is java library, works anywhere java works
Sikuli: works on windows and unix

Selenium handles file uploads in ery special way, without opening the pop up window
In selenium, in order to upload a file:
	1. we need to locate the choose file input element. Element must have tag INPUT
	2. do sendKeys and send the path to the file we want to upload
________

WEBTABLES
what is a web table : collection of data organized in rows and columns
data arranged in a grid format


anatomy of table:

	table   :  means a table

	table is made of rows and columns, in html

	tbody : means the bpdy of a table

	tr : row
	td : cell

______
	thead  : header of the table, usually contains the columns names
		tr : row
		th : theader
create a new class in tests: WebTablesExample


all tables headers are th. and our table looks like this:
	table
		tbody
			tr
				th
				th
				th

//table[@id='ctl00_MainContent_orderGrid']//th
find the table with this id and within this table, finds all elements of tag th

//table[@id='ctl00_MainContent_orderGrid']/tbody/tr
  --> finds the table, finds tje tbody element within the table and finds all the tr elements within that tbody. tr means one row

print the whole table
print coluns names
print single rows
print certain cell
print certain column
print by coordinates(row, col)
print the size: columns and rows in a table
print a cell in relation to another value


1. how we find the number of rows? find all elements with tr tag
2. how do we find number of columns? find the first row and find the number of cells in the first row


//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[1]/th

	1. it find the table and its body
	2/ it finds the first row
	3. it finds all the cells in the first row

find a certain row: //table[@id='ctl00_MainContent_orderGrid']/tbody/tr[1]  --> get the first row

//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2] --> gets tjhe second row



//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td
	1. it find the table and its body
	2/ it finds the second  row
	3. it finds all the cells in the second row

//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[3]/td[3]

--> 1. it find the table and its body
	2. it finds the third  row
	3. finds the third cell in that row

//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2] ---->
gets all the cells in the second column, gets all of the names


1. it find the table and its body
	2. it finds all rows
	3. finds the second cell in all rows



___

Find the select checkbox for a name
checkbox and the names are in the row
1. find the td/cell which contains that name
	//td[.='Mark Smith']
2. go to the parent row that contains that cell from step 1
	//td[.='Mark Smith']/..

	/..   --> in xpath it means go to parent
3. in that row, find the cell that contains the checkbox
	//td[.='Mark Smith']/../td[1]/input


//*[contains]









     */
}
