package definitions;

import configs.WebDriverManager;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.demoblaze.HomeDemoBlaze;

public class Criterio4_DemoBlaze {
    private final WebDriver driver = WebDriverManager.getDriver();

    @Then("El titulo de la pestaña debe ser {string}")
    public void el_titulo_de_la_pestaña_debe_ser(String tittlePestaña) {
        String tituloStore = driver.getTitle();
        String tituloEsperado = tittlePestaña;


        System.out.println("Se espera: "+tituloEsperado+ " ");
        System.out.println("Se extrae el titulo: "+tituloStore+ " ");
        Assert.assertTrue("El nombre de la pestaña es ", tituloStore.equals(tituloEsperado));
        Assert.assertEquals("la categoria no es igual", tituloStore, tituloEsperado);

    }

}
