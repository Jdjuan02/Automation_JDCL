package pages.demoblaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.FactoryWebElements;

public class ProductosDemoBlaze {
    public static WebElement gettituloProducto (WebDriver driver){
        return FactoryWebElements.initWithXpath(driver, "//h2[@class=\"name\"]");
    }

    public static WebElement getProductCart (WebDriver driver){
        return FactoryWebElements.initWithXpath(driver, "//tbody[@id = \"tbodyid\"] //td[text() = \"Nexus 6\"] ");
    }
    public static WebElement getProductCartPhones (WebDriver driver){
        return FactoryWebElements.initWithXpath(driver, "//a[@class = \"hrefch\" and contains(text(), \"Nexus 6\")] ");
    }

    public static WebElement getProductCartLaptops (WebDriver driver){
        return FactoryWebElements.initWithXpath(driver, "//a[@class = \"hrefch\" and contains(text(), \"MacBook air\")] ");
    }

    public static WebElement getPriceProducts (WebDriver driver){
        return FactoryWebElements.initWithXpath(driver, "//tbody[@id='tbodyid']//tr/td[3]");
    }
}
