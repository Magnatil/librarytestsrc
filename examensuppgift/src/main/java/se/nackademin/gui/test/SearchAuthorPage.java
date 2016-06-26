/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.gui.test;

import static com.codeborne.selenide.Selenide.$;
import java.util.ArrayList;

/**
 *
 * @author cbg-fynrir
 */
public class SearchAuthorPage extends MenuPage {
    
    
    public void clickSubmitButton() {
        this.WriteLog("Clicking the submit button to search for author(s).", true);
        $("#search-authors-button").click();
    }
    
    public String getData(ArrayList Options, boolean bool) {
        String data;
        data = this.getResultsFromAuthorSearch(Options, bool);
        return data;
    }
}
