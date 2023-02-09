package co.com.sofka.pages.cart;


import co.com.sofka.pages.CommunActions;
import co.com.sofka.pages.login.LoginPage;
import co.com.sofka.pages.news.NewsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartPage extends CommunActions {




    private By removeConfirmationBtn = By.xpath("/html/body/div[4]/aside[2]/div[2]/footer/button[2]");

    private By message = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/p[1]");




      public CartPage(WebDriver driver, Integer waitingTime) {
        super(driver, waitingTime);
    }






    public String getMessage() {

        return getTextFromElement(webDriver.findElement(message));
    }

}
