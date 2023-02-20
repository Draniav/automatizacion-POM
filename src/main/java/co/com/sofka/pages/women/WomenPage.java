package co.com.sofka.pages.women;

import co.com.sofka.pages.CommunActions;
import co.com.sofka.pages.cart.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class WomenPage extends CommunActions {


    private By productOne = By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[1]/div/a/span/span/img");
    private By productOneSize = By.xpath("//*[@id=\"option-label-size-143-item-166\"]");
    private By productOneColor = By.xpath("//*[@id=\"option-label-color-93-item-52\"]");
    private By productAddBtn = By.xpath("//*[@id=\"product-addtocart-button\"]/span");
    private By productTwo = By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[5]/div[2]/div/ol/li[2]/div/a/span/span/img");
    private By productTwoSize = By.xpath("//*[@id=\"option-label-size-143-item-175\"]");

    private By productTwoColor = By.xpath("//*[@id=\"option-label-color-93-item-58\"]");


    private By shoppingCartLocator = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");
    private By proceedCheckoutLocator = By.id("top-cart-btn-checkout");

    public WomenPage(WebDriver driver, Integer waitingTime) {
        super(driver, waitingTime);

    }


    public void addProductsToCart()
    {
        scrollOn(webDriver.findElement(productOne));
        clickOnElement(webDriver.findElement(productOne));

        scrollOn(webDriver.findElement(productOneSize));
        clickOnElement(webDriver.findElement(productOneSize));
        scrollOn(webDriver.findElement(productOneColor));
        clickOnElement(webDriver.findElement(productOneColor));
        clicProductAddBtn();

        scrollOn(webDriver.findElement(productTwo));
        clickOnElement(webDriver.findElement(productTwo));
        scrollOn(webDriver.findElement(productTwoSize));
        clickOnElement(webDriver.findElement(productTwoSize));
        scrollOn(webDriver.findElement(productTwoColor));
        clickOnElement(webDriver.findElement(productTwoColor));
        clicProductAddBtn();
    }
    public void clicProductAddBtn(){
        scrollOn(webDriver.findElement(productAddBtn));
        clickOnElement(webDriver.findElement(productAddBtn));
    }

    public CartPage openShoppingCartPage() {

        clickOnElement(webDriver.findElement(shoppingCartLocator));
        clickOnElement(webDriver.findElement(proceedCheckoutLocator));
        return new CartPage(webDriver, 10);
    }
}
