package com.moksh.automation.assertions;

import com.moksh.automation.constants.Messages;
import com.moksh.automation.flows.LoginFlow;
import org.testng.Assert;

public class LoginAssertions {

    private final LoginFlow loginFlow;

    public LoginAssertions() {
        this.loginFlow = new LoginFlow();
    }

    /**
     * Verifies that login was successful.
     */
    public void verifySuccessfulLogin() {

        Assert.assertTrue(
                loginFlow.isLoginSuccessful(),
                "Login was expected to succeed, but it failed."
        );

        Assert.assertEquals(
                loginFlow.getSuccessMessage(),
                Messages.LOGIN_SUCCESS,
                "Success message does not match."
        );
    }

    /**
     * Verifies that login failed.
     */
    public void verifyFailedLogin() {

        Assert.assertTrue(
                loginFlow.isLoginFailed(),
                "Login was expected to fail, but it succeeded."
        );

        Assert.assertEquals(
                loginFlow.getErrorMessage(),
                Messages.LOGIN_FAILED,
                "Error message does not match."
        );
    }
}