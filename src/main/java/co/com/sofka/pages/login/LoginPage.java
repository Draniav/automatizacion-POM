package co.com.sofka.pages.login;



import co.com.sofka.pages.CommunActions;
import co.com.sofka.pages.news.NewsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends CommunActions {


private By email =  By.id("email");




    public LoginPage(WebDriver driver, Integer waitingTime) {
        super(driver, waitingTime);
        initElement(driver, this);
    }


    protected void initElement(WebDriver driver, Object page) {
        PageFactory.initElements(driver, page);
    }



}
