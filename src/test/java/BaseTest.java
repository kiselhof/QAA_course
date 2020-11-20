import framework.BrowserManager;
//import framework.Listener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//@Listeners(Listener.class)
public class BaseTest {

    @BeforeMethod
    public void openBrowser(){
        BrowserManager.openBrowser();
    }
    public void BaseTestTest(){

    }
    @AfterMethod
    public void closeBrowser(){
        BrowserManager.closeBrowser();
    }
}
