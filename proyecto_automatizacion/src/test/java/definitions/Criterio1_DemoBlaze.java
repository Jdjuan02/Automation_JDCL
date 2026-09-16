package definitions;

import configs.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.demoblaze.HomeDemoBlaze;
import pages.demoblaze.ProductosDemoBlaze;


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

    @Given("doy click a la categoria {string}")
    public void doy_click_a_la_categoria_y(String categoryPhone) throws InterruptedException {

        HomeDemoBlaze.getTitulocategori3(driver).click();
        Thread.sleep(3000);
    }

    @Given("Valido que no existan menos de {string} productos")
    public void la_categoría_debe_tener_como_mínimo_productos(String numProd) {
        int numeroEsperado = Integer.parseInt(numProd);
        int numeroProdFront = HomeDemoBlaze.getProductos(driver).size();
        System.out.println("Se esperan: "+numeroEsperado+ " Elementos");
        System.out.println("Se encuentran: "+numeroProdFront+ " Elementos en el front");
        Assert.assertTrue("El numero de productos es menor al esperado", numeroProdFront >=  numeroEsperado);
    }

    @Then("Valido que existan maximo {string} productos")
    public void valido_que_existan_maximo_productos(String numMaxProd) {
        int numeroEsperado = Integer.parseInt(numMaxProd);
        int numeroProdFront = HomeDemoBlaze.getProductos(driver).size();
        System.out.println("Se esperan: "+numeroEsperado+ " Elementos");
        System.out.println("Se encuentran: "+numeroProdFront+ " Elementos en el front");
        Assert.assertTrue("El numero de productos es mayor al esperado", numeroEsperado >=  numeroProdFront);
    }

    @Then("El titulo de la pestaña debe ser {string}")
    public void el_titulo_de_la_pestaña_debe_ser(String tittlePestaña) {
        String tituloStore = driver.getTitle();
        String tituloEsperado = tittlePestaña;

        System.out.println("Se espera: "+tituloEsperado+ " ");
        System.out.println("Se extrae el titulo: "+tituloStore+ " ");
        Assert.assertTrue("El nombre de la pestaña es ", tituloStore.equals(tituloEsperado));
        Assert.assertEquals("la categoria no es igual", tituloStore, tituloEsperado);

    }

    @When("realizo click sobre el producto {string}")
    public void realizo_click_sobre_el_producto(String nombreProducto) throws InterruptedException {
        HomeDemoBlaze.getProducto(driver, nombreProducto).click();
        Thread.sleep(3000);
    }

    @Then("Valido que la ficha corresponde a {string}")
    public void valido_que_la_ficha_corresponde_a(String tituloProd) {
        String tituloFront = ProductosDemoBlaze.gettituloProducto(driver).getText();
        String tituloEsperado = tituloProd;
        System.out.println("Se espera el titulo: "+tituloEsperado+ " ");
        System.out.println("Se encuentra el titulo: "+tituloFront+ " en el front");
        Assert.assertEquals("El titulo del producto no es igual", tituloFront, tituloEsperado);
    }

}
