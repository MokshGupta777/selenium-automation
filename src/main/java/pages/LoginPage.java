package pages;
import org.openqa.selenium.*; 
public class LoginPage{
 WebDriver driver;
 By email=By.cssSelector("input[data-qa='login-email']");
 By password=By.cssSelector("input[data-qa='login-password']");
 By login=By.cssSelector("button[data-qa='login-button']");
 By logout=By.cssSelector("a[href='/logout']");
 public LoginPage(WebDriver d){driver=d;}
 public void open(){driver.get("https://automationexercise.com/login");}
 public void login(String e,String p){driver.findElement(email).sendKeys(e);driver.findElement(password).sendKeys(p);driver.findElement(login).click();}
 public void logout(){driver.findElement(logout).click();}
}
