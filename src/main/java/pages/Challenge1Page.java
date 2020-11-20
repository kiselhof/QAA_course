package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Challenge1Page extends BasePage {

    @FindBy(id="firstname")
    private WebElement firstNameField;
    @FindBy(name="formSubmit")      ////input[@name='formSubmit']
    private WebElement submitButton;
    @FindBy(xpath="//p[contains(., 'Your username')]//strong[1]")
    private WebElement userNameFromConfirmation;
    @FindBy(xpath="//div[contains(@class, 'confirm')]//strong[2]")
    private WebElement nameFromConfirmation;
    @FindBy(className="values-tested")
    private WebElement valuesTested;
    private static final String submitButtonxpath = "//input[@name='formSubmit']";



    public Challenge1Page enterNameAndSubmit(String name){
        firstNameField.click();
           firstNameField.sendKeys(name);
           waitForElement(submitButtonxpath);
           submitButton.click();
           return this;
       }


    public Challenge1Page verifyNameInConfirmationWindow(String name){
        assertEquals(nameFromConfirmation.getText(), name, "Wrong name in confirmation");
        return this;
    }


    public Challenge1Page verifyUsernameInConfirmationWindow(String name){
        String userName = userNameFromConfirmation.getText();
        assertTrue(userName.contains(name), "Username doesn't contain expected name. Actual: " + userName + " found: "+ name);
        return this;
    }


    public Challenge1Page verifyChecksFound(int expectedValue){
        int testedValue = Integer.parseInt(valuesTested.getText());
        assertEquals(testedValue, expectedValue, "Wrong tested value. expected: " + expectedValue + " found: "+ testedValue);
        return this;
    }



}
