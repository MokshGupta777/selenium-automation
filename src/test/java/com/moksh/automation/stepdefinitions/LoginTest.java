package com.moksh.automation.tests;

import com.moksh.automation.assertions.LoginAssertions;
import com.moksh.automation.config.ConfigReader;
import com.moksh.automation.driver.DriverFactory;
import com.moksh.automation.flows.HomeFlow;
import com.moksh.automation.flows.LoginFlow;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    private HomeFlow homeFlow;
    private LoginFlow loginFlow;
    private LoginAssertions loginAssertions;

    @BeforeMethod
    public void setUp() {

        DriverFactory.initializeDriver(
                ConfigReader.getBrowser(),
                ConfigReader.isHeadless()
        );

        homeFlow = new HomeFlow();
        loginFlow = new LoginFlow();
        loginAssertions = new LoginAssertions();
    }

    @Test
    public void loginWithValidCredentials() {

        homeFlow.openApplication();
        homeFlow.navigateToLoginPage();

        loginFlow.login(
                ConfigReader.getValidEmail(),
                ConfigReader.getValidPassword()
        );

        loginAssertions.verifySuccessfulLogin();
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}