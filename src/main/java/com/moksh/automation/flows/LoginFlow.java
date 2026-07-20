package com.moksh.automation.flows;

import com.moksh.automation.data.Users;
import com.moksh.automation.pages.LoginPage;

public class LoginFlow {

    private final LoginPage loginPage;

    public LoginFlow() {
        loginPage = new LoginPage();
    }

    /**
     * Opens the login page.
     *
     * @param url Application URL
     */
    public void openLoginPage(String url) {
        loginPage.open(url);
    }

    /**
     * Logs in using valid credentials.
     */
    public void loginWithValidCredentials() {
        loginPage.login(
                Users.VALID_USERNAME,
                Users.VALID_PASSWORD
        );
    }

    /**
     * Logs in using invalid credentials.
     */
    public void loginWithInvalidCredentials() {
        loginPage.login(
                Users.INVALID_USERNAME,
                Users.INVALID_PASSWORD
        );
    }

    /**
     * Logs in using custom credentials.
     *
     * @param username Username
     * @param password Password
     */
    public void login(String username, String password) {
        loginPage.login(username, password);
    }

    /**
     * Returns the success message.
     */
    public String getSuccessMessage() {
        return loginPage.getSuccessMessage();
    }

    /**
     * Returns the error message.
     */
    public String getErrorMessage() {
        return loginPage.getErrorMessage();
    }

    /**
     * Checks whether login was successful.
     */
    public boolean isLoginSuccessful() {
        return loginPage.isLoginSuccessful();
    }

    /**
     * Checks whether login failed.
     */
    public boolean isLoginFailed() {
        return loginPage.isLoginFailed();
    }
}