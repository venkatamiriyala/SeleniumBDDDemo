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


public class DressesPage {
    public WebDriver ldriver;
    RegistrationPage rp;
    WaitHelper waitHelper;


    // Constructer
    public DressesPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        waitHelper=new WaitHelper(ldriver);   // WAIT from Utils
    }


    By menuDress =By.xpath("//*[@id='block_top_menu']/ul/li[2]/a");
    By dressHeader =By.xpath("//*[@id='categories_block_left']/h2");
    By sumDrsSubMenu= By.xpath("//div[@class='block_content']//ul[@class='tree dynamized']//a[contains(text(),'Summer Dresses')]");
    By sumDrsPageHeader = By.xpath("//span[@class='cat-name']");
    By sumDrsBrdCrumb = By.xpath("//div[@class='breadcrumb clearfix']//a[contains(text(),'Dresses')]");

    // Action Methods
    public void clickDress() throws InterruptedException {
        waitHelper.WaitForElement((WebElement) menuDress, waitHelper.minWait);
        ldriver.findElement(menuDress).click();
    }

    public void dressHeader() throws InterruptedException {
        rp.verifyPageContent("DRESSES",dressHeader );
    }

    public void clickSumDress() throws InterruptedException {
        ldriver.findElement(sumDrsSubMenu).click();
     }

    public void verifySumDressHeader() throws InterruptedException {
        rp.verifyPageContent("Summer Dresses", sumDrsPageHeader);
    }

    public void verifyMegaMenu() throws InterruptedException {
        rp.verifyPageContent("Dresses", sumDrsBrdCrumb);
        ldriver.findElement(sumDrsBrdCrumb).click();
        rp.verifyPageContent("Dresses", sumDrsBrdCrumb);
        rp.verifyPageContent("DRESSES",dressHeader );
    }
}