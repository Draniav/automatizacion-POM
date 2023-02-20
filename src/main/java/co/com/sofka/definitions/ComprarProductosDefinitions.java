package co.com.sofka.definitions;

import co.com.sofka.pages.cart.CartPage;
import co.com.sofka.pages.home.HomePage;
import co.com.sofka.pages.men.MenPage;
import co.com.sofka.pages.women.WomenPage;
import co.com.sofka.setup.WebUI;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import java.util.concurrent.TimeUnit;


public class ComprarProductosDefinitions extends WebUI {
    private HomePage homePage;
    private MenPage menPage;

    private WomenPage womenPage;

    private CartPage cartPage;


    @Dado("que el usuario se dirige al modulo de women")
    public void queElUsuarioSeDirigeAlModuloDeWomen() {
        try {
            setUpLog4j2();
            generalSetup();
            homePage = new HomePage(driver, 10);
            //        womenPage = homePage.openWomenPage();
        } catch (Exception exception) {
            errorManagement(exception);
        }
    }

    @Y("agregue {int} productos al carrito de compras")
    public void agregueProductosAlCarritoDeCompras(int productsAmount) {
        try {
            //        womenPage.addProductsToCart(productsAmount);
        } catch (Exception exception) {
            errorManagement(exception);
        }
    }

    @Y("valla al modulo de hombres")
    public void vallaAlModuloDeHombres() {
        try {
            //         menPage = womenPage.openMenPage();
        } catch (Exception exception) {
            errorManagement(exception);
        }
    }

    @Y("agregue otros {int} productos al carrito de compras")
    public void agregueOtrosProductosAlCarritoDeCompras(int productsAmount) throws InterruptedException {
        try {

            //  menPage.addProductsToCart(productsAmount);
            //     shoppingCartPage = menPage.openShoppingCartPage();
        } catch (Exception exception) {
            errorManagement(exception);
        }
    }

    @Cuando("realize el checkout rellenando los campos obligatorios")
    public void realizeElCheckoutRellenandoLosCamposObligatorios() throws InterruptedException {
        try {
            //  cartPage.checkOut();
        } catch (Exception exception) {
            errorManagement(exception);
        }
    }

    @Y("confirme la compra")
    public void confirmeLaCompra() throws InterruptedException {
        try {
            //       shoppingCartPage.placeOrder();
        } catch (Exception exception) {
            errorManagement(exception);
        }
    }

    @Entonces("podrá ver el siguiente mensaje  : {string}.")
    public void podraVerElSiguienteMensaje(String message) {
        try {

            quiteDriver();
        } catch (Exception exception) {
            errorManagement(exception);
        }
    }


    @Dado("que el usuario en el modulo de men agregue  productos al carrito de compras")
    public void queElUsuarioEnElModuloDeMenAgregueProductosAlCarritoDeCompras() {
        try {
            setUpLog4j2();
            generalSetup();
            homePage = new HomePage(driver, 10);
            menPage = homePage.openMenPage();
            menPage.addProductsToCart();

        } catch (Exception exception) {
            errorManagement(exception);
        }

    }

    @Y("el usuario navege en el modulo women agregue  productos  al carrito de compras")
    public void elUsuarioNavegeEnElModuloWomenAgregueProductosAlCarritoDeCompras() {
        try {
           menPage.clicOnWomen();
            womenPage.addProductsToCart();



        } catch (Exception exception) {
            errorManagement(exception);
        }
    }

    @Y("realize el envio exitoso del  formuilario Checkout")
    public void realizeElEnvioExitosoDelFormuilarioCheckout() {

    }

    @Entonces("podrá ver un  mensaje de confirmacion.")
    public void podráVerUnMensajeDeConfirmacion() {

        try {
            //      Assertions.assertTrue(fitnessPage.getAmountProducts() >= fitnessPage.getProducts());
            //   Assertions.assertTrue(shoppingCartPage.successfulMessage().contains(message));
            // quiteDriver();
        } catch (Exception exception) {
            errorManagement(exception);
        }
    }
}
