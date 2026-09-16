package pages.demoblaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.FactoryWebElements;

import java.util.List;

public class HomeDemoBlaze {
    public static WebElement getGoupCategories (WebDriver driver){
        return FactoryWebElements.initWithXpath(driver, "//a[contains(@id, \"cat\")]");
    }

    public static WebElement getTitulocategori1 (WebDriver driver){
        return FactoryWebElements.initWithXpath(driver, "//a[contains(@onclick, \"byCat('phone')\")]");
    }

    public static WebElement getTitulocategori2 (WebDriver driver){
        return FactoryWebElements.initWithXpath(driver, "//a[contains(@onclick, \"byCat('notebook')\")]");
    }

    public static WebElement getTitulocategori3 (WebDriver driver){
        return FactoryWebElements.initWithXpath(driver, "//a[contains(@onclick, \"byCat('monitor')\")]");
    }

    /*public static By getContainsProducts (WebDriver cssSelector){
        return By.cssSelector("//div[contains(@class, \"col-lg-4 col-md-6 mb-4\")]");
    }*/

    public static List<WebElement> getProductos (WebDriver driver){
        return FactoryWebElements.initElementsWithXpath(driver, "//div[@class=\"card-block\"]");
    }

    public static WebElement getTituloPrincipal (WebDriver driver){
        return FactoryWebElements.initWithXpath(driver, "/html/head/title");
    }

    public static WebElement getProducto (WebDriver driver, String producto){
        return FactoryWebElements.initWithXpath(driver, "//a[@class=\"hrefch\" and contains(text(), '"+producto+"')]");
    }
}
