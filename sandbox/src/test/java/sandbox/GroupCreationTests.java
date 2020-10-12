//package sandbox;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//public class GroupCreationTests {
//
//    FirefoxDriver wd;
//
//    @BeforeMethod
//    public void setUp() throws  Exception{
//        wd = new FirefoxDriver();
//        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//    }
//
//    @Test
//    public void GroupCreationTest(){
//        wd.get("http://google.com");
//        wd.findElement(By.id("q")).sendKeys("hello");
//    }
//}
