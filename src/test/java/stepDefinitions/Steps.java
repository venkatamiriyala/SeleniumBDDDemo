package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.DressesPage;
import pageObjects.RegistrationPage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Steps extends BaseClass {
    //Global wait declaration
    Integer waitTime = 40;
    Integer waitTimeMax = 60;

    @Before
    public void setup() throws IOException
    {
        //Logger Configuration
        logger = Logger.getLogger("SeleniumCucumber"); // Added Logger
        PropertyConfigurator.configure("log4j.properties");

        // Reading Properties from config.properties
        configProp=new Properties();
        FileInputStream configPropfile = new FileInputStream("config.properties");
        configProp.load(configPropfile);

        // Browser Configuration
        String browser=configProp.getProperty("browser");
        logger.info(" ******* Launching Browser***********");

        if(browser.equals("chrome"))
        {
            //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/ChromeDriver.exe");
            System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromepath"));
            driver = new ChromeDriver();   // Local main driver and public for all the methods
        }
        else if(browser.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", configProp.getProperty("firefoxpath"));
            driver = new FirefoxDriver();   // Local main driver and public for all the methods
        }
        else if(browser.equals("ie"))
        {
            System.setProperty("webdriver.ie.driver", configProp.getProperty("iepath"));
            driver = new InternetExplorerDriver();   // Local main driver and public for all the methods
        }
        }


    @Given("User launch a browser")
    public void user_launch_a_browser() {
       driver.manage().window().maximize();
       rp = new RegistrationPage(driver);
    }

    @When("User Opens URL {string}")
    public void user_Opens_URL(String url) throws InterruptedException {

        logger.info("******* Launching URL***********");
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(waitTime, TimeUnit.SECONDS);
    }

    @When("User Click on Sign in link")
    public void user_Click_on_Sign_in_link() throws InterruptedException {
        logger.info("*********** CLiking on URL*****************");
        rp.clickSignin();
    }

    @Then("Page Header should be AUTHENTICATION page")
    public void page_Header_should_be_to_AUTHENTICATION_page() throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(waitTimeMax, TimeUnit.SECONDS);
        rp.verifyAuthPageHeader();

    }

    @When("User Enters Email as {string} and Submits")
    public void user_Enters_Email_as(String email) throws InterruptedException {
        rp.setEmail(email);
    }

    @Then("Create an Account page should displayed")
    public void create_an_Account_page_should_displayed() throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(waitTimeMax, TimeUnit.SECONDS);
        rp.verifyCutomerPageHeader();
    }

    @Given("Enter User Details and Register")
    public void enter_User_Details_and_Address() throws InterruptedException {
        rp.submitUserDetail();
    }

    @Then("User Email Registration must be Successful")
    public void User_Email_Registration_must_be_Successfull() throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(waitTimeMax, TimeUnit.SECONDS);
        rp.regSuccess();
    }


    // Invalid Scenario Specific
    @Then("User should get an Invalid Email ID Error Message")
    public void register_User() throws InterruptedException {
        rp.invalidEmail();
    }

    // Summer Dresses Mega Menu Specific
    @And("User Clicks on Dress Mega Menu")
    public void userClicksOnDressMegaMenu() throws InterruptedException {
        dp = new DressesPage(driver);
        dp.clickDress();
    }

    @Then("Dresses page should load")
    public void dressesPageShouldLoad() throws InterruptedException {
        dp.dressHeader();
    }


    @When("User User Clicks on Summer Dresses Sub Menu")
    public void userUserClicksOnSummerDressesSubMenu() throws InterruptedException {
        dp.clickSumDress();
        dp.verifySumDressHeader();

    }

    @Then("Megamenu should work on Summer DressPage")
    public void summerDressesPageShouldLoadAndMegamenuShouldWork() throws InterruptedException {
        dp.verifyMegaMenu();

    }


}