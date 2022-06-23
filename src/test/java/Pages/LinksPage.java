package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public WebElement homeLink;
    public WebElement dynamicHomeLink;
    public WebElement createdLink;
    public WebElement linkResponse;

    public LinksPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getHomeLink() {
        return driver.findElement(By.id("simpleLink"));
    }

    public WebElement getDynamicHomeLink() {
        return driver.findElement(By.id("dynamicLink"));
    }

    public WebElement getCreatedLink() {
        return driver.findElement(By.id("created"));
    }

    public WebElement getLinkResponse() {
        return driver.findElement(By.id("linkResponse"));
    }
    //---------------------------

    public void clickOnHomeLink(){
        this.getHomeLink().click();
    }
    public void clickOnDynamicLink(){
        this.getDynamicHomeLink().click();
    }
    public void clickOnCreatedLink(){
        this.getCreatedLink().click();
    }
}
