package Test;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeTest extends BaseTest {

    public String fullName = "AnaGrce";
    public String email = "grce@gmail.com";
    public String currentAddress="Adresa10";
    public String permanent="Adresa20";
    public String godine= String.valueOf(18);
    public int plata=40000;
    public String firstName="Ana";
    public String lastName="Grce";


    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }
    @Test(priority = 10)
    public void successfulLSubmit(){
        scrollIntoView(homepagePage.getElementsCard());
        homepagePage.clickOnElementCard();
        sidebarPage.clickOnTextBoxButton();
        textBoxPage.inputFullName(fullName);
        textBoxPage.inputEmail(email);
        textBoxPage.inputCurrentAddress(currentAddress);
        textBoxPage.inputPermanentAddress(permanent);
        scrollIntoView(textBoxPage.getSubmitButton());
        textBoxPage.clickOnSubmitButton();

        Assert.assertTrue(textBoxPage.getNameAfterSubmit().isDisplayed());
        Assert.assertTrue(textBoxPage.getEmailAfterSubmit().isDisplayed());
    }

    @Test(priority = 20)
    public void successfulHomeBoxChecking(){
        scrollIntoView(homepagePage.getElementsCard());
        homepagePage.clickOnElementCard();
        sidebarPage.clickOnCheckBoxButton();
        clickabilityWait(checkBoxPage.getHomeBox());
        checkBoxPage.clickOnHomeButton();

      //  Assert.assertTrue(checkBoxPage.gcetResultText().isDisplayed());
        //Assert.assertTrue(checkBoxPage.getHomeButtonIsChecked().isDisplayed());

    }
   /* @Test(priority = 30)
    public void unsuccessfulBoxChecking(){

        scrollIntoView(homepagePage.getElementsCard());
        homepagePage.clickOnElementCard();
        sidebarPage.clickOnCheckBoxButton();
Assert.assertEquals(excelReader.getStringData("DataFinalProject", 1,0));
driver.getCurrentUrl()


    }*/

    @Test
    public void successfulAddNewRegistrationForm() throws InterruptedException {

        scrollIntoView(homepagePage.getElementsCard());
        homepagePage.clickOnElementCard();
        sidebarPage.clickOnWebTablesButton();
        Thread.sleep(2000);
        // clickabilityWait(webTablesPage.getAddRegistrationButton());
        webTablesPage.clickOnAddRegistrationButton();
        webTablesPage.enterFirstName(firstName);
        webTablesPage.enterLastName(lastName);
        webTablesPage.enterEmailTextbox(email);
        webTablesPage.getAgeTextbox();


    }
    @Test
    public void clickOnYesRadioButton(){
        scrollIntoView(homepagePage.getElementsCard());
        homepagePage.clickOnElementCard();
        sidebarPage.clickOnRadioButton();
        radioButtonPage.clickYesRadioButtonJS(radioButtonPage.getYesRadioButton());
        visabilityWait(radioButtonPage.getTextSuccessYes());

        Assert.assertTrue(radioButtonPage.getTextSuccessYes().isDisplayed());
        Assert.assertEquals(radioButtonPage.getTextSuccessYes().getText(), "Yes");

    }
    @Test
    public void successfulClickOnImpressiveButton(){
        scrollIntoView(homepagePage.getElementsCard());
        homepagePage.clickOnElementCard();
        sidebarPage.clickOnRadioButton();
        radioButtonPage.clickImpressiveButtonJS(radioButtonPage.getImpressiveButton());
        visabilityWait(radioButtonPage.getTextSuccessYes());

        Assert.assertEquals(radioButtonPage.getTextSuccessYes().getText(), "Impressive");
        Assert.assertTrue(radioButtonPage.getTextSuccessYes().isDisplayed());


    }
    @Test
    public void unsuccessfulClickOnNoButton(){
        scrollIntoView(homepagePage.getElementsCard());
        homepagePage.clickOnElementCard();
        sidebarPage.clickOnRadioButton();
        radioButtonPage.clickNoButtonJS(radioButtonPage.getNoButton());

        boolean check=false;
        try{
            check=radioButtonPage.getTextSuccessYes().isDisplayed();

        }catch (Exception e){

        }
        Assert.assertFalse(check);


    }
    @Test
    public void successfulClickOnHomePage(){
        scrollIntoView(homepagePage.getElementsCard());
        homepagePage.clickOnElementCard();
        scrollIntoView(sidebarPage.getLinksButton());
        sidebarPage.clickOnLinksButton();
        linksPage.clickOnHomeLink();

       // Assert.assertEquals(linksPage.getHomeLink(), "Home");

        Assert.assertEquals(linksPage.getHomeLink().getAttribute("href"), "https://demoqa.com/");

    }
    @Test
    public void successfulClickOnDynamicLink(){
        scrollIntoView(homepagePage.getElementsCard());
        homepagePage.clickOnElementCard();
        scrollIntoView(sidebarPage.getLinksButton());
        sidebarPage.clickOnLinksButton();
        linksPage.clickOnDynamicLink();

        Assert.assertEquals(linksPage.getDynamicHomeLink().getAttribute("href"), "https://demoqa.com/");

    }
    @Test
    public void successfulClickOnCreatedLink() throws InterruptedException {

        scrollIntoView(homepagePage.getElementsCard());
        homepagePage.clickOnElementCard();
        scrollIntoView(sidebarPage.getLinksButton());
        sidebarPage.clickOnLinksButton();
        scrollIntoView(linksPage.getCreatedLink());
        linksPage.clickOnCreatedLink();

       visabilityWait(linksPage.getLinkResponse());

        Assert.assertTrue(linksPage.getLinkResponse().isDisplayed());
        //Assert.assertEquals(linksPage.getLinkResponse().getAttribute(String.valueOf(201)), "201");


    }


}
