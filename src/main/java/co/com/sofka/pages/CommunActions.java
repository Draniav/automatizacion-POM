package co.com.sofka.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CommunActions {

    private static final Logger LOGGER = Logger.getLogger(CommunActions.class);
    private static final String WEBDRIVER_NULL_MESSAGE = "\nWARNING!\n\rThe Webdriver is null, please check it.\n";

    protected WebDriver webDriver;



    public CommunActions(WebDriver webDriver, int seconds) {
        try {
            if (webDriver == null)
                LOGGER.warn(WEBDRIVER_NULL_MESSAGE);
            this.webDriver = webDriver;
            webDriverImplicitWait(webDriver, seconds);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
        }
    }

    public WebElement waiElement(By locator){
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    private void webDriverImplicitWait(WebDriver driver, int seconds) {
        try {
            driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
        }
    }

    public void clickOnElement(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
        }
    }


    public void fillField(WebElement element, String value){
        try {
            element.clear();
            element.sendKeys(value);
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }
    }

    public void clearField(WebElement element){
        try {
            element.clear();
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }
    }


    protected void scrollOn(WebElement element) {
        try {
            ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
        }
    }



    protected String getTextFromElement(WebElement element) {
        try {
            return element.getText();
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
            return "";
        }
    }

}



