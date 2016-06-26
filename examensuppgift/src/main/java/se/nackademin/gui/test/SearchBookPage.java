/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.gui.test;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import java.util.ArrayList;
import org.slf4j.Logger;

/**
 *
 * @author cbg-fynrir
 */
public class SearchBookPage extends MenuPage {
    //private static final Logger LOG = Logger.getLogger(SearchBookPage.class.getName());
    //Help Methods for SearchBookPage
    
    
    
    
    public void clickSubmitButton() {
        $("#search-books-button").click();
    }
    
    public String getData(ArrayList Options, boolean bool) {
        String data;
        this.WriteLog("Getting the results from the book search, depending on the options used.", true);
        data = this.getResultsFromBookSearch(Options, bool);
        this.WriteLog("Returning the results from the getResultsFromBookSearch method (part of GuiOperations.java)", true);
        return data;
    }
        
    
    
    
}
