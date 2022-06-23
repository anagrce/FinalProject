package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public WebElement fullNameTextbox;
    public WebElement emailTextbox;
    public WebElement currentAddress;
    public WebElement permanentAddress;
    public WebElement submitButton;
    public WebElement nameAfterSubmit;
    public WebElement emailAfterSubmit;

    public TextBoxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFullNameTextbox() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmailTextbox() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getNameAfterSubmit() {
        return driver.findElement(By.id("name"));
    }

    public WebElement getEmailAfterSubmit() {
        return driver.findElement(By.id("name"));
    }
    //---------------------------

    public void inputFullName(String name){
        this.getFullNameTextbox().clear();
        this.getFullNameTextbox().sendKeys(name);
    }
    public void inputEmail(String email){
        this.getEmailTextbox().clear();
        this.getEmailTextbox().sendKeys(email);
    }
    public void inputCurrentAddress(String address){
        this.getCurrentAddress().clear();
        this.getCurrentAddress().sendKeys(address);
    }
    public void inputPermanentAddress(String permanent){
        this.getPermanentAddress().clear();
        this.getPermanentAddress().sendKeys(permanent);
    }
    public void clickOnSubmitButton(){
        this.getSubmitButton().click();
    }
}
