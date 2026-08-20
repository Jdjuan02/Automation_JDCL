package definitions;

import configs.WebDriverManager;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class CommonSteps {

    WebDriver driver = WebDriverManager.getDriver();

    @Given("Estoy en la web de {string}")
    public void estoy_en_la_web_de(String url) {
        driver.get(url);
    }
}
