package definitions;

import configs.WebDriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.demoblaze.HomeDemoBlaze;

public class Criterio3_DemoBlaze {

    private final WebDriver driver = WebDriverManager.getDriver();

    @When("doy click en la categoria {string}")
    public void doy_click_en_la_categoria(String string) throws InterruptedException {
        HomeDemoBlaze.getTitulocategori2(driver).click();
        Thread.sleep(3000);
    }

    @Then("Valido que existan maximo {string} productos")
    public void valido_que_existan_maximo_productos(String numMaxProd) {
        int numeroEsperado = Integer.parseInt(numMaxProd);
        int numeroProdFront = HomeDemoBlaze.getProductos(driver).size();
        System.out.println("Se esperan: "+numeroEsperado+ " Elementos");
        System.out.println("Se encuentran: "+numeroProdFront+ " Elementos en el front");
        Assert.assertTrue("El numero de productos es mayor al esperado", numeroEsperado >=  numeroProdFront);
    }
}
