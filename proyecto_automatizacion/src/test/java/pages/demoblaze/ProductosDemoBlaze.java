package pages.demoblaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.FactoryWebElements;

import java.util.List;

public class ProductosDemoBlaze {
    public static WebElement gettituloProducto(WebDriver driver) {
        return FactoryWebElements.initWithXpath(driver, "//h2[@class=\"name\"]");
    }

    public static WebElement getProductCart(WebDriver driver) {
        return FactoryWebElements.initWithXpath(driver, "//tbody[@id = \"tbodyid\"] //td[text() = \"Nexus 6\"] ");
    }

    public static WebElement getProductCartPhones(WebDriver driver) {
        return FactoryWebElements.initWithXpath(driver, "//a[@class = \"hrefch\" and contains(text(), \"Nexus 6\")] ");
    }

    public static WebElement getProductCartLaptops(WebDriver driver) {
        return FactoryWebElements.initWithXpath(driver, "//a[@class = \"hrefch\" and contains(text(), \"MacBook air\")] ");
    }

    public static WebElement getPriceProducts(WebDriver driver) {
        return FactoryWebElements.initWithXpath(driver, "//td[contains(text(), \"700\")]");
    }

    public static WebElement getPriceProducts2(WebDriver driver) {
        return FactoryWebElements.initWithXpath(driver, "//td[contains(text(), \"650\")]");
    }

    public static WebElement getPriceTotal(WebDriver driver) {
        return FactoryWebElements.initWithXpath(driver, "//h3[@id=\"totalp\"]");
    }

    public static WebElement getDateForm(WebDriver driver, String campo) {
        return FactoryWebElements.initWithXpath(driver, "//label[text()='"+campo+"']//following-sibling::input");
    }

    public static WebElement getButtonPurchase(WebDriver driver) {
        return FactoryWebElements.initWithXpath(driver, "//button[@onclick=\"purchaseOrder()\" and contains(text(),\"Purchase\")]");
    }

    public static WebElement getTextPurchase(WebDriver driver,String tituloPurchase) {
        return FactoryWebElements.initWithXpath(driver, "//h2[text()='"+tituloPurchase+"']");
    }

    public static WebElement getImageProduct(WebDriver driver) {
        return FactoryWebElements.initWithXpath(driver, "//div[@id =\"imgp\"]/div[@class = \"item active\"]/img");
    }

    public static WebElement getPriceProduct(WebDriver driver) {
        return FactoryWebElements.initWithXpath(driver, "//h3[@class =\"price-container\" and contains(text(), \"$650\")]");
    }

    public static WebElement getDescriptionProduct(WebDriver driver) {
        return FactoryWebElements.initWithXpath(driver, "//div[@id =\"more-information\"]/p");
    }

    public static WebElement getbuttonDeletedProduct(WebDriver driver) {
        return FactoryWebElements.initWithXpath(driver, "//tr[@class =\"success\"]/td/a[contains(text(), \"Delete\")]");
    }

    /*public static List<WebElement> getNameProductDrop(WebDriver driver, String nameProductDrop) {
        return FactoryWebElements.initElementsWithXpath(driver, "//tbody[@id=\"tbodyid\"]//td[normalize-space()='"+nameProductDrop+"']");
    }*/



}
