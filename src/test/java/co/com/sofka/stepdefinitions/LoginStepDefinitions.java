package co.com.sofka.stepdefinitions;

import co.com.sofka.model.LogInModel;
import co.com.sofka.pages.homepage.HomePage;
import co.com.sofka.pages.login.LoginPage;
import co.com.sofka.pages.news.NewsPage;
import co.com.sofka.setup.WebUI;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

public class LoginStepDefinitions extends WebUI {


    private static HomePage homePage;
    private static LoginPage loginPage;


    @Dado("que el cliente entre a la pagina")
    public void queElClienteEntreALaPagina() {
        try {
            generalSetup();
            setUpLog4j2();
            homePage = new HomePage(driver, 10);

        } catch (Exception exception) {
            errorManagement(exception);
        }
    }

    @Cuando("navegue hacia el  formulario de sign in")
    public void navegueHaciaElFormularioDeSignIn() {
        try {

            loginPage = homePage.openSignInForm();

        } catch (Exception exception) {
            errorManagement(exception);
        }


    }

    @Y("envie el formulario vacio")
    public void envieElFormularioVacio() {

        try {

            loginPage.clicSignInBtn();


        } catch (Exception exception) {
            errorManagement(exception);
        }
    }


    @Entonces("vera un  mensaje de error")
    public void veraUnMensajeDeError() {

        try {

            Assertions.assertEquals("This is a required field.", loginPage.getError());

            quiteDriver();

        } catch (Exception exception) {
            errorManagement(exception);
        }


    }


    @Y("envie el formulario :  {string} y la contraseña: {string}")
    public void envieElFormularioYLaContraseña(String email, String password) {
        try {
            loginPage = homePage.openSignInForm();
            loginPage.signIn(email, password);
        } catch (Exception exception) {
            errorManagement(exception);
        }
    }

    @Entonces("vera un  mensaje de: {string}")
    public void veraUnMensajeDe(String message) {
        try {
            System.out.println(loginPage.getUser());
            Assertions.assertTrue(loginPage.getUser().contains(message));
            quiteDriver();
        } catch (Exception exception) {
            errorManagement(exception);
        }
    }
}
