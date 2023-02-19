package co.com.sofka.pages.home;


import co.com.sofka.pages.CommunActions;
import co.com.sofka.pages.cart.CartPage;
import co.com.sofka.pages.fitness.FitnessPage;
import co.com.sofka.pages.login.LoginPage;
import co.com.sofka.pages.news.NewsPage;
import co.com.sofka.pages.register.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends CommunActions {


    private By news = By.xpath("//*[@id=\"ui-id-3\"]/span");

    private By signIn = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");

    private By cart = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");

    private By product = By.xpath(" //*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[5]/div/a/span/span/img");

    private By addProductBtn = By.xpath("  //*[@id=\"product-addtocart-button\"]/span");

    private By confirmationMessage = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a/span[2]/span[1]");


    private By editCart = By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a/span");

    private By remove = By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td/div/a[2]");

    private By message = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/p[1]");

    private By register = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a");

    private By messageWelcome = By.xpath(" /html/body");

    private By gearBtn = By.xpath("//*[@id=\"ui-id-6\"]/span[2]");

    private By fitnessEquipment = By.xpath("//a[contains(text(), 'Fitness Equipment')]");


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

    public void clicRemoveBtn() {

        scrollOn(webDriver.findElement(editCart));

        clickOnElement(webDriver.findElement(editCart));

        scrollOn(webDriver.findElement(remove));

        clickOnElement(webDriver.findElement(remove));


    }

    public String getMessage() {

        return getTextFromElement(webDriver.findElement(message));
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


    public String getMessages() {

        return getTextFromElement(webDriver.findElement(messageWelcome));
    }

    public RegisterPage openRegisterForm() {
        clickOnElement(webDriver.findElement(register));
        return new RegisterPage(webDriver, 10);
    }


    public FitnessPage openFitnessPage(){

        scrollOn(webDriver.findElement(gearBtn));
        clickOnElement(webDriver.findElement(gearBtn));
        scrollOn(webDriver.findElement(fitnessEquipment));
        clickOnElement(webDriver.findElement(fitnessEquipment));
        return new FitnessPage(webDriver, 10);
    }

}
