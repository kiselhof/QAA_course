package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static framework.BrowserManager.getDriver;

public class BasePage {


    public LeftNavigationMenu onLeftSideMenu(){
        return PageFactory.initElements(getDriver(), LeftNavigationMenu.class);
    }



    public BasePage waitForElement(String xpath){

     /*   try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/
            new WebDriverWait(getDriver(), 2)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));

        return PageFactory.initElements(getDriver(), Challenge1Page.class);
    }

}
