/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.gui.test;

import com.codeborne.selenide.ex.ElementNotFound;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cbg-fynrir
 */
public class AuthorsGuiSelenideTest {
    
    @Test
    public void SearchAuthorsTest1() {
        SearchAuthorPage searchauthor = new SearchAuthorPage();
        searchauthor.OpenWebBrowser();
        
        searchauthor.clickBrowseAuthorsLink();
        searchauthor.clickSubmitButton();
        ArrayList Options = new ArrayList();
        Options.add("Nothing");
        String data;
        data = searchauthor.getData(Options, false);
        searchauthor.WriteLog("Making the assertion(s).", true);
        assertEquals("Inserting 'Stephen Baxter' into the contains for data should return 'true'",true,data.contains("Stephen Baxter"));
        
    }
    @Test
    public void SearchAuthorsTest2() {
        SearchAuthorPage searchauthor = new SearchAuthorPage();
        searchauthor.OpenWebBrowser();
        
        searchauthor.clickBrowseAuthorsLink();
        searchauthor.setTextInputValue("Name", "Stephen Baxter", "#gwt-uid-3");
        searchauthor.clickSubmitButton();
        ArrayList Options = new ArrayList();
        Options.add("Nothing");
        String data;
        data = searchauthor.getData(Options, false);
        searchauthor.WriteLog("Making the assertion(s).", true);
        assertEquals("Inserting 'Stephen Baxter' into the contains for data should return 'true'",true,data.contains("Stephen Baxter"));
    }
    @Test
    public void SearchAuthorsTest3() {
        SearchAuthorPage searchauthor = new SearchAuthorPage();
        searchauthor.OpenWebBrowser();
        
        searchauthor.clickBrowseAuthorsLink();
        searchauthor.setTextInputValue("Name", "Great", "#gwt-uid-5");
        searchauthor.clickSubmitButton();
        ArrayList Options = new ArrayList();
        Options.add("Nothing");
        String data;
        data = searchauthor.getData(Options, false);
        searchauthor.WriteLog("Making the assertion(s).", true);
        assertEquals("Inserting 'Great Britain' into the contains for data should return 'true'",true,data.contains("Great Britain"));
    }
    @Test
    public void SearchAuthorAndClickOnAuthorTest() {
        SearchAuthorPage searchauthor = new SearchAuthorPage();
        searchauthor.OpenWebBrowser();
        
        searchauthor.clickBrowseAuthorsLink();
        searchauthor.setTextInputValue("Name", "Arthur C. Clarke", "#gwt-uid-3");
        searchauthor.clickSubmitButton();
        ArrayList Options = new ArrayList();
        Options.add("ClickAuthor");
        String data;
        data = searchauthor.getData(Options, false);
        searchauthor.WriteLog("Making the assertion(s).", true);
        assertEquals("Inserting 'Arthur C. Clarke' into the contains for data should return 'true'",true,data.contains("Arthur C. Clarke"));
        assertEquals("Inserting 'Great Britain' into the contains for data should return 'true'",true,data.contains("Great Britain"));
        assertEquals("Inserting 'Sri Lankabhimanya Sir Arthur Charles Clarke' into the contains for data should return 'true'",true,data.contains("Sri Lankabhimanya Sir Arthur Charles Clarke"));
    }
    @Test
    public void SearchAuthorAndClickOnAuthorAndGetTableOfBooksFromAuthorTest() {
        SearchAuthorPage searchauthor = new SearchAuthorPage();
        searchauthor.OpenWebBrowser();
        
        searchauthor.clickBrowseAuthorsLink();
        searchauthor.setTextInputValue("Name", "Arthur C. Clarke", "#gwt-uid-3");
        searchauthor.clickSubmitButton();
        ArrayList Options = new ArrayList();
        Options.add("ClickAuthor");
        String data;
        data = searchauthor.getData(Options, true);
        searchauthor.WriteLog("Making the assertion(s).", true);
        assertEquals("Inserting 'Rendezvous with Rama' into the contains for data should return 'true'",true,data.contains("Rendezvous with Rama"));
        
    }
    
    @Test(expected = ElementNotFound.class)
    public void SearchAuthorWithInvalidData() {
        SearchAuthorPage searchauthor = new SearchAuthorPage();
        searchauthor.OpenWebBrowser();
        
        searchauthor.clickBrowseAuthorsLink();
        searchauthor.setTextInputValue("Name", "3463636346255", "#gwt-uid-5");
        searchauthor.clickSubmitButton();
        ArrayList Options = new ArrayList();
        Options.add("Nothing");
        String data;
        data = searchauthor.getData(Options, false);
        searchauthor.WriteLog("Exception 'ElementNotFound' was thrown by the system as expected.", true);
    }
    
}
