/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.gui.test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

/**
 *
 * @author cbg-fynrir
 */
public class UserPage extends MenuPage{
    
    public void clickSubmitButton() {
        $("#add-user-button").click();
        sleep(3000);
    }
    public void clickUserEditButton() {
        $("#edit-user").click();
        sleep(3000);
    }
    public void clickSaveUserButton() {
       $("#save-user-button").click();
       sleep(3000);
       this.clickElement("My Profile", "#side-menu-link-my-profile > a:nth-child(1)");
       sleep(3000);
    }
    
    public void clickLoginButton() {
        $("#login-button").click();
        sleep(3000);
    }
    public String getProfileData(boolean bool) {
        String data;
        data = this.getMyProfileResults(bool);
        return data;
    }
    
    
    
    
}
