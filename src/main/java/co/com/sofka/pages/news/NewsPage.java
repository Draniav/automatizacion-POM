package co.com.sofka.pages.news;


import co.com.sofka.pages.CommunActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class NewsPage extends CommunActions {

    private By title = By.xpath("//*[@id=\"page-title-heading\"]/span");


    public NewsPage(WebDriver driver, Integer waitingTime) {
        super(driver, waitingTime);
    }


    public String getTitle() {

        return getTextFromElement(webDriver.findElement(title));
    }


}
