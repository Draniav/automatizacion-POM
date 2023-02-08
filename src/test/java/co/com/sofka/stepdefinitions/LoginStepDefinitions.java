package co.com.sofka.stepdefinitions;

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
    private static NewsPage newsPage;

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

    @Y("diligencie el formulario con  los datos correctos")
    public void diligencieElFormularioConLosDatosCorrectos() {


    }


    @Entonces("vera un  mensaje de error por inactivadad en la cuenta")
    public void veraUnMensajeDeErrorPorInactivadadEnLaCuenta() {

        try {

           // Assertions.assertEquals("What's New",newsPage.getTitle());

            quiteDriver();

        } catch (Exception exception) {
            errorManagement(exception);
        }


    }



}
