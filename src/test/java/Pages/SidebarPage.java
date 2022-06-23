package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SidebarPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public List<WebElement> elements;
    public WebElement textBox;
    public WebElement checkBoxButton;
    public WebElement webTablesButton;
    public WebElement radioButton;
    public WebElement linksButton;

    public SidebarPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public List<WebElement> getElements() {
        return elements;
    }

    public WebElement getTextBox() {
        return driver.findElement(By.id("item-0"));
    }

    public WebElement getCheckBoxButton() {
        return driver.findElement(By.id("item-1"));
    }

    public WebElement getWebTablesButton() {
        return driver.findElement(By.id("item-3"));
    }

    public WebElement getRadioButton() {
        return driver.findElement(By.id("item-2"));
    }

    public WebElement getLinksButton() {
        return driver.findElement(By.id("item-5"));
    }
    //------------------------

    public void clickOnTextBoxButton(){
        this.getTextBox().click();
    }
    public void clickOnCheckBoxButton(){
        this.getCheckBoxButton().click();
    }
    public void clickOnWebTablesButton(){
        this.getWebTablesButton().click();
    }
    public void clickOnRadioButton(){
        this.getRadioButton().click();
    }
    public void clickOnLinksButton(){
        this.getLinksButton().click();
    }
}
