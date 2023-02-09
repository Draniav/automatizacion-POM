package co.com.sofka.pages.register;

import co.com.sofka.model.RegisterModel;
import co.com.sofka.pages.CommunActions;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Collection;
import java.util.Collections;

public class RegisterPage extends CommunActions {

    private RegisterModel persona;

    public RegisterPage(WebDriver webDriver, int seconds) {
        super(webDriver, seconds);
    }


    private By name = By.id("firstname");
    private By lastName = By.id("lastname");
    private By email = By.id("email_address");
    private By password = By.id("password");
    private By confirmPassword = By.id("password-confirmation");
    private By createAccountBtn = By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button");
    private By messageMissingEmail = By.xpath(" //*[@id=\"firstname-error\"]");



    private void generarPersona() {
        Faker faker = new Faker();
        persona = new RegisterModel();

        String name = faker.name().name();
        String lastName = faker.name().lastName();
        String password = faker.code().imei();

        persona.setEmail(faker.animal().name() + "@" + faker.internet().domainName());
        persona.setPassword(password);
        persona.setName(name);
        persona.setLastName(lastName);
        persona.setPasswordConfirmation(password);


    }



    public void fillForm(String nameRandom, String emailRandom, String lastNameRandom, String passwordRandom) {

        Faker faker = new Faker();
        String passwordFaker = faker.code().imei()+"!3A";

        scrollOn(webDriver.findElement(name));
        typeOnTextField(webDriver.findElement(name),faker.name().name());

        scrollOn(webDriver.findElement(lastName));
        typeOnTextField(webDriver.findElement(lastName),faker.name().lastName());

        scrollOn(webDriver.findElement(email));
        typeOnTextField(webDriver.findElement(email),faker.color().name() + "@" + faker.internet().domainName() );

        scrollOn(webDriver.findElement(password));
        typeOnTextField(webDriver.findElement(password),passwordFaker);

        scrollOn(webDriver.findElement(confirmPassword));
        typeOnTextField(webDriver.findElement(confirmPassword),passwordFaker);



    }

    public void clicCreateAccountBtn() {

        scrollOn(webDriver.findElement(createAccountBtn));
        clickOnElement(webDriver.findElement(createAccountBtn));
    }

    public String getMessageMissingEmail() {

        return getTextFromElement(webDriver.findElement(messageMissingEmail));
    }



}
