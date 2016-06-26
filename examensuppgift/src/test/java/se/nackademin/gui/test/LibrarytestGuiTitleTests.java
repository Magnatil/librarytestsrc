/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.gui.test;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This testfile will test searching for a book, a author, and clicking on links
 * and asserting that the title in the browser is correct.
 * @author cbg-fynrir
 */
public class LibrarytestGuiTitleTests {
   @Test 
   public void MainPageTitleTest() {
       GuiOperations operations = new GuiOperations();
        operations.WriteLog("============================", false);
        operations.WriteLog("MainPageTitleTest Start", false);
        operations.WriteLog("============================", false);
       MenuPage menupage = new MenuPage();
       menupage.OpenWebBrowser();
       String data = menupage.getSiteTitle();
       operations.WriteLog("Making the assertion(s)", true);
       assertEquals("Inserting 'Library Test Application' into the contains should return 'true'",true,data.contains("Library Test Application"));
       operations.WriteLog("============================", false);
        operations.WriteLog("MainPageTitleTest Finished", false);
        operations.WriteLog("============================", false);
   }
   @Test
   public void BrowseBooksTitleTest() {
       GuiOperations operations = new GuiOperations();
        operations.WriteLog("============================", false);
        operations.WriteLog("BrowseBooksTitleTest Start", false);
        operations.WriteLog("============================", false);
       SearchBookPage searchbook = new SearchBookPage();
       searchbook.OpenWebBrowser();
       
       
        
        String data;
        searchbook.clickBrowseBooksLink();
        data = searchbook.getSiteTitle();
        operations.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting 'Browse books' into the contains should return 'true'",true,data.contains("Browse books"));
        operations.WriteLog("===============================", false);
        operations.WriteLog("BrowseBooksTitleTest Finished", false);
        operations.WriteLog("===============================", false);
   }
   @Test
   public void SearchBooksTitleTest() {
       GuiOperations operations = new GuiOperations();
        operations.WriteLog("============================", false);
        operations.WriteLog("SearchBooksTitleTest Start", false);
        operations.WriteLog("============================", false);
       SearchBookPage searchbook = new SearchBookPage();
       searchbook.OpenWebBrowser();
       searchbook.clickBrowseBooksLink();
       String data;
        searchbook.setTextInputValue("Title", "Oryx and Crake", "#gwt-uid-3");
        searchbook.setTextInputValue("Author", "", "#gwt-uid-5");
        searchbook.setTextInputValue("isbn", "", "#gwt-uid-7");
        searchbook.setTextInputValue("Date", "", "#gwt-uid-9");
        searchbook.clickSubmitButton();
        searchbook.clickElement("BookFirstResult", "td.v-grid-cell:nth-child(1) > a:nth-child(1)");
        data = searchbook.getSiteTitle();
       operations.WriteLog("Making the assertion(s)", true);
       assertEquals("Inserting 'View book: Oryx and Crake' into the contains should return 'true'",true,data.contains("View book: Oryx and Crake"));
       operations.WriteLog("===============================", false);
        operations.WriteLog("SearchBooksTitleTest Finished", false);
        operations.WriteLog("==============================", false);
       
   }
   @Test
   public void BrowseAuthorsTitleTest() {
       GuiOperations operations = new GuiOperations();
        operations.WriteLog("============================", false);
        operations.WriteLog("BrowseAuthorsTitleTest Start", false);
        operations.WriteLog("============================", false);
       SearchAuthorPage searchauthor = new SearchAuthorPage();
       searchauthor.OpenWebBrowser();
       
       
        
        String data;
        searchauthor.clickBrowseAuthorsLink();
        data = searchauthor.getSiteTitle();
        operations.WriteLog("Making the assertion(s)", true);
        
        assertEquals("Inserting 'Browse authors' into the contains should return 'true'",true,data.contains("Browse authors"));
        operations.WriteLog("=================================", false);
        operations.WriteLog("BrowseAuthorsTitleTest Finished", false);
        operations.WriteLog("=================================", false);
   }
   @Test
   public void SearchAuthorTitleTest() {
       GuiOperations operations = new GuiOperations();
        operations.WriteLog("============================", false);
        operations.WriteLog("SearchAuthorTitleTest Start", false);
        operations.WriteLog("============================", false);
       SearchAuthorPage searchauthor = new SearchAuthorPage();
       searchauthor.OpenWebBrowser();
       String data;
       
       searchauthor.clickBrowseAuthorsLink();
       searchauthor.setTextInputValue("Name", "Arthur C. Clarke", "#gwt-uid-3");
       searchauthor.setTextInputValue("Country", "", "#gwt-uid-5");
       searchauthor.clickSubmitButton();
       searchauthor.clickElement("BookFirstResult", "td.v-grid-cell:nth-child(1) > a:nth-child(1)");
       
       data = searchauthor.getSiteTitle();
       operations.WriteLog("Making the assertion(s)", true);
       assertEquals("Inserting 'View author: Arthur C. Clarke' into contains on data should return 'true'", true, data.contains("View author: Arthur C. Clarke"));
       operations.WriteLog("=================================", false);
        operations.WriteLog("SearchAuthorTitleTest Finished", false);
        operations.WriteLog("================================", false);
   }
   @Test
   public void AddUserTitleTest() {
       GuiOperations operations = new GuiOperations();
        operations.WriteLog("============================", false);
        operations.WriteLog("AddUserTitleTest Start", false);
        operations.WriteLog("============================", false);
       MenuPage menupage = new MenuPage();
       menupage.OpenWebBrowser();
       String data;
       menupage.clickNewUserLink();
       
       data = menupage.getSiteTitle();
       operations.WriteLog("Making the assertion(s)", true);
       assertEquals("Inserting 'Add user' into contains on data should return 'true'", true, data.contains("Add user"));
       operations.WriteLog("============================", false);
        operations.WriteLog("AddUserTitleTest Finished", false);
        operations.WriteLog("============================", false);
   }
   @Test
   public void SignInTitleTest() {
       GuiOperations operations = new GuiOperations();
        operations.WriteLog("============================", false);
        operations.WriteLog("SignInTitleTest Start", false);
        operations.WriteLog("============================", false);
       MenuPage menupage = new MenuPage();
       menupage.OpenWebBrowser();
       String data;
       menupage.clickSignInLink();
       
       data = menupage.getSiteTitle();
       operations.WriteLog("Making the assertion(s)", true);
       assertEquals("Inserting 'Sign in' into contains on data should return 'true'", true, data.contains("Sign in"));
       operations.WriteLog("=============================", false);
        operations.WriteLog("SignInTitleTest Finished", false);
        operations.WriteLog("============================", false);
   }
   @Test
   public void SignOutTitleTest() {
       GuiOperations operations = new GuiOperations();
        operations.WriteLog("============================", false);
        operations.WriteLog("SignOutTitleTest Start", false);
        operations.WriteLog("============================", false);
       MenuPage menupage = new MenuPage();
       menupage.OpenWebBrowser();
       String data;
       menupage.clickSignOutLink();
       
       data = menupage.getSiteTitle();
       operations.WriteLog("Making the assertion(s)", true);
       assertEquals("Inserting 'Sign out' into contains on data should return 'true'", true, data.contains("Sign out"));
       operations.WriteLog("============================", false);
        operations.WriteLog("SignOutTitleTest Finished", false);
        operations.WriteLog("============================", false);
   }
   
   
    
}
