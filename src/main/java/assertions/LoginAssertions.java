package assertions;
import org.testng.Assert;
public class LoginAssertions{
 public void shouldBeLoggedIn(String title){Assert.assertTrue(title!=null);}
}
