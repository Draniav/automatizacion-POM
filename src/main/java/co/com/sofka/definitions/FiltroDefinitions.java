package co.com.sofka.definitions;

import co.com.sofka.pages.fitness.FitnessPage;

import co.com.sofka.pages.home.HomePage;
import co.com.sofka.setup.WebUI;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;


public class FiltroDefinitions extends WebUI {

    private HomePage homePage;
    private FitnessPage fitnessPage;


    @Dado("que el usuario navega hacia el modulo de Gear-Fitness Equipement")
    public void queElUsuarioNavegaHaciaElModuloDeGearFitnessEquipement() {
        System.out.println("Paso 1");
        try {
            generalSetup();
            setUpLog4j2();
            homePage = new HomePage(driver, 10);
            fitnessPage = homePage.openFitnessPage();
        } catch (Exception exception) {
            errorManagement(exception);
        }

    }

    @Cuando("selecciona  el filtro  Actividad en Gym")
    public void seleccionaElFiltroActividadEnGym() {
        System.out.println("Selecciona el filtro actividad en gym");

        try {
            fitnessPage.selectActivityGym();
        } catch (Exception exception) {
            errorManagement(exception);
        }

    }

    @Y("selecciona  el filtro Genero en unisex")
    public void seleccionaElFiltroGeneroEnUnisex() {
        System.out.println("selecciona  el filtro Genero en unisex");
        try {
            fitnessPage.selectGenderUnisex();
        } catch (Exception exception) {
            errorManagement(exception);
        }
    }

    @Y("selecciona articulos")
    public void seleccionaArticulos() {
        System.out.println("sselecciona articulos");
        try {
            fitnessPage.addProducts();
        } catch (Exception exception) {
            errorManagement(exception);
        }

    }

    @Entonces("se hara la verificacion de los productos")
    public void seHaraLaVerificacionDeLosProductos() {

        try {
            Assertions.assertTrue(fitnessPage.getAmountProducts() >= fitnessPage.getProducts());

            quiteDriver();
        } catch (Exception exception) {
            errorManagement(exception);
        }
    }



}
