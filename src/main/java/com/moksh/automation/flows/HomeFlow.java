package com.moksh.automation.flows;

import com.moksh.automation.pages.HomePage;
import com.moksh.automation.config.ConfigReader;

public class HomeFlow {

    private final HomePage homePage = new HomePage();

    public void openApplication() {
        homePage.open(ConfigReader.getBaseUrl());
    }

    public void navigateToLoginPage() {
        homePage.clickSignupLogin();
    }

    public boolean isHomePageDisplayed() {
        return homePage.isHomePageDisplayed();
    }
}