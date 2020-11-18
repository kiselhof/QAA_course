package pages;

import framework.UserTestingChallenges10;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Challenge10LogIn extends BasePage{

    private UserTestingChallenges10 USER;

    //locators to input for login
    @FindBy(xpath="//input[@name='username']")
    private WebElement actual_username;
    @FindBy(xpath="//input[@type='password']")
    private WebElement actual_password;


    //button to login
    @FindBy(xpath="//button[@type='submit']")
    private WebElement loginButton;

    //locator to verify log in
    @FindBy(tagName = "h1")
    private WebElement header1;

    public Challenge10LogIn openPageInputDataAndLogIn(){
        actual_username.sendKeys(USER.getUSERNAME());
        actual_password.sendKeys(USER.getPASSWORD());
        loginButton.click();
        return this;
    }

    public Challenge10LogIn verifyLogIn(){
        Assert.assertNotNull(header1);
        return this;
    }

}
