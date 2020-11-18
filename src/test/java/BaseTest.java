import framework.BrowserManager;
import framework.Listener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static framework.BrowserManager.getDriver;


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
