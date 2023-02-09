package co.com.sofka.pages.login;


import co.com.sofka.model.LogInModel;
import co.com.sofka.pages.CommunActions;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Collection;
import java.util.Collections;


public class LoginPage extends CommunActions {
    private LogInModel persona;
    private By msgError = By.xpath("//*[@id=\"email-error\"]");
    private By email = By.id("email");
    private By password = By.id("pass");
    private By btnSignIn = By.xpath("//*[@id=\"send2\"]/span");
    private By sessionName = By.xpath("//span[contains(text(), 'Welcome')]");

    public LoginPage(WebDriver driver, Integer waitingTime) {
        super(driver, waitingTime);
    }


    public String getError() {

        return getTextFromElement(webDriver.findElement(msgError));
    }


    public void clicSignInBtn() {

        scrollOn(webDriver.findElement(btnSignIn));
        clickOnElement(webDriver.findElement(btnSignIn));
    }
    public void signIn(String emailUser, String passwordUser) {

        typeOnTextField(webDriver.findElement(email), emailUser);
        typeOnTextField(webDriver.findElement(password), passwordUser);
        clicSignInBtn();

    }

    private void generarPersona() {
        Faker faker = new Faker();
        persona = new LogInModel();

        String password = faker.code().imei();
        persona.setEmail(faker.animal().name() + "@" + faker.internet().domainName());
        persona.setPassword(password);


    }


    public Collection<Object> getUser() {
        WebElement element = waitElement(sessionName);
        return Collections.singleton(getTextFromElement(element));
    }
}
