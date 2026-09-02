package definitions;

import configs.WebDriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.demoblaze.HomeDemoBlaze;


public class Criterio1_DemoBlaze {

    private final WebDriver driver = WebDriverManager.getDriver();

    /*@Given("Estoy en la web de {string}")
    public void estoy_en_la_web_de(String url) {
        driver.get(url);
    }*/

    @When("Validar Card de {string}")
    public void validar_card_de(String CATEGORIES) throws InterruptedException {
        String tituloActual = HomeDemoBlaze.getGoupCategories(driver).getText();
        String tituloEsperado = CATEGORIES;


        Assert.assertEquals("Los mensajes no son iguales", tituloEsperado, tituloActual);
    }

    @Then("Validar categorias de {string}, {string} y {string}")
    public void validar_categorias_de_y(String categori1, String categori2, String categori3) {
        String titulocategori1 = HomeDemoBlaze.getTitulocategori1(driver).getText();
        String tituloEsperadoC1 = categori1;

        Assert.assertEquals("la categoria no es igual", titulocategori1, tituloEsperadoC1);

        String titulocategori2 = HomeDemoBlaze.getTitulocategori2(driver).getText();
        String tituloEsperadoC2 = categori2;

        Assert.assertEquals("la categoria no es igual", titulocategori2, tituloEsperadoC2);

        String titulocategori3 = HomeDemoBlaze.getTitulocategori3(driver).getText();
        String tituloEsperadoC3 = categori3;

        Assert.assertEquals("la categoria no es igual", titulocategori3, tituloEsperadoC3);
    }
}
