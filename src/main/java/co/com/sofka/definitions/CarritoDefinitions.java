package co.com.sofka.definitions;

import co.com.sofka.pages.cart.CartPage;
import co.com.sofka.pages.home.HomePage;
import co.com.sofka.setup.WebUI;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;

public class CarritoDefinitions extends WebUI {

    private static CartPage cartPage;
    private static HomePage homePage;


    @Dado("que el cliente en  la pagina principal")
    public void queElClienteEnLaPaginaPrincipal() {
        try {
            generalSetup();
            setUpLog4j2();
            homePage = new HomePage(driver, 10);

        } catch (Exception exception) {
            errorManagement(exception);
        }
    }


    @Cuando("seleccione de la seccion Hot Sellers   un  articulo")
    public void seleccioneDeLaSeccionHotSellersUnArticulo() {

        try {

            homePage.clicAddProduct();


        } catch (Exception exception) {
            errorManagement(exception);
        }

    }

    @Entonces("podra ver un  mensaje de confirmacion")
    public void podraVerUnMensajeDeConfirmacion() {

        try {

            Assertions.assertEquals("1", homePage.getConfirmationMessage());

            quiteDriver();

        } catch (Exception exception) {
            errorManagement(exception);
        }


    }





    @Cuando("abra la cartilla de productos")
    public void abraLaCartillaDeProductos() {

        try {
            Thread.sleep(3000);
            homePage.openCart();


        } catch (Exception exception) {
            errorManagement(exception);
        }
    }

    @Cuando("haga clic en  el  boton eliminar y confirmar")
    public void hagaClicEnElBotonEliminarYConfirmar() {

        try {


            homePage.clicRemoveBtn();
            homePage.openCart();
        } catch (Exception exception) {
            errorManagement(exception);
        }
    }


    @Entonces("vera el  mensaje en  la cartilla: {string}")
    public void veraElMensajeEnLaCartilla(String message) {

        try {
            System.out.println(homePage.getMessage());
            Assertions.assertTrue(homePage.getMessage().contains(message));
            quiteDriver();
        } catch (Exception exception) {
            errorManagement(exception);
        }

    }
}
