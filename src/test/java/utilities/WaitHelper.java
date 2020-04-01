package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

    public WebDriver driver;

    // Global Wait variables
    public long minWait=30;
    public long maxWait=45;

    //constructor
    public WaitHelper(WebDriver driver) {
        this.driver = driver;
    }

    //Wait for Element Util
    public void WaitForElement(WebElement element, long timeOutInSeconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }



}