package flows;
import pages.LoginPage;
public class LoginFlow{
 private final LoginPage page;
 public LoginFlow(LoginPage p){page=p;}
 public void login(String e,String p){page.open();page.login(e,p);}
 public void logout(){page.logout();}
}
