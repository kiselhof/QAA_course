package pages;

import framework.CNPNumber;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;

public class Challenge4Page extends BasePage{

    @FindBy(xpath = "//input[@type='text']")
    WebElement inputCNPnumber;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement submitButton;
    @FindBy(xpath = "//span[@class='values-tested']")
    WebElement numberTested;

    public Challenge4Page inputNumberAndSubmit(ArrayList<CNPNumber> list, int index){
        inputCNPnumber.sendKeys(list.get(index).getCNP());
        submitButton.click();
        return this;
    }

    public Challenge4Page verifyChecksFound(int expectedValue){
        int testedValue = Integer.parseInt(numberTested.getText());
        assertEquals(testedValue, expectedValue, "Wrong tested value. expected: " + expectedValue + " found: "+ testedValue);
        return this;
    }




}
