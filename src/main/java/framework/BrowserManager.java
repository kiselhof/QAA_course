package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.io.File;


public class BrowserManager {
    private static WebDriver _browser;
    private static final String MAIN_URL = "http://testingchallenges.thetestingmap.org/index.php";
    //private static final String _chromebrowser =;
   // private static final String _firefoxbrowser =;

    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "src/test/BrowserDrivers/chromedriver.exe");

        _browser = new ChromeDriver();
        _browser.navigate().to(MAIN_URL);
    }


    public static void closeBrowser(){
        _browser.quit();
    }

    public static WebDriver getDriver(){
        return _browser;
    }

}
