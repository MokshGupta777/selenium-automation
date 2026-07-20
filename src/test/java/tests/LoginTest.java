package tests;
import base.BaseTest;
import flows.LoginFlow;
import pages.LoginPage;
import assertions.LoginAssertions;
import org.testng.annotations.Test;
public class LoginTest extends BaseTest{
 @Test
 public void login(){
  LoginPage p=new LoginPage(driver);
  new LoginFlow(p).login("test@example.com","password");
  new LoginAssertions().shouldBeLoggedIn(driver.getTitle());
 }
}
