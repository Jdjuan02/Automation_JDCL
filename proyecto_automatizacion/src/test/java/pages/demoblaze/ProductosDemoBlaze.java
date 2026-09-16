package pages.demoblaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.FactoryWebElements;

public class ProductosDemoBlaze {
    public static WebElement gettituloProducto (WebDriver driver){
        return FactoryWebElements.initWithXpath(driver, "//h2[@class=\"name\"]");
    }
}
