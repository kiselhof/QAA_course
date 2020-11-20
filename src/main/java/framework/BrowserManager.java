package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserManager {

    private static WebDriver _browser;

    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/BrowserDrivers/chromedriver.exe");

        _browser = new ChromeDriver();

    }


    public static void closeBrowser() {
        _browser.quit();
    }

    public static WebDriver getDriver() {
        return _browser;
    }

}
