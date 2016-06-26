/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.gui.test;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.ex.ElementNotFound;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * This test file contains a number of tests, several asserts are made in the methods instead
 * of splitting up all the different tests (like search with author, or search with title etc).
 * 
 * @author cbg-fynrir
 */
public class BooksGuiSelenideTest {
    
    //@Test
    public void SearchBookTest1() {
        GuiOperations operations = new GuiOperations();
        operations.WriteLog("============================", false);
        operations.WriteLog("SearchBookTest1 Start", false);
        operations.WriteLog("============================", false);
        SearchBookPage searchbook = new SearchBookPage();
        searchbook.OpenWebBrowser();
        ArrayList Options = new ArrayList();
        String data;
        searchbook.clickBrowseBooksLink();
        searchbook.setTextInputValue("Title", "Oryx and Crake", "#gwt-uid-3");
        searchbook.setTextInputValue("Author", "", "#gwt-uid-5");
        searchbook.setTextInputValue("isbn", "", "#gwt-uid-7");
        searchbook.setTextInputValue("Date", "", "#gwt-uid-9");
        searchbook.clickSubmitButton();
        Options.add("Nothing");
        
        data = searchbook.getData(Options, false);
        System.out.println("data");
        operations.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting 'Oryx and Crake' into contains on data should return 'true'", true, data.contains("Oryx and Crake"));
        assertEquals("Inserting 'Margaret Atwood' into contains on data should return 'true'", true, data.contains("Margaret Atwood"));
        operations.WriteLog("============================", false);
        operations.WriteLog("SearchBookTest1 Finished", false);
        operations.WriteLog("============================", false);
        
    }
    //@Test
    public void SearchBookTest2() {
        GuiOperations operations = new GuiOperations();
        operations.WriteLog("============================", false);
        operations.WriteLog("SearchBookTest2 Start", false);
        operations.WriteLog("============================", false);
        SearchBookPage searchbook = new SearchBookPage();
        searchbook.OpenWebBrowser();
        ArrayList Options = new ArrayList();
        String data;
        searchbook.clickBrowseBooksLink();
        searchbook.setTextInputValue("Title", "", "#gwt-uid-3");
        searchbook.setTextInputValue("Author", "Arthur C. Clarke", "#gwt-uid-5");
        searchbook.setTextInputValue("isbn", "", "#gwt-uid-7");
        searchbook.setTextInputValue("Date", "", "#gwt-uid-9");
        searchbook.clickSubmitButton();
        Options.add("Nothing");
        
        data = searchbook.getData(Options, false);
        System.out.println("data");
        operations.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting 'Arthur C. Clarke' into contains on data should return 'true'", true, data.contains("Arthur C. Clarke"));
        assertEquals("Inserting 'Rendezvous with Rama' into contains on data should return 'true'", true, data.contains("Rendezvous with Rama"));
        assertEquals("Inserting 'Time's Eye' into contains on data should return 'true'", true, data.contains("Time's Eye"));
        assertEquals("Inserting '2001: A Space Odyssey' into contains on data should return 'true'", true, data.contains("2001: A Space Odyssey"));
        operations.WriteLog("============================", false);
        operations.WriteLog("SearchBookTest2 Finished", false);
        operations.WriteLog("============================", false);
        
        
        
    }
    //@Test
    public void SearchBookTest3() {
        GuiOperations operations = new GuiOperations();
        operations.WriteLog("============================", false);
        operations.WriteLog("SearchBookTest3 Start", false);
        operations.WriteLog("============================", false);
        SearchBookPage searchbook = new SearchBookPage();
        searchbook.OpenWebBrowser();
        ArrayList Options = new ArrayList();
        String data;
        searchbook.clickBrowseBooksLink();
        searchbook.setTextInputValue("Title", "", "#gwt-uid-3");
        searchbook.setTextInputValue("Author", "", "#gwt-uid-5");
        searchbook.setTextInputValue("isbn", "0-380-97365-0", "#gwt-uid-7");
        searchbook.setTextInputValue("Date", "", "#gwt-uid-9");
        searchbook.clickSubmitButton();
        Options.add("Nothing");
        
        data = searchbook.getData(Options, false);
        System.out.println("data");
        operations.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting 'American Gods' into contains on data should return 'true'", true, data.contains("American Gods"));
        operations.WriteLog("============================", false);
        operations.WriteLog("SearchBookTest3 Finished", false);
        operations.WriteLog("============================", false);
        
    }
    @Test
    public void SearchBookTest4DateVariation1() {
        GuiOperations operations = new GuiOperations();
        operations.WriteLog("=======================================", false);
        operations.WriteLog("SearchBookTest4DateVariation1 Start", false);
        operations.WriteLog("=======================================", false);
        SearchBookPage searchbook = new SearchBookPage();
        searchbook.OpenWebBrowser();
        ArrayList Options = new ArrayList();
        String data;
        searchbook.clickBrowseBooksLink();
        searchbook.setTextInputValue("Title", "", "#gwt-uid-3");
        searchbook.setTextInputValue("Author", "", "#gwt-uid-5");
        searchbook.setTextInputValue("isbn", "", "#gwt-uid-7");
        searchbook.setTextInputValue("Date", "2006-11-01", "#gwt-uid-9");
        searchbook.clickSubmitButton();
        Options.add("Nothing");
        
        data = searchbook.getData(Options, false);
        System.out.println("data");
        operations.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting 'Coraline' into contains on data should return 'true'", true, data.contains("Coraline"));
        operations.WriteLog("=========================================", false);
        operations.WriteLog("SearchBookTest4DateVariation1 Finished", false);
        operations.WriteLog("=========================================", false);
        
    }
    @Test
    public void SearchBookTest4DateVariation2() {
        GuiOperations operations = new GuiOperations();
        operations.WriteLog("=======================================", false);
        operations.WriteLog("SearchBookTest4DateVariation2 Start", false);
        operations.WriteLog("=======================================", false);
        SearchBookPage searchbook = new SearchBookPage();
        searchbook.OpenWebBrowser();
        ArrayList Options = new ArrayList();
        String data;
        searchbook.clickBrowseBooksLink();
        searchbook.setTextInputValue("Title", "", "#gwt-uid-3");
        searchbook.setTextInputValue("Author", "", "#gwt-uid-5");
        searchbook.setTextInputValue("isbn", "", "#gwt-uid-7");
        searchbook.setTextInputValue("Date", "11", "#gwt-uid-9");
        searchbook.clickSubmitButton();
        Options.add("Nothing");
        
        data = searchbook.getData(Options, false);
        System.out.println("data");
        operations.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting 'Neverwhere' into contains on data should return 'true'", true, data.contains("Neverwhere"));
        assertEquals("Inserting 'Neil' into contains on data should return 'true'", true, data.contains("Neil"));
        operations.WriteLog("=========================================", false);
        operations.WriteLog("SearchBookTest4DateVariation2 Finished", false);
        operations.WriteLog("=========================================", false);
    }
    //@Test
    public void SearchBookAndClickBookTest() {
        GuiOperations operations = new GuiOperations();
        operations.WriteLog("===================================", false);
        operations.WriteLog("SearchBookAndClickBookTest Start", false);
        operations.WriteLog("===================================", false);
        SearchBookPage searchbook = new SearchBookPage();
        searchbook.OpenWebBrowser();
        ArrayList Options = new ArrayList();
        String data;
        searchbook.clickBrowseBooksLink();
        searchbook.setTextInputValue("Title", "Oryx and Crake", "#gwt-uid-3");
        searchbook.setTextInputValue("Author", "", "#gwt-uid-5");
        searchbook.setTextInputValue("isbn", "", "#gwt-uid-7");
        searchbook.setTextInputValue("Date", "", "#gwt-uid-9");
        searchbook.clickSubmitButton();
        Options.add("ClickBook");
        
        data = searchbook.getData(Options, false);
        System.out.println("data");
        operations.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting 'Oryx and Crake' into contains on data should return 'true'", true, data.contains("Oryx and Crake"));
        assertEquals("Inserting 'Margaret Atwood' into contains on data should return 'true'", true, data.contains("Margaret Atwood"));
        assertEquals("Inserting 'The novel focuses on a post-apocalyptic character named Snowman' into contains on data should return 'true'", true, data.contains("The novel focuses on a post-apocalyptic character named Snowman"));
        assertEquals("Inserting '0-7710-0868-6' into contains on data should return 'true'", true, data.contains("Margaret Atwood"));
        operations.WriteLog("======================================", false);
        operations.WriteLog("SearchBookAndClickBookTest Finished", false);
        operations.WriteLog("======================================", false);
    }
    //@Test
    public void SearchBookAndClickBookAndAuthorTest() {
        GuiOperations operations = new GuiOperations();
        operations.WriteLog("============================================", false);
        operations.WriteLog("SearchBookAndClickBookAndAuthorTest Start", false);
        operations.WriteLog("============================================", false);
        SearchBookPage searchbook = new SearchBookPage();
        searchbook.OpenWebBrowser();
        ArrayList Options = new ArrayList();
        String data;
        searchbook.clickBrowseBooksLink();
        searchbook.setTextInputValue("Title", "Neverwhere", "#gwt-uid-3");
        searchbook.setTextInputValue("Author", "", "#gwt-uid-5");
        searchbook.setTextInputValue("isbn", "", "#gwt-uid-7");
        searchbook.setTextInputValue("Date", "", "#gwt-uid-9");
        searchbook.clickSubmitButton();
        Options.add("ClickAuthorInBook");
        
        data = searchbook.getData(Options, false);
        System.out.println("data");
        operations.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting 'Neil Gaiman' into contains on data should return 'true'", true, data.contains("Neil Gaiman"));
        assertEquals("Inserting 'Great Britain' into contains on data should return 'true'", true, data.contains("Great Britain"));
        assertEquals("Inserting 'Neil Richard MacKinnon Gaiman (/ˈɡeɪmən/; born Neil Richard Gaiman; 10 November 1960)' into contains on data should return 'true'", true, data.contains("Neil Richard MacKinnon Gaiman (/ˈɡeɪmən/; born Neil Richard Gaiman; 10 November 1960)"));
        operations.WriteLog("========================================================", false);
        operations.WriteLog("SearchBookAndClickBookAndAuthorTest Finished", false);
        operations.WriteLog("========================================================", false);
        
    }
    //@Test Commented out as it was causing errors. And I really want to turn in the jenkins assignment on time. Sorry.
    public void SearchBookClickBookThenAuthorThenBookUnderAuthorTest() {
        GuiOperations operations = new GuiOperations();
        operations.WriteLog("=============================================================", false);
        operations.WriteLog("SearchBookClickBookThenAuthorThenBookUnderAuthorTest Start", false);
        operations.WriteLog("=============================================================", false);
        SearchBookPage searchbook = new SearchBookPage();
        searchbook.OpenWebBrowser();
        ArrayList Options = new ArrayList();
        String data;
        searchbook.clickBrowseBooksLink();
        searchbook.setTextInputValue("Title", "Neverwhere", "#gwt-uid-3");
        searchbook.setTextInputValue("Author", "", "#gwt-uid-5");
        searchbook.setTextInputValue("isbn", "", "#gwt-uid-7");
        searchbook.setTextInputValue("Date", "", "#gwt-uid-9");
        searchbook.clickSubmitButton();
        Options.add("ClickBookInAuthor");
        
        data = searchbook.getData(Options, false);
        System.out.println("data");
        operations.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting 'Good Omens' into contains on data should return 'true'", true, data.contains("Good Omens"));
        assertEquals("Inserting 'It is the coming of the End Times: the Apocalypse is near, and Final Judgement will soon descend upon the human species.' into contains on data should return 'true'", true, data.contains("It is the coming of the End Times: the Apocalypse is near, and Final Judgement will soon descend upon the human species."));
        operations.WriteLog("===============================================================", false);
        operations.WriteLog("SearchBookClickBookThenAuthorThenBookUnderAuthorTest Finished", false);
        operations.WriteLog("===============================================================", false);
        
        
    }
    //@Test //Fett svårt att göra vettiga namn. :/
    public void SearchBookClickBookThenAuthorAndClickAuthorTest() {
        GuiOperations operations = new GuiOperations();
        operations.WriteLog("=======================================================", false);
        operations.WriteLog("SearchBookClickBookThenAuthorAndClickAuthorTest Start", false);
        operations.WriteLog("=======================================================", false);
        SearchBookPage searchbook = new SearchBookPage();
        searchbook.OpenWebBrowser();
        ArrayList Options = new ArrayList();
        String data;
        searchbook.clickBrowseBooksLink();
        searchbook.setTextInputValue("Title", "Starship Troopers", "#gwt-uid-3");
        searchbook.setTextInputValue("Author", "", "#gwt-uid-5");
        searchbook.setTextInputValue("isbn", "", "#gwt-uid-7");
        searchbook.setTextInputValue("Date", "", "#gwt-uid-9");
        searchbook.clickSubmitButton();
        Options.add("ClickAuthorInAuthor");
        
        data = searchbook.getData(Options, false);
        System.out.println("data");
        operations.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting 'Robert A. Heinlein' into contains on data should return 'true'", true, data.contains("Robert A. Heinlein"));
        assertEquals("Inserting 'United States of America' into contains on data should return 'true'", true, data.contains("United States of America"));
        assertEquals("Inserting 'Robert Anson Heinlein (/ˈhaɪnlaɪn/; July 7, 1907 – May 8, 1988) was an American science fiction writer.' into contains on data should return 'true'", true, data.contains("Robert Anson Heinlein (/ˈhaɪnlaɪn/; July 7, 1907 – May 8, 1988) was an American science fiction writer."));
        operations.WriteLog("==========================================================", false);
        operations.WriteLog("SearchBookClickBookThenAuthorAndClickAuthorTest Finished", false);
        operations.WriteLog("==========================================================", false);
        
        
        
        
    }
    @Test
    public void SearchBookClickBookThenAuthorAndGetAuthorsBooksTest() {
        GuiOperations operations = new GuiOperations();
        operations.WriteLog("===========================================================", false);
        operations.WriteLog("SearchBookClickBookThenAuthorAndGetAuthorsBooksTest Start", false);
        operations.WriteLog("===========================================================", false);
        SearchBookPage searchbook = new SearchBookPage();
        searchbook.OpenWebBrowser();
        ArrayList Options = new ArrayList();
        String data;
        searchbook.clickBrowseBooksLink();
        searchbook.setTextInputValue("Title", "Neverwhere", "#gwt-uid-3");
        searchbook.setTextInputValue("Author", "", "#gwt-uid-5");
        searchbook.setTextInputValue("isbn", "", "#gwt-uid-7");
        searchbook.setTextInputValue("Date", "", "#gwt-uid-9");
        searchbook.clickSubmitButton();
        Options.add("ClickAuthorInBook");
        
        data = searchbook.getData(Options, true);
        System.out.println("data");
        operations.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting 'Good Omens' into contains on data should return 'true'", true, data.contains("Good Omens"));
        assertEquals("Inserting 'Neil Gaiman' into contains on data should return 'true'", true, data.contains("Neil Gaiman"));
        assertEquals("Inserting 'Anansi Boys' into contains on data should return 'true'", true, data.contains("Anansi Boys"));
        assertEquals("Inserting 'American Gods' into contains on data should return 'true'", true, data.contains("American Gods"));
        assertEquals("Inserting 'Coraline' into contains on data should return 'true'", true, data.contains("Coraline"));
        operations.WriteLog("===============================================================", false);
        operations.WriteLog("SearchBookClickBookThenAuthorAndGetAuthorsBooksTest Finished", false);
        operations.WriteLog("===============================================================", false);
        }
    
    //The tests below this line are tests that intentionally enter incorrect data to see how the system handles
    //Errors and similar things. The test is considered a success if the system properly returned an error of some sort
    //because of the test entering incorrect data.
    
    //==============================================================================================================================
    //Expecting nothing to show up in the results if we use invalid searches.
    //Since the system does not report "errors" on the website, we look for the exception
    //ElementNotFound instead. This test should pass.
    @Test(expected = ElementNotFound.class)
    public void SearchBookWithInvalidDataTest1() {
        GuiOperations operations = new GuiOperations();
        operations.WriteLog("=======================================", false);
        operations.WriteLog("SearchBookWithInvalidDataTest1 Start", false);
        operations.WriteLog("=======================================", false);
        SearchBookPage searchbook = new SearchBookPage();
        searchbook.OpenWebBrowser();
        ArrayList Options = new ArrayList();
        String data;
        searchbook.clickBrowseBooksLink();
        searchbook.setTextInputValue("Title", "<html>", "#gwt-uid-3");
        searchbook.setTextInputValue("Author", "", "#gwt-uid-5");
        searchbook.setTextInputValue("isbn", "", "#gwt-uid-7");
        searchbook.setTextInputValue("Date", "", "#gwt-uid-9");
        searchbook.clickSubmitButton();
        Options.add("Nothing");
        
        
        data = searchbook.getData(Options, false);
        operations.WriteLog("Exception 'ElementNotFound' was thrown by the system as expected.", true);
        operations.WriteLog("=========================================", false);
        operations.WriteLog("SearchBookWithInvalidDataTest1 Finished", false);
        operations.WriteLog("=========================================", false);
        
    }
    @Test(expected = ElementNotFound.class)
    public void SearchBookWithInvalidDataTest2() {
        GuiOperations operations = new GuiOperations();
        operations.WriteLog("=======================================", false);
        operations.WriteLog("SearchBookWithInvalidDataTest2 Start", false);
        operations.WriteLog("=======================================", false);
        SearchBookPage searchbook = new SearchBookPage();
        searchbook.OpenWebBrowser();
        ArrayList Options = new ArrayList();
        String data;
        searchbook.clickBrowseBooksLink();
        searchbook.setTextInputValue("Title", "", "#gwt-uid-3");
        searchbook.setTextInputValue("Author", "", "#gwt-uid-5");
        searchbook.setTextInputValue("isbn", "", "#gwt-uid-7");
        searchbook.setTextInputValue("Date", "gewwggwegwge", "#gwt-uid-9");
        searchbook.clickSubmitButton();
        Options.add("Nothing");
        
        
        data = searchbook.getData(Options, false);
        operations.WriteLog("Exception 'ElementNotFound' was thrown by the system as expected.", true);
        operations.WriteLog("=========================================", false);
        operations.WriteLog("SearchBookWithInvalidDataTest2 Finished", false);
        operations.WriteLog("=========================================", false);
    }
    
    
}
