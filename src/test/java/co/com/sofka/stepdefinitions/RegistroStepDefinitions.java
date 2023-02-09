package co.com.sofka.stepdefinitions;

import co.com.sofka.model.RegisterModel;
import co.com.sofka.pages.homepage.HomePage;
import co.com.sofka.pages.login.LoginPage;
import co.com.sofka.pages.news.NewsPage;
import co.com.sofka.pages.register.RegisterPage;
import co.com.sofka.setup.WebUI;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;

public class RegistroStepDefinitions extends WebUI {

    private static HomePage homePage;
    private static RegisterPage registerPage;

    private static RegisterModel persona;

    @Dado("que el usuario navega hacia  Create and Account")
    public void queElUsuarioNavegaHaciaCreateAndAccount() {

        try {
            generalSetup();
            setUpLog4j2();
            homePage = new HomePage(driver, 10);
            registerPage = homePage.openRegisterForm();

        } catch (Exception exception) {
            errorManagement(exception);
        }


    }


    @Cuando("envia el  formulario con los datos correctos")
    public void enviaElFormularioConLosDatosCorrectos() {
        try {

            registerPage.fillForm("","","","");

            registerPage.clicCreateAccountBtn();

        } catch (Exception exception) {
            errorManagement(exception);
        }


    }


    @Entonces("vera el  mensaje de  : {string}.")
    public void veraElMensajeDe(String message) {

        try {
            System.out.println(homePage.getMessages());


            Assertions.assertFalse(homePage.getMessages().contains(message));
            quiteDriver();
        } catch (Exception exception) {
            errorManagement(exception);
        }
    }


    @Cuando("envie el  formulario  vacio")
    public void envieElFormularioVacio() {

        try {
            registerPage.clicCreateAccountBtn();

        } catch (Exception exception) {
            errorManagement(exception);
        }

    }

    @Entonces("tendra una notificacion de error .")
    public void tendraUnaNotificacionDeError() {

        try {
            System.out.println(registerPage.getMessageMissingEmail());
            Assertions.assertTrue(registerPage.getMessageMissingEmail().contains("This is a required field."));
            quiteDriver();
        } catch (Exception exception) {
            errorManagement(exception);
        }
    }
}
