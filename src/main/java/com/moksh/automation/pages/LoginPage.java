package com.moksh.automation.pages;

import com.moksh.automation.base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    // Locators
    private final By usernameInput = By.id("username");

    private final By passwordInput = By.id("password");

    private final By loginButton = By.id("submit");

    private final By successMessage =
            By.xpath("//h1[contains(text(),'Logged In Successfully')]");

    private final By errorMessage =
            By.id("error");

    /**
     * Opens the login page.
     */
    public void open(String url) {
        getDriver().get(url);
    }

    /**
     * Enters the username.
     */
    public void enterUsername(String username) {
        type(usernameInput, username);
    }

    /**
     * Enters the password.
     */
    public void enterPassword(String password) {
        type(passwordInput, password);
    }

    /**
     * Clicks the Login button.
     */
    public void clickLogin() {
        click(loginButton);
    }

    /**
     * Performs a login.
     */
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }

    /**
     * Returns the success message.
     */
    public String getSuccessMessage() {
        return getText(successMessage);
    }

    /**
     * Returns the error message.
     */
    public String getErrorMessage() {
        return getText(errorMessage);
    }

    /**
     * Checks if success message is displayed.
     */
    public boolean isLoginSuccessful() {
        return isDisplayed(successMessage);
    }

    /**
     * Checks if error message is displayed.
     */
    public boolean isLoginFailed() {
        return isDisplayed(errorMessage);
    }
}