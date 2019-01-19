package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesExample extends TestBase {

    @Test
    public void printWholeTable(){
        login();
        //table is one whole webelement
        WebElement table = driver.findElement(By.id("ctl00_MainContent_orderGrid"));
        System.out.println(table.getText());
    }

    @Test
    public void printAllHeaders(){
        login();
        //FIND ELEMENTS
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//th"));
        for(WebElement header: headers){
            System.out.println(header.getText());
        }
    }

    @Test
    public void printRow(){
        login();
        //or //table[@id='ctl00_MainContent_orderGrid']//tr
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        System.out.println("Number of rows: "+allRows.size());
        //Row is separate element
        for(WebElement row: allRows){
            System.out.println(row.getText());
        }

        //print the Nth row
        System.out.println("Printing row: "+3);
        System.out.println(allRows.get(2).getText());
    }

    //print the size: columns and rows in a table
    @Test
    public void  printTableSize(){
        login();
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        System.out.println("Number of rows: "+allRows.size());

        //allHeaders
        List<WebElement> firstRowColumns = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[1]/th"));
        System.out.println("Number of columns in first row: "+firstRowColumns.size());

        for(WebElement column : firstRowColumns){
            System.out.println(column.getText());
        }

    }

    //print a row without using a list
    @Test
    public void printRow2(){
        login();
       // System.out.println(driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]")).getText());
        WebElement row = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]"));
        System.out.println(row.getText());

    }

    @Test
    public void  printAllCellsInOneRow(){
        login();
        List<WebElement> cells = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[4]/td"));

        System.out.println(cells.size());
        for(WebElement cell: cells){
            System.out.println(cell.getText());
        }

    }

    //print by coordinates: based on row and column number
    @Test
    public void printByCoordinates(){
        login();
        WebElement cell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[11]"));
        System.out.println(cell.getText());
        System.out.println(getCell(6,11).getText());
    }

    public WebElement getCell(int row, int column){
        String xpath = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+row+"]/td["+column+"]";
        return driver.findElement(By.xpath(xpath));

    }

    //print certain column in all rows
    @Test
    public void printColumn(){
        login();
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));

        for(WebElement name : allNames){
            System.out.println(name.getText());
        }
    }

    //find the select checkbox for a given name
    @Test
    public void selectCheckbox(){
        login();
        WebElement checkbox = driver.findElement(By.xpath("//td[.='Susan McLaren']/../td[1]/input"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
    }

    //verify that name Mark Smith,
    @Test
    public void test(){
        login();
        int nameIndex=getColumnIndex("Name");
        System.out.println(nameIndex);

        List<WebElement> allnames =driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[3]/" +
                "td["+nameIndex+"]"));

        Boolean found=false;
        for (int i = 0; i <allnames.size() ; i++) {
            if(allnames.get(i).getText().equalsIgnoreCase("Mark Smith")){
                found =true;
                break;
            }

        }
        Assert.assertTrue(found);
        found=false;
        int cityIndex=getColumnIndex("City");
        System.out.println(cityIndex);

        List<WebElement> allCities =driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[3]/" +
                "td["+cityIndex+"]"));


        for (int i = 0; i <allCities.size() ; i++) {
            if(allCities.get(i).getText().equalsIgnoreCase("Whitestone, British")){
                found =true;
                break;
            }
        }
        Assert.assertTrue(found);

    }

    //gets a column as parameters
    public int getColumnIndex(String column){
        List<WebElement> allHeaders=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[1]/th"));

        for (int i = 0; i <allHeaders.size() ; i++) {
            if(allHeaders.get(i).getText().equals(column)){
                return i+1;
            }

        }

        return allHeaders.indexOf(column);
    }


    public void login(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test"+ Keys.ENTER);

    }
}
