package co.com.sofka.definitions;

import co.com.sofka.pages.home.HomePage;
import co.com.sofka.pages.news.NewsPage;
import co.com.sofka.setup.WebUI;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;

public class IngresarAPaginaNoticiasDefinitions extends WebUI {


    private static HomePage homePage;
    private static NewsPage newsPage;


    @Dado("que el cliente entre a la pagina web")
    public void queElClienteEntreALaPaginaWeb() {

        try {
            generalSetup();
            setUpLog4j2();
            homePage = new HomePage(driver, 10);

        } catch (Exception exception) {
            errorManagement(exception);
        }

    }


    @Cuando("navegue en  la pagina")
    public void navegueEnLaPagina() {

        try {

            newsPage = homePage.openNewsPage();

        } catch (Exception exception) {
            errorManagement(exception);
        }



    }

    @Entonces("podra ver la pagina de bienvenida")
    public void podraVerLaPaginaDeBienvenida() {


        try {

            Assertions.assertEquals("What's New",newsPage.getTitle());

            quiteDriver();

        } catch (Exception exception) {
            errorManagement(exception);
        }

    }


}
