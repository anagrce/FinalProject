package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {


    //U ovom ispod delu deklarisem driver, webdriverwait ako bude potrebe i sve stranice koje cu da testiram

    public WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public HomepagePage homepagePage;
    public SidebarPage sidebarPage;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public WebTablesPage webTablesPage;
    public RadioButtonPage radioButtonPage;
    public LinksPage linksPage;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        wdwait= new WebDriverWait(driver, Duration.ofSeconds(10));

        excelReader = new ExcelReader("C:\\Users\\TaraG\\Desktop\\Test.xlsx");
        homepagePage= new HomepagePage(driver,wdwait);
        sidebarPage= new SidebarPage(driver,wdwait);
        textBoxPage= new TextBoxPage(driver,wdwait);
        checkBoxPage= new CheckBoxPage(driver,wdwait);
        webTablesPage= new WebTablesPage(driver,wdwait);
        radioButtonPage= new RadioButtonPage(driver,wdwait);
        linksPage= new LinksPage(driver,wdwait);


    }

    //metoda za cekanje vidljivosti WebElementa
    public void visabilityWait(WebElement element){

        wdwait.until(ExpectedConditions.visibilityOf(element));
    }
    //metoda za cekanje da Web Elemnt moze da se klikne
    public void clickabilityWait(WebElement element){

        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }
    //metoda za skrolovanje
    public void scrollIntoView(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true) ;",element );

    }

    @AfterClass
    public void tearDown(){
        //driver.close();
        // driver.quit();
    }

}