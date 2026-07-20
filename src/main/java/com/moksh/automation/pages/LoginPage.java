package com.moksh.automation.pages;

import com.moksh.automation.base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By emailTextbox =
            By.xpath("//input[@data-qa='login-email']");

    private final By passwordTextbox =
            By.xpath("//input[@data-qa='login-password']");

    private final By loginButton =
            By.xpath("//button[@data-qa='login-button']");

    private final By loggedInUser =
            By.xpath("//a[contains(text(),'Logged in as')]");

    private final By loginError =
            By.xpath("//p[contains(text(),'Your email or password is incorrect!')]");

    public void enterEmail(String email) {
        type(emailTextbox, email);
    }

    public void enterPassword(String password) {
        type(passwordTextbox, password);
    }

    public void clickLogin() {
        click(loginButton);
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLogin();
    }

    public boolean isLoggedIn() {
        return isDisplayed(loggedInUser);
    }

    public boolean isLoginErrorDisplayed() {
        return isDisplayed(loginError);
    }

    public String getLoginError() {
        return getText(loginError);
    }
}