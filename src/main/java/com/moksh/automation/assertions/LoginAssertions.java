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
     * Verify successful login.
     */
    public void verifySuccessfulLogin() {

        Assert.assertTrue(
                loginFlow.isLoginSuccessful(),
                "User should be logged in successfully."
        );
    }

    /**
     * Verify failed login.
     */
    public void verifyFailedLogin() {

        Assert.assertTrue(
                loginFlow.isLoginFailed(),
                "Login should fail for invalid credentials."
        );

        Assert.assertEquals(
                loginFlow.getLoginErrorMessage(),
                Messages.LOGIN_FAILED,
                "Incorrect error message displayed."
        );
    }
}