package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTablesPage {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public WebElement addRegistrationButton;
    public WebElement firstnameTextbox;
    public WebElement lastNameTextbox;
    public WebElement emailTextbox;
    public WebElement ageTextbox;
    public WebElement salaryTextbox;


    public WebTablesPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getAddRegistrationButton() {
        return driver.findElement(By.id("addNewRecordButton"));
    }

    public WebElement getFirstnameTextbox() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastNameTextbox() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getEmailTextbox() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getAgeTextbox() {
        return driver.findElement(By.id("age"));
    }

    public WebElement getSalaryTextbox() {
        return driver.findElement(By.id("salary"));
    }
    //--------------------------------------

    public void clickOnAddRegistrationButton() {
        this.getAddRegistrationButton().click();
    }

    public void enterFirstName(String firstName) {
        this.getFirstnameTextbox().clear();
        this.getFirstnameTextbox().sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        this.getLastNameTextbox().clear();
        this.getLastNameTextbox().sendKeys(lastName);
    }

    public void enterEmailTextbox(String email) {
        this.getEmailTextbox().clear();
        this.getEmailTextbox().sendKeys(email);
    }

    public void enterAge(String godine) {
        this.getAgeTextbox().clear();
        this.getAgeTextbox().sendKeys(String.valueOf(godine));

    }

    public void enterSalary(String plata) {
        this.getSalaryTextbox().clear();
        this.getSalaryTextbox().sendKeys(String.valueOf(plata));
    }



}


