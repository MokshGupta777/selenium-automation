package com.moksh.automation.flows;

import com.moksh.automation.pages.HomePage;

public class HomeFlow {

    private final HomePage homePage = new HomePage();

    public void openApplication(String url) {
        homePage.open(url);
    }

    public void navigateToLoginPage() {
        homePage.clickSignupLogin();
    }

    public boolean isHomePageDisplayed() {
        return homePage.isHomePageDisplayed();
    }
}