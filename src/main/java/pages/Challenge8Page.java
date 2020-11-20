package pages;

import framework.ItemToSellChallenge8;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static framework.BrowserManager.getDriver;

public class Challenge8Page extends BasePage {

    private ItemToSellChallenge8 _itemToSell;

    //locators to input
    @FindBy(xpath = "//input[@name='selling']")
    private WebElement whatToSellField;
    @FindBy(xpath = "//input[@name='description']")
    private WebElement descriptionField;
    @FindBy(xpath = "//input[@name='start_date']")
    private WebElement startTimeField;
    @FindBy(xpath = "//input[@name='end_date']")
    private WebElement endTimeField;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement sendButton;

    //locator to check just after submitting
    @FindBy(xpath = "//tr[2]/td[1]")
    private WebElement itemNamecheck;

    //locator to delete item
    @FindBy(xpath = "//tr[2]/td[5]/a")
    private WebElement deleteLastItem;
    @FindBy(xpath = "//tr[3]/td[5]/a")
    private WebElement deletePrevLastItem;


    public Challenge8Page createItem(String itemYouSell, String description, String startTime, String endTime) {
        _itemToSell = new ItemToSellChallenge8(itemYouSell, description, startTime, endTime);
        return this;
    }


    public Challenge8Page InputDataAndSend() {
        whatToSellField.sendKeys(_itemToSell.get_whatYouSell());
        descriptionField.sendKeys(_itemToSell.get_description());
        startTimeField.clear();
        startTimeField.sendKeys(_itemToSell.get_startTime());
        endTimeField.clear();
        endTimeField.sendKeys(_itemToSell.get_endTime());
        sendButton.click();
        return this;
    }


    public Challenge8Page verifyItemName() {
        Assert.assertEquals(itemNamecheck.getText(), _itemToSell.get_whatYouSell(),
                "Incorrect item name. Expected: " + _itemToSell.get_whatYouSell()
                        + " ,found: " + itemNamecheck.getText());
        return this;
    }


    public Challenge8Page deleteLastItemFromPage() {
        deleteLastItem.click();
        return this;
    }

    public Challenge8Page verifyItemWasDeleted() {
        Assert.assertNotEquals(_itemToSell.get_whatYouSell(), itemNamecheck.getText(), "Item is still there!");
        return this;
    }


    //will not make an assertion if the dialog present
    public Challenge8Page DialogPresent() {
        Alert alert = getDriver().switchTo().alert();
        Assert.assertNotNull(alert);
        alert.accept();
        return this;
    }


}
