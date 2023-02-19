package co.com.sofka.pages.fitness;


import co.com.sofka.pages.CommunActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FitnessPage extends CommunActions {
    By activityLocator = By.xpath("//div[contains(text(), 'Activity')]");
    By gymActivityLocator = By.xpath("//a[contains(text(), 'Gym')]");

    By genderLocator = By.xpath("//div[contains(text(), 'Gender')]");
    By unisexGenderLocator = By.xpath("//a[contains(text(), 'Unisex')]");
    By productsOnPage = By.xpath("//a[contains(@class, 'product-item-link')]");

    By productOne = By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[3]/div/div/div[2]/div/div[1]/form/button/span");
    By productTwo = By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[4]/div/div/div[2]/div/div[1]/form/button/span");
    By productThree= By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[5]/div/div/div[3]/div/div[1]/form/button/span");
    By productFour = By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[5]/div/div/div[3]/div/div[1]/form/button/span");

    public FitnessPage(WebDriver driver, Integer waitingTime) {
        super(driver, waitingTime);
    }


    public void selectActivityGym() {
        scrollOn(webDriver.findElement(activityLocator));
        clickOnElement(webDriver.findElement(activityLocator));
        clickOnElement(webDriver.findElement(gymActivityLocator));
    }

    public void selectGenderUnisex() {
        scrollOn(webDriver.findElement(genderLocator));
        clickOnElement(webDriver.findElement(genderLocator));
        clickOnElement(webDriver.findElement(unisexGenderLocator));
    }

    public Integer getAmountProducts() throws InterruptedException {

        List<WebElement> products = elements(productsOnPage);
        return products.size();
    }

    public Integer getProducts() throws InterruptedException {

        List<WebElement> products = elements(productsOnPage);
        return products.size();
    }


    public void addProducts() {
        scrollOn(webDriver.findElement(productOne));
        clickOnElement(webDriver.findElement(productOne));
        scrollOn(webDriver.findElement(productTwo));
        clickOnElement(webDriver.findElement(productTwo));
        scrollOn(webDriver.findElement(productThree));
        clickOnElement(webDriver.findElement(productThree));
        scrollOn(webDriver.findElement(productFour));
        clickOnElement(webDriver.findElement(productFour));
    }
}
