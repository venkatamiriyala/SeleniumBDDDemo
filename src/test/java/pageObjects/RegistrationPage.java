package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.WaitHelper;

public class RegistrationPage {

    public WebDriver ldriver;
    public WaitHelper waitHelper;

    //Constructor
    public RegistrationPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        waitHelper=new WaitHelper(ldriver);   // WAIT from Utils
    }

    String CMAIL;
    //Landing Modulea
    @FindBy(xpath = "//a[@class='login']")
    @CacheLookup
    WebElement linkSignin;

    By headerAuth= By.xpath(("//*[@id=\"center_column\"]/h1"));

    // Authentication Modules
    @FindBy(xpath = "//input[@id='email_create']")
    @CacheLookup
    WebElement txtEmail;
    By headerCust = By.xpath("//*[@id=\"noSlide\"]/h1");

    //By txtInvalid = By.xpath("//li[contains(text(),'Invalid email address.')]");
    By txtInvalid = By.xpath("//*[@id='create_account_error']/ol/li");

    By txtDuplicate = By.xpath("//li[contains(text(),'An account using this email address has already')]");

    //Personal Information Module
    By txtCFName = By.xpath("//input[@id='customer_firstname']");
    By txtCLName = By.xpath("//input[@id='customer_lastname']");
    By txtCEmail = By.xpath("//input[@id='email']");
    By txtPwd = By.xpath("//input[@id='passwd']");

    //Your Address Module
    By txtAdrFName = By.xpath("//input[@id='firstname']");
    By txtAdrLName = By.xpath("//input[@id='lastname']");
    By txtAdrL1 = By.xpath("//input[@id='address1']");
    By txtAdrCity = By.xpath("//input[@id='city']");
    By selState = By.xpath("//select[@id='id_state']");
    By selCntry = By.xpath("//select[@id='id_country']");
    By txtPhone = By.xpath("//input[@id='phone_mobile']");
    By txtAdrAls = By.xpath("//input[@id='alias']");
    By btnReg = By.xpath("//span[contains(text(),'Register')]");
    By txtPost = By.xpath("//input[@id='postcode']");
    By myAccountHeader = By.xpath("//*[@id='center_column']/h1");


    // Action Methods
    public void clickSignin() {
        linkSignin.click();
    }

    public void verifyAuthPageHeader() throws InterruptedException {

      verifyPageContent("AUTHENTICATION", headerAuth);
    }

     public void setEmail(String email) throws InterruptedException {
        CMAIL=email;
        txtEmail.click();
        txtEmail.sendKeys(email);
        ldriver.findElement(By.cssSelector("#SubmitCreate > span")).click();
     }


    public void verifyCutomerPageHeader() throws InterruptedException {
      verifyPageContent("CREATE AN ACCOUNT", headerCust);

    }

    public void submitUserDetail() throws InterruptedException {
        Thread.sleep(3000);
        ldriver.findElement(txtCFName).sendKeys("AutoFname");
        ldriver.findElement(txtCLName).sendKeys("AutoLname");
        // ldriver.findElement(txtCEmail).sendKeys(CMAIL);
        ldriver.findElement(txtPwd).sendKeys("Pass1234");
        ldriver.findElement(txtAdrFName).sendKeys("AutoFname");
        ldriver.findElement(txtAdrLName).sendKeys("AutoLname");
        ldriver.findElement(txtAdrL1).sendKeys("1 Address");
        Select cCountry = new Select(ldriver.findElement(selCntry));
        cCountry.selectByIndex(1);
        Thread.sleep(3000);
        Select cState = new Select(ldriver.findElement(selState));
        cState.selectByIndex(1);
        ldriver.findElement(txtAdrCity).sendKeys("New York");
        Thread.sleep(3000);
        ldriver.findElement(txtPost).sendKeys("20000");
        ldriver.findElement(txtPhone).sendKeys("0434567890");
        ldriver.findElement(txtAdrAls).sendKeys("123 Address Alias");
        ldriver.findElement(btnReg).click();
    }

     public void regSuccess () throws InterruptedException {
      Thread.sleep(3000);
       verifyPageContent("MY ACCOUNT", myAccountHeader);
       ldriver.close();
            }


    public void invalidEmail () throws InterruptedException {
       verifyPageContent("Invalid email address.", txtInvalid);
       ldriver.close();
    }


    public void verifyPageContent(String header, By element) throws InterruptedException {
        Thread.sleep(5000);
        if (ldriver.findElement(element).isDisplayed())
            if (ldriver.findElement(element).getText().equalsIgnoreCase(header))
                Assert.assertTrue(true);
            else
                Assert.assertTrue(false);
        else
            Assert.assertTrue(false);

    }
}