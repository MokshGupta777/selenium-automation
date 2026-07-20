package com.moksh.automation.flows;

import com.moksh.automation.pages.LoginPage;

public class LoginFlow {

    private final LoginPage loginPage = new LoginPage();

    public void login(String email, String password) {
        loginPage.login(email, password);
    }

    public boolean isLoginSuccessful() {
        return loginPage.isLoggedIn();
    }

    public boolean isLoginFailed() {
        return loginPage.isLoginErrorDisplayed();
    }

    public String getLoginErrorMessage() {
        return loginPage.getLoginError();
    }
}