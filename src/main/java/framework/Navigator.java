package framework;

import org.openqa.selenium.support.PageFactory;

import pages.Challenge1Page;
import pages.Challenge4Page;
import pages.Challenge8Page;
import pages.Challenge10LogIn;
import pages.Challenge10Page;

import static framework.BrowserManager.getDriver;

public class Navigator {
    private static final String CHALLENGE1_URL = "http://testingchallenges.thetestingmap.org/index.php";
    private static final String CHALLENGE4_URL = "http://testingchallenges.thetestingmap.org/challenge4.php";
    private static final String CHALLENGE8_URL = "http://testingchallenges.thetestingmap.org/challenge8.php";
    private static final String CHALLENGE10_URL = "http://testingchallenges.thetestingmap.org/challenge10.php";
    private static final String CHALLENGE10_URL_LOGIN = "http://testingchallenges.thetestingmap.org/login/login.php";


    public static Challenge1Page openTestingChallenge1(){
        getDriver().navigate().to(CHALLENGE1_URL);
        return PageFactory.initElements(getDriver(),Challenge1Page.class);
    }
    public static Challenge10Page openTestingChallenge10(){
        getDriver().navigate().to(CHALLENGE10_URL);
        return PageFactory.initElements(getDriver(), Challenge10Page.class);
    }
    public static Challenge10LogIn openTestingChallenge10Login(){
        getDriver().navigate().to(CHALLENGE10_URL_LOGIN);
        return PageFactory.initElements(getDriver(), Challenge10LogIn.class);
    }
    public static Challenge8Page openTestingChallenge8(){
        getDriver().navigate().to(CHALLENGE8_URL);
        return PageFactory.initElements(getDriver(), Challenge8Page.class);
    }
    public static Challenge4Page openTestingChallenge4(){
        getDriver().navigate().to(CHALLENGE4_URL);
        return PageFactory.initElements(getDriver(), Challenge4Page.class);
    }

}
