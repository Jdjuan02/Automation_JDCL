package definitions;

import configs.WebDriverManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.demoblaze.HomeDemoBlaze;

public class Criterio2_DemoBlaze {

    private final WebDriver driver = WebDriverManager.getDriver();

    /*@Given("Estoy en la web de {string}")
    public void estoy_en_la_web_de(String url) {
        driver.get(url);
    }*/

    @When("doy click a la categoria {string}")
    public void ingreso_a_la_categoría(String producto) throws InterruptedException {

        HomeDemoBlaze.getTitulocategori1(driver).click();
        Thread.sleep(3000);
    }

    @Then("Valido que no existan menos de {string} prodictos")
    public void la_categoría_debe_tener_como_mínimo_productos(String numProd) {
        int numeroEsperado = Integer.parseInt(numProd);
        int numeroProdFront = HomeDemoBlaze.getProductos(driver).size();
        System.out.println("Se esperan: "+numeroEsperado+ " Elementos");
        System.out.println("Se encuentran: "+numeroProdFront+ " Elementos en el foront");
        Assert.assertTrue("El numero de productos es menor al esperado", numeroProdFront <=  numeroEsperado);
    }
}
