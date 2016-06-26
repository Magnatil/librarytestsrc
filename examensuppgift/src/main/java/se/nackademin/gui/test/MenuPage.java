/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.gui.test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author cbg-fynrir
 */
public class MenuPage extends GuiOperations {
    
    
    private final SelenideElement browsebooksLink = $("#side-menu-link-browse-books > a:nth-child(1)");
    private final SelenideElement browseauthorsLink = $("#side-menu-link-browse-authors > a:nth-child(1)");
    private final SelenideElement newuserLink = $("#side-menu-link-add-user > a:nth-child(1)");
    private final SelenideElement signinLink = $("#side-menu-link-sign-in > a:nth-child(1)");
    private final SelenideElement signoutLink = $("#side-menu-link-sign-out > a:nth-child(1)");
    

    public void clickBrowseBooksLink() {
        this.WriteLog("Clicking on the link to Browse/Search for books.", true);
        browsebooksLink.click();
        sleep(2000);
    }
    
    public void clickBrowseAuthorsLink() {
        this.WriteLog("Clicking on the link to Browse/Search for authors.", true);
        browseauthorsLink.click();
        sleep(2000);
    }
    
    public void clickNewUserLink() {
        this.WriteLog("Clicking on the link to add users.", true);
        newuserLink.click();
        sleep(2000);
    }
    
    public void clickSignInLink() {
        this.WriteLog("Clicking on the link to login a user.", true);
        signinLink.click();
        sleep(2000);
    }
    
    public void clickSignOutLink() {
        this.WriteLog("Clicking on the link to log out a user.", true);
        signoutLink.click();
        sleep(3000);
    }
    
    public void setTextInputValue(String descriptor, String value,String elementselector) {
    //LOG.info("Setting the SelenideElement selector to " + elementselector);    
    //LOG.info("Setting " + descriptor + " to " + value);
    String elementvalue = value;
        if ("".equals(value)) {
            elementvalue = "NOTICE: This element will not be set with a value.";
        }
        this.WriteLog("Setting the SelenideElement selector to: " + elementselector, true); 
        SelenideElement element = $(elementselector);
        this.WriteLog("Setting the value of the element ("+elementselector+") to " + elementvalue, true);
        element.setValue(value);
        
    }
    
    public void clickElement(String descriptor, String elementselector) {
        //LOG.info("Setting the SelenideElement selector to " + elementselector);
        //LOG.info("Clicking on element " + descriptor + "");
        this.WriteLog("Setting the SelenideElement selector to: " + elementselector, true); 
        SelenideElement element = $(elementselector);
        this.WriteLog("Clicking on the element ("+elementselector+") and sleeping for 1000 ms", true);
        element.click();
        sleep(3000);
    }
    
    
}
