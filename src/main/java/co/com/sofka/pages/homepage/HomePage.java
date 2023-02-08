package co.com.sofka.pages.homepage;



import co.com.sofka.pages.CommunActions;
import co.com.sofka.pages.news.NewsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends CommunActions {


private By news =  By.xpath("//*[@id=\"ui-id-3\"]/span");






    public HomePage(WebDriver driver, Integer waitingTime) {
        super(driver, waitingTime);
        initElement(driver, this);
    }


    protected void initElement(WebDriver driver, Object page) {
        PageFactory.initElements(driver, page);
    }

    public NewsPage openNewsPage(){
        clickOnElement(webDriver.findElement(news));
        return new NewsPage(webDriver, 10);
    }


}
