package co.com.sofka.pages.homepage;


import co.com.sofka.pages.CommunActions;
import co.com.sofka.pages.login.LoginPage;
import co.com.sofka.pages.news.NewsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends CommunActions {


    private By news = By.xpath("//*[@id=\"ui-id-3\"]/span");

    private By signIn = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");




    protected void initElement(WebDriver driver, Object page) {
        PageFactory.initElements(driver, page);
    }


    public HomePage(WebDriver driver, Integer waitingTime) {
        super(driver, waitingTime);
        initElement(driver, this);
    }


    public NewsPage openNewsPage() {
        clickOnElement(webDriver.findElement(news));
        return new NewsPage(webDriver, 10);
    }

    public LoginPage openSignInForm() {
        clickOnElement(webDriver.findElement(signIn));
        return new LoginPage(webDriver, 10);
    }


}
