package pages.demoblaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.FactoryWebElements;

import java.util.List;

public class HomeDemoBlaze {
    public static WebElement getGoupCategories(WebDriver driver) {
        return FactoryWebElements.initWithXpath(driver, "//a[contains(@id, \"cat\")]");
    }
    // Criterio1 -
    public static WebElement getTitulocategori1(WebDriver driver, String categoria1) {
        return FactoryWebElements.initWithXpath(driver, "//a[@id = \"itemc\" and contains(text(), '"+categoria1+"')]");
    }
    // Criterio1 -
    public static WebElement getTitulocategori2(WebDriver driver, String categoria2) {
        return FactoryWebElements.initWithXpath(driver, "//a[@id = \"itemc\" and contains(text(), '"+categoria2+"')]");
    }
    // Criterio1 - 
    public static WebElement getTitulocategori3(WebDriver driver, String categoria3) {
        return FactoryWebElements.initWithXpath(driver, "//a[@id = \"itemc\" and contains(text(), '"+categoria3+"')]");
    }

    /*public static By getContainsProducts (WebDriver cssSelector){
        return By.cssSelector("//div[contains(@class, \"col-lg-4 col-md-6 mb-4\")]");
    }*/

    public static List<WebElement> getProductos(WebDriver driver) {
        return FactoryWebElements.initElementsWithXpath(driver, "//div[@class=\"card-block\"]");
    }

    public static WebElement getTituloPrincipal(WebDriver driver) {
        return FactoryWebElements.initWithXpath(driver, "/html/head/title");
    }

    public static WebElement getProducto(WebDriver driver, String producto) {
        return FactoryWebElements.initWithXpath(driver, "//a[@class=\"hrefch\" and contains(text(), '" + producto + "')]");
    }

    public static WebElement getProductCart1(WebDriver driver) {
        return FactoryWebElements.initWithXpath(driver, "//a[@class = \"btn btn-success btn-lg\" and contains(text(), \"Add to cart\")]");
    }

    public static WebElement getButtonCart(WebDriver driver) {
        return FactoryWebElements.initWithXpath(driver, "//a[@id = \"cartur\"]");
    }

    public static WebElement getButtonHome(WebDriver driver) {
        return FactoryWebElements.initWithXpath(driver, "//a[@class=\"nav-link\" and contains(text(), \"Home \")]");
    }

    public static WebElement getButtonPlaceOrder(WebDriver driver) {
        return FactoryWebElements.initWithXpath(driver, "//button[@data-target=\"#orderModal\" and contains(text(), \"Place Order\")]");
    }

    public static WebElement getFormOrder(WebDriver driver) {
        return FactoryWebElements.initWithXpath(driver, "//h5[@id=\"orderModalLabel\" and contains(text(),\"Place order\")]/ancestor::div[contains(@class,'modal-content')]//form");
    }
}
