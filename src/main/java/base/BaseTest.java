package base;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class BaseTest{
 protected WebDriver driver;
 @BeforeMethod public void setup(){driver=new ChromeDriver();driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));}
 @AfterMethod public void tearDown(){driver.quit();}
}
