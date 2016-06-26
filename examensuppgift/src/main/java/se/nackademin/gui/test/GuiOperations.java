/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.gui.test;

import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.SelenideElement;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.*;

/**
 *
 * @author cbg-fynrir
 */
public class GuiOperations {
    
    public void OpenWebBrowser() {
        open("http://localhost:8080/librarytest");
        this.WriteLog("Opened the webbrowser.", true);
        sleep(1000);
    }
    
    public String getSiteTitle() {
        this.WriteLog("Getting the title of the site.", true);
        String title = Selenide.title();
        return title;
    }
    
    public String getTextOfElement(String elementselector) {
        this.WriteLog("Getting the text of the element ("+elementselector+")", true);
        String text = $(elementselector).getText();
        return text;
    }
    
    public void WriteLog(String message, boolean includeDate) {
        String newline = System.getProperty("line.separator");
        
        LocalDateTime localdate = LocalDateTime.now();
        String date = localdate.toString();
        String msg = "";
        if (includeDate == true) {
            msg = ""+date+": "+message+""+newline+"";
        } else if (includeDate == false) {
            msg = message+newline;
        }
        
        try {
            Files.write(Paths.get("./TestLog.txt"), msg.getBytes(), CREATE,WRITE,APPEND);
        } catch (IOException ex) {
            Logger.getLogger(GuiOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public String getResultsFromBookSearch(ArrayList Options, boolean getAuthorBookTable) {
        String data;
        
        
        
        sleep(2000);
        if (Options.contains("ClickBook")) {
            this.WriteLog("The Option was set to 'ClickBook'", true);
            $(".v-grid-cell-focused > a:nth-child(1)").click();
            this.WriteLog("Clicking on the first book in the table.", true);
            sleep(2000);
            this.WriteLog("Getting all the text of the book page.", true);
            String titleText = $("#gwt-uid-3").getText();
            String authorText = $("#gwt-uid-5 > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > span:nth-child(1)").getText();
            String descriptionText = $("#gwt-uid-7").getText();
            String isbnText = $("#gwt-uid-9").getText();
            String dateText = $("#gwt-uid-11").getText();
            String copiesavaibleText = $("#gwt-uid-13").getText();
            this.WriteLog("Inserting the data into a string (data)", true);
            data = ""+titleText+"|"+authorText+"|"+descriptionText+"|"+isbnText+"|"+dateText+"|"+copiesavaibleText+"";
            this.WriteLog("ClickBook option finished. Commencing to return the data.", true);
        } else if (Options.contains("ClickAuthorInBook")) {
            $(".v-grid-cell-focused > a:nth-child(1)").click();
            sleep(2000);
            $("#gwt-uid-5 > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)").click();
            sleep(2000);
            String authornameText = $("#gwt-uid-3").getText();
            String countryText = $("#gwt-uid-5").getText();
            String biographyText = $("#gwt-uid-7").getText();
            
            if (getAuthorBookTable == true) {
            String authorbookTable = $(".v-grid-tablewrapper").getText();
            this.WriteLog("Inserting the data into a string (data), (getAuthorBookTable was set to true in the test, getting the table of books from authors page)", true);
            data = ""+authornameText+"|"+countryText+"|"+biographyText+"|"+authorbookTable+"";
            this.WriteLog("ClickAuthorInBook option finished. Commencing to return the data.", true);
            } else {
            this.WriteLog("Inserting the data into a string (data), (Authors name, country and biography)", true);
            data = ""+authornameText+"|"+countryText+"|"+biographyText+"";
            this.WriteLog("ClickAuthorInBook option finished. Commencing to return the data.", true);
            }
            
            
        } else if (Options.contains("ClickBookInAuthor")) {
            this.WriteLog("Options contained 'ClickBookInAuthor', commencing to run that option.", true);
            this.WriteLog("Clicking on the first book in the table.", true);
            $(".v-grid-cell-focused > a:nth-child(1)").click();
            this.WriteLog("Sleeping for 2000 ms.", true);
            sleep(2000);
            this.WriteLog("Clicking on the first author for the book.", true);
            $("#gwt-uid-5 > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)").click();
            this.WriteLog("Sleeping for 2000 ms.", true);
            sleep(2000);
            this.WriteLog("Clicking on the first book in the table of books on the authors page.", true);
            $(".v-grid-cell-focused > a:nth-child(1)").click();
            this.WriteLog("Sleeping for 2000 ms.", true);
            sleep(2000);
            String titleText = $("#gwt-uid-3").getText();
            String authorText = $("#gwt-uid-5 > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > span:nth-child(1)").getText();
            String descriptionText = $("#gwt-uid-7").getText();
            String isbnText = $("#gwt-uid-9").getText();
            String dateText = $("#gwt-uid-11").getText();
            String copiesavaibleText = $("#gwt-uid-13").getText();
            this.WriteLog("Getting all the data about the book.", true);
            data = ""+titleText+"|"+authorText+"|"+descriptionText+"|"+isbnText+"|"+dateText+"|"+copiesavaibleText+"";
            this.WriteLog("ClickBookInAuthor option finished. Commencing to return the data.", true);
        } else if (Options.contains("ClickAuthorInAuthor")) {
            this.WriteLog("ClickAuthorInAuthor option was set. Commencing operation.", true);
            this.WriteLog("Clicking on the first book in the table", true);
            $(".v-grid-cell-focused > a:nth-child(1)").click();
            this.WriteLog("Sleeping for 2000 ms.", true);
            sleep(2000);
            this.WriteLog("Clicking on the first author listed for the book", true);
            $("#gwt-uid-5 > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)").click();
            this.WriteLog("Sleeping for 2000 ms.", true);
            sleep(2000);
            this.WriteLog("Clicking on the first author in the book table, in the authors page (this is redundant, but I want to cover the links)", true);
            $(".v-grid-row-focused > td:nth-child(2) > a:nth-child(1)").click();
            this.WriteLog("Sleeping for 2000 ms.", true);
            sleep(2000);
            String authornameText = $("#gwt-uid-3").getText();
            String countryText = $("#gwt-uid-5").getText();
            String biographyText = $("#gwt-uid-7").getText();
            
            if (getAuthorBookTable == true) {
            String authorbookTable = $(".v-grid-tablewrapper").getText();
            this.WriteLog("Inserting the data into a string (data), (getAuthorBookTable was set to true in the test, getting the table of books from authors page)", true);
            data = ""+authornameText+"|"+countryText+"|"+biographyText+"|"+authorbookTable+"";
            this.WriteLog("ClickAuthorInAuthor operation finished. Commencing to return the data", true);
            } else {
            this.WriteLog("Putting all the data into a string to be returned at the end of the method.", true);    
            data = ""+authornameText+"|"+countryText+"|"+biographyText+"";
            this.WriteLog("ClickAuthorInAuthor operation finished. Commencing to return the data", true);
            }
            
        } else {
        this.WriteLog("Getting the contents of the table .v-grid-tablewrapper", true);
        SelenideElement tableTable = $(".v-grid-tablewrapper");
        data = tableTable.getText();
        
        
        }
        this.WriteLog("Returning the data", true);
        return data;
        
        //Title Input Field ID: #gwt-uid-3
        //Author INput Field ID: #gwt-uid-5
        //ISBN Input Field ID: #gwt-uid-7
        //Date Input Field ID: #gwt-uid-9
        //Submit button ID: #search-books-button    
    }
    //Authors
    public String getResultsFromAuthorSearch(ArrayList Options, boolean getAuthorBookTable) {
        String data;
        
        if (Options.contains("ClickAuthor")) {
            this.WriteLog("ClickAuthor Option was set, commencing operation ", true);
            $(".v-grid-cell-focused > a:nth-child(1)").click();
            sleep(2000);
            String authornameText = $("#gwt-uid-3").getText();
            String countryText = $("#gwt-uid-5").getText();
            String biographyText = $("#gwt-uid-7").getText();
            
            if (getAuthorBookTable == true) {
            this.WriteLog("Getting the author's data (getAuthorBookTable was set to true)", true);    
            String authorbookTable = $(".v-grid-tablewrapper").getText();
            data = ""+authornameText+"|"+countryText+"|"+biographyText+"|"+authorbookTable+"";
            } else {
            this.WriteLog("Getting the author's data", true);
            data = ""+authornameText+"|"+countryText+"|"+biographyText+"";    
            }
            
        
            
        } else {
        this.WriteLog("Getting all the authors from the resulting table", true);
        SelenideElement tableTable = $(".v-grid-tablewrapper");
        data = tableTable.getText();
        }
        this.WriteLog("Returning the data from getResultsFromAuthorSearch (part of GuiOperations class)", true);
        return data;
        
        //Title Input Field ID: #gwt-uid-3
        //Author INput Field ID: #gwt-uid-5
        //ISBN Input Field ID: #gwt-uid-7
        //Date Input Field ID: #gwt-uid-9
        //Submit button ID: #search-books-button    
    }
    //signOutAfterTest set to true will sign out the user afterwards.
    
    public String getMyProfileResults(boolean getLoanedBookTable) {
        //Display name: #gwt-uid-5
        //First Name: #gwt-uid-7
        //Last Name: #gwt-uid-9
        //Phone: #gwt-uid-11
        //Email: #gwt-uid-13
        //Loaned books table: .v-grid-tablewrapper
        
        String data;
        
        if (getLoanedBookTable == true) {
            this.WriteLog("Getting the data from the user. ", true);
            String displaynameText = $("#gwt-uid-5").getText();
            String firstnameText = $("#gwt-uid-7").getText();
            String lastnameText = $("#gwt-uid-9").getText();
            String phoneText = $("#gwt-uid-11").getText();
            String emailText = $("#gwt-uid-13").getText();
            String booksloanedTable = $(".v-grid-tablewrapper").getText();
            this.WriteLog("Inserting the data into a string (data), (getLoanedBookTable was set to true) ", true);
            data = "|"+displaynameText+"|"+firstnameText+"|"+lastnameText+"|"+phoneText+"|"+emailText+"|"+booksloanedTable+"";
        } else {
            this.WriteLog("Getting the data from the user. ", true);
            String displaynameText = $("#gwt-uid-5").getText();
            String firstnameText = $("#gwt-uid-7").getText();
            String lastnameText = $("#gwt-uid-9").getText();
            String phoneText = $("#gwt-uid-11").getText();
            String emailText = $("#gwt-uid-13").getText();
            this.WriteLog("Inserting the data into a string (data)", true);
            data = "|"+displaynameText+"|"+firstnameText+"|"+lastnameText+"|"+phoneText+"|"+emailText+"";
        }
            this.WriteLog("Returning the data from getMyProfileResults (part of GuiOperations class)", true);
           return data;
    }
    
}
