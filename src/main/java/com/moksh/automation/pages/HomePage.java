package com.moksh.automation.pages;

import com.moksh.automation.base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private final By signupLoginButton =
            By.xpath("//a[contains(text(),'Signup / Login')]");

    private final By homeLogo =
            By.cssSelector("img[alt='Website for automation practice']");

    public void open(String url) {
        getDriver().get(url);
    }

    public boolean isHomePageDisplayed() {
        return isDisplayed(homeLogo);
    }

    public void clickSignupLogin() {
        click(signupLoginButton);
    }
}