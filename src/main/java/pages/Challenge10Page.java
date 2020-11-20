package pages;

import framework.UserTestingChallenges10;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static framework.BrowserManager.getDriver;


public class Challenge10Page extends BasePage {

    private UserTestingChallenges10 USER;

    //locators to input for registration
    @FindBy(xpath = "//input[@name='username']")
    private WebElement actual_username;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement actual_password;
    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement actual_firstname;
    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement actual_lastname;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;


    //locators to check if user registered
    @FindBy(xpath = "//tr[2]//th[2]")
    private WebElement username_check;
    @FindBy(xpath = "//tr[2]//th[3]")
    private WebElement password_check;
    @FindBy(xpath = "//tr[2]//th[4]")
    private WebElement firstname_check;
    @FindBy(xpath = "//tr[2]//th[5]")
    private WebElement lastname_check;


    @FindBy(xpath = "//a[contains(@href, 'login')]")
    private WebElement loginLink;


    public Challenge10Page inputDataAndRegisterUser() {
        actual_username.sendKeys(USER.getUSERNAME());
        actual_password.sendKeys(USER.getPASSWORD());
        actual_firstname.sendKeys(USER.getFIRSTNAME());
        actual_lastname.sendKeys(USER.getLASTNAME());
        submitButton.click();
        return this;
    }

    public Challenge10Page CreateUser(String username, String password, String firstname, String lastname) {
        USER.setUSERNAME(username);
        USER.setPASSWORD(password);
        USER.setFIRSTNAME(firstname);
        USER.setLASTNAME(lastname);
        return PageFactory.initElements(getDriver(), Challenge10Page.class);
    }

    public Challenge10LogIn clickOnLinkToLogin() {
        loginLink.click();
        return PageFactory.initElements(getDriver(), Challenge10LogIn.class);
    }


    public Challenge10Page verifyUsername(String username) {
        Assert.assertEquals(username_check.getText(), username, "Incorrect username. Actual: " + username_check.getText());
        return this;
    }

    public Challenge10Page verifypassword(String password) {
        Assert.assertEquals(password_check.getText(), password, "Incorrect password. Actual: " + password_check.getText());
        return this;
    }

    public Challenge10Page verifyfirstname(String firstname) {
        Assert.assertEquals(firstname_check.getText(), firstname, "Incorrect firstname. Actual: " + firstname_check.getText());
        return this;
    }

    public Challenge10Page verifylastname(String lastname) {
        Assert.assertEquals(lastname_check.getText(), lastname, "Incorrect lastname. Actual: " + lastname_check.getText());
        return this;
    }
}
