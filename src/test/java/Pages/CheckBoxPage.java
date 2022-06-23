package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CheckBoxPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public WebElement resultText;

    public WebElement expandIcon;

    public WebElement elements;
    public WebElement homeBox;

    public CheckBoxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }



    public WebElement getResultText() {
        return driver.findElement(By.id("result"));
    }

    public WebElement getHomeBox() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]/svg"));
    }

    public WebElement getExpandIcon() {
        return driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-close"));
    }

    public List<WebElement> getElements() {
        return driver.findElements(By.className("rct-checkbox"));
    }
    // public WebElement getDesktopButtonIsChecked() {
     //   return driver.findElement(By.cssSelector("rct-icon rct-icon-check"));

    public void clickOnHomeButton() {
        for (int i = 0; i < getElements().size(); i++) {
            if (getElements().get(i).getText().equals("Home")) {
                getElements().get(i).click();
            }

                break;
        }

    }
    public void clickOnDesktopButton() {
        for (int i = 0; i < getElements().size(); i++) {
            if (getElements().get(i).getText().equals("Desktop")) {
                getElements().get(i).click();
            }

        }
    }
    public void clickOnDocumentsButton() {
        for (int i = 0; i < getElements().size(); i++) {
            if (getElements().get(i).getText().equals("Documents")) {
                getElements().get(i).click();
            }

        }
    }
    public void clickOnDownloadsButton() {
        for (int i = 0; i < getElements().size(); i++) {
            if (getElements().get(i).getText().equals("Downloads")) {
                getElements().get(i).click();
            }

        }
    }


    public void clickOnExpandIcon(){
        this.getExpandIcon().click();
    }
}
    //..........................................





