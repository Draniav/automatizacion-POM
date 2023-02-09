package co.com.sofka.pages.home;


import co.com.sofka.pages.CommunActions;
import co.com.sofka.pages.cart.CartPage;
import co.com.sofka.pages.login.LoginPage;
import co.com.sofka.pages.news.NewsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends CommunActions {


    private By news = By.xpath("//*[@id=\"ui-id-3\"]/span");

    private By signIn = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");

    private By cart = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");

    private By product = By.xpath(" //*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[5]/div/a/span/span/img");
    //*[@id="maincontent"]/div[3]/div/div[2]/div[3]/div/div/ol/li[5]/div/div/div[3]/div/div[1]/form/button/span
    private By addProductBtn = By.xpath("  //*[@id=\"product-addtocart-button\"]/span");

    private By confirmationMessage = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a/span[2]/span[1]");


    public HomePage(WebDriver driver, Integer waitingTime) {
        super(driver, waitingTime);
    }


    public NewsPage openNewsPage() {
        clickOnElement(webDriver.findElement(news));
        return new NewsPage(webDriver, 10);
    }

    public LoginPage openSignInForm() {
        clickOnElement(webDriver.findElement(signIn));
        return new LoginPage(webDriver, 10);
    }

    public CartPage openCart() {
        clickOnElement(webDriver.findElement(cart));
        return new CartPage(webDriver, 10);
    }


    public void clicAddProduct() {

        scrollOn(webDriver.findElement(product));
        clickOnElement(webDriver.findElement(product));
        scrollOn(webDriver.findElement(addProductBtn));
        clickOnElement(webDriver.findElement(addProductBtn));
    }

    public String getConfirmationMessage() {
        return getTextFromElement(webDriver.findElement(confirmationMessage))+1;
    }
}
