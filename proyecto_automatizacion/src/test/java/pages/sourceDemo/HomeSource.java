package pages.sourceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.FactoryWebElements;

public class HomeSource {



    public static WebElement getInputUserName(WebDriver driver){
        return  FactoryWebElements.initWithXpath(driver, "//input[@placeholder=\"Username\"] ");
    }

    public static WebElement getInputPassword(WebDriver driver){
        return  FactoryWebElements.initWithXpath(driver, "//input[@placeholder=\"Password\"] ");
    }

    public static WebElement getButtomSubmit(WebDriver driver){
        return  FactoryWebElements.initWithXpath(driver, "//input[contains(@class, \"submit-button\")] ");
    }

}
