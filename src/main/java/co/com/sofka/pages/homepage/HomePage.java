package co.com.sofka.pages.homepage;


import co.com.sofka.pages.CommunActions;
import co.com.sofka.pages.login.LoginPage;
import co.com.sofka.pages.news.NewsPage;
import co.com.sofka.pages.register.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Collection;
import java.util.Collections;


public class HomePage extends CommunActions {


    private By news = By.xpath("//*[@id=\"ui-id-3\"]/span");

    private By signIn = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");

    private By register = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a");


    private By messageWelcome = By.xpath(" /html/body");

      public HomePage(WebDriver driver, Integer waitingTime) {
        super(driver, waitingTime);
    }


    public NewsPage openNewsPage() {
        clickOnElement(webDriver.findElement(news));
        return new NewsPage(webDriver, 10);
    }

    public LoginPage openSignInForm() {
        clickOnElement(webDriver.findElement(signIn));
        return new LoginPage(webDriver, 10);
    }
    public RegisterPage openRegisterForm() {
        clickOnElement(webDriver.findElement(register));
        return new RegisterPage(webDriver, 10);
    }

    public Collection<Object> getMessageWelcome() {
        WebElement element = waitElement(messageWelcome);
        return Collections.singleton(getTextFromElement(element));
    }
    public String getMessages() {

        return getTextFromElement(webDriver.findElement(messageWelcome));
    }
}
