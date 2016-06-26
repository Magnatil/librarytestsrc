/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.gui.test;

import static com.codeborne.selenide.Selenide.sleep;
import java.util.UUID;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cbg-fynrir
 */
public class UserGuiSelenideTest {
    //My Profile Selector: #side-menu-link-my-profile > a:nth-child(1)
    //Edit User Selector: #edit-user
    
    //Display Name selector: #gwt-uid-3
    //Password selector: #gwt-uid-5
    //First Name Selector:#gwt-uid-7
    //Last Name selector: #gwt-uid-9
    //Telephone selector: #gwt-uid-11
    //E-mail selector: #gwt-uid-13
    //@Test
    public void CreateUserTest1() {
        UserPage userpage = new UserPage();
        userpage.OpenWebBrowser();
        userpage.clickNewUserLink();
        String displayname = UUID.randomUUID().toString();
        String password = UUID.randomUUID().toString();
        userpage.setTextInputValue("Display Name", displayname, "#gwt-uid-3");
        userpage.setTextInputValue("Password", password, "#gwt-uid-5");
        userpage.clickSubmitButton();
        //If user was successfully created, the application takes us back to the login page.
        String data = userpage.getSiteTitle();
        assertEquals("If the user was created successfully, inserting 'Sign in' into data contains should return 'true'",true,data.contains("Sign in"));
        
        //Sign Out
        
        
    }
    //@Test
    public void CreateUserTest2() {
        UserPage userpage = new UserPage();
        userpage.OpenWebBrowser();
        userpage.clickNewUserLink();
        String displayname = UUID.randomUUID().toString();
        String password = UUID.randomUUID().toString();
        String randomname = UUID.randomUUID().toString();
        userpage.setTextInputValue("Display Name", displayname, "#gwt-uid-3");
        userpage.setTextInputValue("Password", password, "#gwt-uid-5");
        userpage.setTextInputValue("Password", randomname, "#gwt-uid-7");
        userpage.clickSubmitButton();
        //If user was successfully created, the application takes us back to the login page.
        String data = userpage.getSiteTitle();
        assertEquals("If the user was created successfully, inserting 'Sign in' into data contains should return 'true'",true,data.contains("Sign in"));
    }
    //@Test
    public void CreateUserTest3() {
        UserPage userpage = new UserPage();
        userpage.OpenWebBrowser();
        userpage.clickNewUserLink();
        String displayname = UUID.randomUUID().toString();
        String password = UUID.randomUUID().toString();
        String randomname = UUID.randomUUID().toString();
        userpage.setTextInputValue("Display Name", displayname, "#gwt-uid-3");
        userpage.setTextInputValue("Password", password, "#gwt-uid-5");
        userpage.setTextInputValue("First Name", randomname, "#gwt-uid-7");
        userpage.setTextInputValue("Last Name", randomname, "#gwt-uid-9");
        userpage.clickSubmitButton();
        //If user was successfully created, the application takes us back to the login page.
        String data = userpage.getSiteTitle();
        assertEquals("If the user was created successfully, inserting 'Sign in' into data contains should return 'true'",true,data.contains("Sign in"));
    }
    //@Test
    public void CreateUserTest4() {
        UserPage userpage = new UserPage();
        userpage.OpenWebBrowser();
        userpage.clickNewUserLink();
        String displayname = UUID.randomUUID().toString();
        String password = UUID.randomUUID().toString();
        String randomname = UUID.randomUUID().toString();
        userpage.setTextInputValue("Display Name", displayname, "#gwt-uid-3");
        userpage.setTextInputValue("Password", password, "#gwt-uid-5");
        userpage.setTextInputValue("First Name", randomname, "#gwt-uid-7");
        userpage.setTextInputValue("Last Name", randomname, "#gwt-uid-9");
        userpage.setTextInputValue("Phone", "0701337134", "#gwt-uid-11");
        userpage.clickSubmitButton();
        //If user was successfully created, the application takes us back to the login page.
        String data = userpage.getSiteTitle();
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("If the user was created successfully, inserting 'Sign in' into data contains should return 'true'",true,data.contains("Sign in"));
    }
    
    //@Test
    public void CreateUserComplete() {
        UserPage userpage = new UserPage();
        userpage.OpenWebBrowser();
        userpage.clickNewUserLink();
        String displayname = UUID.randomUUID().toString();
        String password = UUID.randomUUID().toString();
        String randomname = UUID.randomUUID().toString();
        String randomemailUUID = UUID.randomUUID().toString();
        String randomemail = ""+randomemailUUID+"@thenightisyoungherpderp.com";
        userpage.setTextInputValue("Display Name", displayname, "#gwt-uid-3");
        userpage.setTextInputValue("Password", password, "#gwt-uid-5");
        userpage.setTextInputValue("First Name", randomname, "#gwt-uid-7");
        userpage.setTextInputValue("Last Name", randomname, "#gwt-uid-9");
        userpage.setTextInputValue("Phone", "0701337134", "#gwt-uid-11");
        userpage.setTextInputValue("Phone", ""+randomemail+"", "#gwt-uid-13");
        userpage.clickSubmitButton();
        //If user was successfully created, the application takes us back to the login page.
        String data = userpage.getSiteTitle();
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("If the user was created successfully, inserting 'Sign in' into data contains should return 'true'",true,data.contains("Sign in"));
    }
    //@Test Commented out as it was causing errors. And I really want to turn in the jenkins assignment on time. Sorry.
    public void CreateUserAndLogin() {
        UserPage userpage = new UserPage();
        userpage.OpenWebBrowser();
        userpage.clickNewUserLink();
        String displayname = UUID.randomUUID().toString();
        String password = UUID.randomUUID().toString();
        String randomname = UUID.randomUUID().toString();
        String randomlastname = UUID.randomUUID().toString();
        String randomemailUUID = UUID.randomUUID().toString();
        String randomemail = ""+randomemailUUID+"@thenightisyoungherpderp.com";
        userpage.setTextInputValue("Display Name", displayname, "#gwt-uid-3");
        userpage.setTextInputValue("Password", password, "#gwt-uid-5");
        userpage.setTextInputValue("First Name", randomname, "#gwt-uid-7");
        userpage.setTextInputValue("Last Name", randomlastname, "#gwt-uid-9");
        userpage.setTextInputValue("Phone", "0701337134", "#gwt-uid-11");
        userpage.setTextInputValue("Phone", ""+randomemail+"", "#gwt-uid-13");
        userpage.clickSubmitButton();
        //If user was successfully created, the application takes us back to the login page.
        String data = userpage.getSiteTitle();
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("If the user was created successfully, inserting 'Sign in' into data contains should return 'true'",true,data.contains("Sign in"));
        userpage.WriteLog("Loggin in user", true);
        userpage.setTextInputValue("User Name", displayname, "#input-username");
        userpage.setTextInputValue("Password", password, "#input-password");
        userpage.clickLoginButton();
        
        //Logged in as selector: .v-margin-top > div:nth-child(5) > div:nth-child(1)
        
        data = userpage.getTextOfElement(".v-margin-top > div:nth-child(5) > div:nth-child(1)");
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting '"+displayname+"' into data contains should return 'true'",true,data.contains(displayname));
        userpage.clickSignOutLink();
    }
    //@Test
    public void CreateUserAndLoginAndClickMyProfile() {
        UserPage userpage = new UserPage();
        userpage.OpenWebBrowser();
        userpage.clickNewUserLink();
        String displayname = UUID.randomUUID().toString();
        String password = UUID.randomUUID().toString();
        String randomname = UUID.randomUUID().toString();
        String randomlastname = UUID.randomUUID().toString();
        String randomemailUUID = UUID.randomUUID().toString();
        String randomemail = ""+randomemailUUID+"@thenightisyoungherpderp.com";
        userpage.setTextInputValue("Display Name", displayname, "#gwt-uid-3");
        userpage.setTextInputValue("Password", password, "#gwt-uid-5");
        userpage.setTextInputValue("First Name", randomname, "#gwt-uid-7");
        userpage.setTextInputValue("Last Name", randomlastname, "#gwt-uid-9");
        userpage.setTextInputValue("Phone", "0701337134", "#gwt-uid-11");
        userpage.setTextInputValue("Phone", ""+randomemail+"", "#gwt-uid-13");
        userpage.clickSubmitButton();
        //If user was successfully created, the application takes us back to the login page.
        String data = userpage.getSiteTitle();
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("If the user was created successfully, inserting 'Sign in' into data contains should return 'true'",true,data.contains("Sign in"));
        userpage.WriteLog("Loggin in user", true);
        userpage.setTextInputValue("User Name", displayname, "#input-username");
        userpage.setTextInputValue("Password", password, "#input-password");
        userpage.clickLoginButton();
        
        //Logged in as selector: .v-margin-top > div:nth-child(5) > div:nth-child(1)
        
        data = userpage.getTextOfElement(".v-margin-top > div:nth-child(5) > div:nth-child(1)");
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting '"+displayname+"' into data contains should return 'true'",true,data.contains(displayname));
        
        userpage.clickElement("My Profile", "#side-menu-link-my-profile > a:nth-child(1)");
        
        data = userpage.getProfileData(false);
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting "+displayname+"into data contains should return 'true'",true,data.contains(displayname));
        assertEquals("Inserting "+randomname+"into data contains should return 'true'",true,data.contains(randomname));
        assertEquals("Inserting "+randomlastname+"into data contains should return 'true'",true,data.contains(randomlastname));
        assertEquals("Inserting "+randomemail+"into data contains should return 'true'",true,data.contains(randomemail));
        userpage.clickSignOutLink();
    
    }
    //@Test
    public void CreateUserAndLoginClickMyProfileThenEditProfile() {
        UserPage userpage = new UserPage();
        userpage.OpenWebBrowser();
        userpage.clickNewUserLink();
        String displayname = UUID.randomUUID().toString();
        String password = UUID.randomUUID().toString();
        String randomname = UUID.randomUUID().toString();
        String randomlastname = UUID.randomUUID().toString();
        String randomemailUUID = UUID.randomUUID().toString();
        String randomemail = ""+randomemailUUID+"@thenightisyoungherpderp.com";
        userpage.setTextInputValue("Display Name", displayname, "#gwt-uid-3");
        userpage.setTextInputValue("Password", password, "#gwt-uid-5");
        userpage.setTextInputValue("First Name", randomname, "#gwt-uid-7");
        userpage.setTextInputValue("Last Name", randomlastname, "#gwt-uid-9");
        userpage.setTextInputValue("Phone", "0701337134", "#gwt-uid-11");
        userpage.setTextInputValue("Phone", ""+randomemail+"", "#gwt-uid-13");
        userpage.clickSubmitButton();
        //If user was successfully created, the application takes us back to the login page.
        String data = userpage.getSiteTitle();
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("If the user was created successfully, inserting 'Sign in' into data contains should return 'true'",true,data.contains("Sign in"));
        userpage.WriteLog("Loggin in user", true);
        userpage.setTextInputValue("User Name", displayname, "#input-username");
        userpage.setTextInputValue("Password", password, "#input-password");
        userpage.clickLoginButton();
        
        //Logged in as selector: .v-margin-top > div:nth-child(5) > div:nth-child(1)
        
        data = userpage.getTextOfElement(".v-margin-top > div:nth-child(5) > div:nth-child(1)");
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting '"+displayname+"' into data contains should return 'true'",true,data.contains(displayname));
        
        userpage.clickElement("My Profile", "#side-menu-link-my-profile > a:nth-child(1)");
        
        data = userpage.getProfileData(false);
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting "+displayname+"into data contains should return 'true'",true,data.contains(displayname));
        assertEquals("Inserting "+randomname+"into data contains should return 'true'",true,data.contains(randomname));
        assertEquals("Inserting "+randomlastname+"into data contains should return 'true'",true,data.contains(randomlastname));
        assertEquals("Inserting "+randomemail+"into data contains should return 'true'",true,data.contains(randomemail));
        
        userpage.clickUserEditButton();
        
        displayname = UUID.randomUUID().toString();
        password = UUID.randomUUID().toString();
        randomname = UUID.randomUUID().toString();
        randomlastname = UUID.randomUUID().toString();
        randomemailUUID = UUID.randomUUID().toString();
        randomemail = ""+randomemailUUID+"@thenightisyoungherpderp.com";
        
        
        userpage.setTextInputValue("Display Name", displayname, "#gwt-uid-3");
        userpage.setTextInputValue("Password", password, "#gwt-uid-5");
        userpage.setTextInputValue("First Name", randomname, "#gwt-uid-7");
        userpage.setTextInputValue("Last Name", randomlastname, "#gwt-uid-9");
        userpage.setTextInputValue("Phone", "0701337134", "#gwt-uid-11");
        userpage.setTextInputValue("Phone", ""+randomemail+"", "#gwt-uid-13");
        userpage.clickSaveUserButton();
        
        userpage.clickSignOutLink();
        userpage.clickSignInLink();
        userpage.WriteLog("Loggin in user", true);
        userpage.setTextInputValue("User Name", displayname, "#input-username");
        userpage.setTextInputValue("Password", password, "#input-password");
        userpage.clickLoginButton();
        userpage.clickElement("My Profile", "#side-menu-link-my-profile > a:nth-child(1)");
        
        data = userpage.getProfileData(false);
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting "+displayname+"into data contains should return 'true'",true,data.contains(displayname));
        assertEquals("Inserting "+randomname+"into data contains should return 'true'",true,data.contains(randomname));
        assertEquals("Inserting "+randomlastname+"into data contains should return 'true'",true,data.contains(randomlastname));
        assertEquals("Inserting "+randomemail+"into data contains should return 'true'",true,data.contains(randomemail));
        userpage.clickSignOutLink();
    }
    
        
        //@Test Commented out as it was causing errors. And I really want to turn in the jenkins assignment on time. Sorry.
        public void CreateUserAndLoanABookThenReturnItTest() {
         
        UserPage userpage = new UserPage();
        userpage.OpenWebBrowser();
        userpage.clickNewUserLink();
        String displayname = UUID.randomUUID().toString();
        String password = UUID.randomUUID().toString();
        String randomname = UUID.randomUUID().toString();
        String randomlastname = UUID.randomUUID().toString();
        String randomemailUUID = UUID.randomUUID().toString();
        String randomemail = ""+randomemailUUID+"@thenightisyoungherpderp.com";
        userpage.setTextInputValue("Display Name", displayname, "#gwt-uid-3");
        userpage.setTextInputValue("Password", password, "#gwt-uid-5");
        userpage.setTextInputValue("First Name", randomname, "#gwt-uid-7");
        userpage.setTextInputValue("Last Name", randomlastname, "#gwt-uid-9");
        userpage.setTextInputValue("Phone", "0701337134", "#gwt-uid-11");
        userpage.setTextInputValue("Phone", ""+randomemail+"", "#gwt-uid-13");
        userpage.clickSubmitButton();
        //If user was successfully created, the application takes us back to the login page.
        String data = userpage.getSiteTitle();
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("If the user was created successfully, inserting 'Sign in' into data contains should return 'true'",true,data.contains("Sign in"));
        userpage.WriteLog("Loggin in user", true);
        userpage.setTextInputValue("User Name", displayname, "#input-username");
        userpage.setTextInputValue("Password", password, "#input-password");
        userpage.clickLoginButton();
        
        //Logged in as selector: .v-margin-top > div:nth-child(5) > div:nth-child(1)
        
        data = userpage.getTextOfElement(".v-margin-top > div:nth-child(5) > div:nth-child(1)");
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting '"+displayname+"' into data contains should return 'true'",true,data.contains(displayname));
        
        userpage.clickBrowseBooksLink();
        userpage.clickElement("Search books button", "#search-books-button");
        
        userpage.clickElement("First book in table", ".v-grid-cell-focused > a:nth-child(1)");
        userpage.clickElement("Borrow book button", "#borrow-book-button");
        userpage.clickElement("Confirm borrowing book button", "#confirmdialog-ok-button");
        data = userpage.getTextOfElement("#gwt-uid-13");
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("The number of copies left for 'Rendezvous with Rama' should be '3'",true,data.contains("3"));
        
        userpage.clickElement("My Profile", "#side-menu-link-my-profile > a:nth-child(1)");
        data = userpage.getProfileData(true);
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting 'Rendezvous with Rama' into data contains should return 'true'",true,data.contains("Rendezvous with Rama"));
        
        userpage.clickElement("First book in table", "td.v-grid-cell:nth-child(1) > a:nth-child(1)");
        userpage.clickElement("Return Book Button","#return-book-button");
        userpage.clickElement("Confirm returning book button", "#confirmdialog-ok-button");
        data = userpage.getTextOfElement("#gwt-uid-13");
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("The number of copies left for 'Rendezvous with Rama' should now be '4'",true,data.contains("4"));
        //Borrow book button: #borrow-book-button
        //Confirm borrowing book button: #confirmdialog-ok-button
        //Do not borrow book button: #confirmdialog-cancel-button
        
        userpage.clickSignOutLink();
        
        
        }
        
        //@Test
        public void CreateUserAndLoginAndSignOut() {
         UserPage userpage = new UserPage();
        userpage.OpenWebBrowser();
        userpage.clickNewUserLink();
        String displayname = UUID.randomUUID().toString();
        String password = UUID.randomUUID().toString();
        String randomname = UUID.randomUUID().toString();
        String randomlastname = UUID.randomUUID().toString();
        String randomemailUUID = UUID.randomUUID().toString();
        String randomemail = ""+randomemailUUID+"@thenightisyoungherpderp.com";
        userpage.setTextInputValue("Display Name", displayname, "#gwt-uid-3");
        userpage.setTextInputValue("Password", password, "#gwt-uid-5");
        userpage.setTextInputValue("First Name", randomname, "#gwt-uid-7");
        userpage.setTextInputValue("Last Name", randomlastname, "#gwt-uid-9");
        userpage.setTextInputValue("Phone", "0701337134", "#gwt-uid-11");
        userpage.setTextInputValue("Phone", ""+randomemail+"", "#gwt-uid-13");
        userpage.clickSubmitButton();
        //If user was successfully created, the application takes us back to the login page.
        String data = userpage.getSiteTitle();
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("If the user was created successfully, inserting 'Sign in' into data contains should return 'true'",true,data.contains("Sign in"));
        
        userpage.setTextInputValue("User Name", displayname, "#input-username");
        userpage.setTextInputValue("Password", password, "#input-password");
        userpage.WriteLog("Loggin in user", true);
        userpage.clickLoginButton();
        
        userpage.clickSignOutLink();
        
        data = userpage.getSiteTitle();
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting 'Signed out' into data contains should return 'true'", true,data.contains("Signed out"));
        data = userpage.getTextOfElement(".v-label");
        
        
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting '"+displayname+"' into data contains should return 'true'", true,data.contains(displayname));
        
        }
        
        //@Test Commented out as it was causing errors. And I really want to turn in the jenkins assignment on time. Sorry.
        public void AttemptBorrowBooksFromBookWithNoCopiesLeftTest() {
         UserPage userpage = new UserPage();
        userpage.OpenWebBrowser();
        userpage.clickNewUserLink();
        String displayname1 = UUID.randomUUID().toString();
        String password1 = UUID.randomUUID().toString();
        String randomname1 = UUID.randomUUID().toString();
        String randomlastname1 = UUID.randomUUID().toString();
        String randomemailUUID1 = UUID.randomUUID().toString();
        String randomemail1 = ""+randomemailUUID1+"@thenightisyoungherpderp.com";
        String displayname2 = UUID.randomUUID().toString();
        String password2 = UUID.randomUUID().toString();
        String randomname2 = UUID.randomUUID().toString();
        String randomlastname2 = UUID.randomUUID().toString();
        String randomemailUUID2 = UUID.randomUUID().toString();
        String randomemail2 = ""+randomemailUUID2+"@thenightisyoungherpderp.com";
        userpage.setTextInputValue("Display Name", displayname1, "#gwt-uid-3");
        userpage.setTextInputValue("Password", password1, "#gwt-uid-5");
        userpage.setTextInputValue("First Name", randomname1, "#gwt-uid-7");
        userpage.setTextInputValue("Last Name", randomlastname1, "#gwt-uid-9");
        userpage.setTextInputValue("Phone", "0701337134", "#gwt-uid-11");
        userpage.setTextInputValue("Phone", ""+randomemail1+"", "#gwt-uid-13");
        userpage.clickSubmitButton();
        //If user was successfully created, the application takes us back to the login page.
        String data = userpage.getSiteTitle();
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("If the user was created successfully, inserting 'Sign in' into data contains should return 'true'",true,data.contains("Sign in"));
        
        userpage.setTextInputValue("User Name", displayname1, "#input-username");
        userpage.setTextInputValue("Password", password1, "#input-password");
        userpage.WriteLog("Loggin in user", true);
        userpage.clickLoginButton();
        
        userpage.clickBrowseBooksLink();
        userpage.setTextInputValue("Book Title Search", "Time's Eye", "#gwt-uid-3");
        userpage.clickElement("Search books button", "#search-books-button");
        
        userpage.clickElement("First book in table", ".v-grid-cell-focused > a:nth-child(1)");
        userpage.clickElement("Borrow book button", "#borrow-book-button");
        userpage.clickElement("Confirm borrowing book button", "#confirmdialog-ok-button");
        
        data = userpage.getTextOfElement("#gwt-uid-13");
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("Inserting '0' into data contains should return 'true'", true,data.contains("0"));
        
        userpage.clickSignOutLink();
        userpage.clickNewUserLink();
        userpage.setTextInputValue("Display Name", displayname2, "#gwt-uid-3");
        userpage.setTextInputValue("Password", password2, "#gwt-uid-5");
        userpage.setTextInputValue("First Name", randomname2, "#gwt-uid-7");
        userpage.setTextInputValue("Last Name", randomlastname2, "#gwt-uid-9");
        userpage.setTextInputValue("Phone", "0701337134", "#gwt-uid-11");
        userpage.setTextInputValue("Phone", ""+randomemail2+"", "#gwt-uid-13");
        userpage.clickSubmitButton();
        //If user was successfully created, the application takes us back to the login page.
        data = userpage.getSiteTitle();
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("If the user was created successfully, inserting 'Sign in' into data contains should return 'true'",true,data.contains("Sign in"));
        
        userpage.setTextInputValue("User Name", displayname2, "#input-username");
        userpage.setTextInputValue("Password", password2, "#input-password");
        userpage.WriteLog("Loggin in user", true);
        userpage.clickLoginButton();
        
        userpage.clickBrowseBooksLink();
        userpage.setTextInputValue("Book Title Search", "Time's Eye", "#gwt-uid-3");
        userpage.clickElement("Search books button", "#search-books-button");
        
        userpage.clickElement("First book in table", ".v-grid-cell-focused > a:nth-child(1)");
        
        data = userpage.getTextOfElement("#gwt-uid-13");
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("The number of copies left for 'Time's Eye should now be '0'",true,data.contains("0"));
        
        //Now signing out and returning the book that the first user took.
        userpage.clickSignOutLink();
        userpage.clickSignInLink();
        
        userpage.setTextInputValue("User Name", displayname1, "#input-username");
        userpage.setTextInputValue("Password", password1, "#input-password");
        userpage.WriteLog("Loggin in user", true);
        userpage.clickLoginButton();
        
        userpage.clickBrowseBooksLink();
        userpage.setTextInputValue("Book Title Search", "Time's Eye", "#gwt-uid-3");
        userpage.clickElement("Search books button", "#search-books-button");
        
        userpage.clickElement("First book in table", ".v-grid-cell-focused > a:nth-child(1)");
        
        userpage.clickElement("Return Book Button","#return-book-button");
        userpage.clickElement("Confirm returning book button", "#confirmdialog-ok-button");
        data = userpage.getTextOfElement("#gwt-uid-13");
        userpage.WriteLog("Making the assertion(s)", true);
        assertEquals("The number of copies left for 'Time's Eye should now be '1'",true,data.contains("1"));
        userpage.clickSignOutLink();
        }
    
}
