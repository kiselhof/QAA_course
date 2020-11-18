package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static framework.BrowserManager.getDriver;

public class LeftNavigationMenu {


    @FindBy(xpath = "//a[@href='index.php']")
    private WebElement challenge1Link;
    @FindBy(xpath = "//a[@href='challenge2.php']")
    private WebElement challenge2Link;
    @FindBy(xpath = "//a[@href='challenge10.php']")
    private WebElement challenge10Link;

    public Challenge1Page clickChallenge1Link() {
        challenge1Link.click();
        return PageFactory.initElements(getDriver(), Challenge1Page.class);
    }

    public Challenge10Page clickChallenge10Link() {
        challenge10Link.click();
        return PageFactory.initElements(getDriver(), Challenge10Page.class);
    }

}