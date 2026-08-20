package definitions;

import configs.WebDriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.demoblaze.HomeDemoBlaze;

import java.util.List;

public class Criterio2_DemoBlaze {

    private final WebDriver driver = WebDriverManager.getDriver();

    /*@Given("Estoy en la web de {string}")
    public void estoy_en_la_web_de(String url) {
        driver.get(url);
    }*/

    @When("ingreso a la categoría {string}")
    public void ingreso_a_la_categoría(String Phones) {
        HomeDemoBlaze.getTitulocategori1(driver).click();
    }

    @Then("la categoría debe tener como mínimo {int} productos")
    public void la_categoría_debe_tener_como_mínimo_productos(Integer cantidadEsperada) {
        List<WebElement> productos = driver.findElements(
                By.cssSelector("#tbodyid > div.col-lg-4")
        );

        int cantidadProductos = productos.size();

        Assert.assertTrue(
                "Se esperaban mínimo " + cantidadEsperada +
                        " productos, pero se encontraron: " + cantidadProductos,
                cantidadProductos >= cantidadEsperada
        );
    }
}
