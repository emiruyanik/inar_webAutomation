package utils;

import pages.HomePage;
import pages.WebAutomationPage;
import pages.draggable.ConstrainMovement;

public class Pages {
    public Pages(){

    }
    public HomePage getHomePage(){
        return new HomePage();
    }
    public WebAutomationPage getWebAutomationPage(){
        return new WebAutomationPage();
    }
    public ConstrainMovement getConstrainMovement(){
        return new ConstrainMovement();
    }
}
