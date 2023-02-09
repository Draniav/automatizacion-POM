package co.com.sofka.pages.cart;


import co.com.sofka.pages.CommunActions;
import co.com.sofka.pages.login.LoginPage;
import co.com.sofka.pages.news.NewsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartPage extends CommunActions {


    private By remove = By.xpath("//*[@id=\"mini-cart\"]/li/div/div/div[2]/div[2]/a");

    private By message = By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/strong");



      public CartPage(WebDriver driver, Integer waitingTime) {
        super(driver, waitingTime);
    }




    public void clicRemoveBtn() {

        scrollOn(webDriver.findElement(remove));
        clickOnElement(webDriver.findElement(remove));
    }

    public String getMessage() {

        return getTextFromElement(webDriver.findElement(message));
    }

}
