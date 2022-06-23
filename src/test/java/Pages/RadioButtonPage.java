package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public WebElement yesRadioButton;
    public WebElement textSuccessYes;
    public WebElement impressiveButton;
    public WebElement noButton;

    public RadioButtonPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getYesRadioButton() {
        return driver.findElement(By.id("yesRadio"));


    }

    public WebElement getTextSuccessYes() {
        return driver.findElement(By.className("text-success"));
    }

    public WebElement getImpressiveButton() {
        return driver.findElement(By.id("impressiveRadio"));
    }

    public WebElement getNoButton() {
        return driver.findElement(By.id("noRadio"));
    }
    //---------------------------------public void clickOnYesRadioButton(){this.getYesRadioButton().click();
    // public void clickYesRadioButtonJS(WebElement yesRadioButton){
    // ((JavascriptExecutor)driver.)executeScript("arguments[0].click", yesRadioButton);


    public void clickYesRadioButtonJS(WebElement yesRadioButton) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", yesRadioButton);
    }

    public void clickImpressiveButtonJS(WebElement impressiveButton) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", impressiveButton);

    }

    public void clickNoButtonJS(WebElement noButton) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", noButton);

    }
}

