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

        HomeDemoBlaze.getTitulocategori1(driver).click();
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

    @When("Valido que la ficha corresponde a {string}")
    public void valido_que_la_ficha_corresponde_a(String tituloProd) throws InterruptedException {
        String tituloFront = ProductosDemoBlaze.gettituloProducto(driver).getText();
        String tituloEsperado = tituloProd;
        System.out.println("Se espera el titulo: "+tituloEsperado+ " ");
        System.out.println("Se encuentra el titulo: "+tituloFront+ " en el front");
        Assert.assertEquals("El titulo del producto no es igual", tituloFront, tituloEsperado);
        Thread.sleep(3000);
    }

    @When("realizo clic en agregar a carrito")
    public void realizo_clic_en_agregar_a_carrito() throws InterruptedException {
        HomeDemoBlaze.getProductCart1(driver).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }

    @When("realizo click en el carrito")
    public void realizo_click_en_el_carrito() {
        HomeDemoBlaze.getButtonCart(driver).click();
    }

    @Then("valido que el producto {string} se visualice en el carrito")
    public void valido_que_el_producto_se_visualice_en_el_carrito(String tituloProd) {
        String productInCart = ProductosDemoBlaze.getProductCart(driver).getText();
        String testProductExpected = tituloProd;
        System.out.println("Se extrae el titulo: "+productInCart+ " ");
        System.out.println("Se debe tener el titulo: "+testProductExpected+ " ");
    }

    @When("realizo click sobre Home")
    public void realizo_click_sobre_home() throws InterruptedException {
        HomeDemoBlaze.getButtonHome(driver).click();
        Thread.sleep(2000);
    }

    @When("realizo click en Phones")
    public void realizo_click_en_phones() {
        HomeDemoBlaze.getTitulocategori1(driver).click();
    }

    @When("realizo click sobre un producto de Phones")
    public void realizo_click_sobre_un_producto_de_phones() throws InterruptedException {
        ProductosDemoBlaze.getProductCartPhones(driver).click();
        Thread.sleep(2000);
    }

    @When("realizo click en agregar al carrito y doy click en home")
    public void realizo_click_en_agregar_al_carrito_y_doy_click_en_home() throws InterruptedException {
        HomeDemoBlaze.getProductCart1(driver).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        HomeDemoBlaze.getButtonHome(driver).click();
    }

    @When("realizo click en Laptops")
    public void realizo_click_en_laptops() {
        HomeDemoBlaze.getTitulocategori2(driver).click();
    }

    @When("realizo click sobre un producto de Laptops")
    public void realizo_click_sobre_un_producto_de_laptops() throws InterruptedException {
        ProductosDemoBlaze.getProductCartLaptops(driver).click();
        Thread.sleep(2000);
    }

    @When("realizo click en agregar al carrito y doy click en Cart")
    public void realizo_click_en_agregar_al_carrito_y_doy_click_en_cart() throws InterruptedException {
        HomeDemoBlaze.getProductCart1(driver).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        HomeDemoBlaze.getButtonCart(driver).click();
    }

    @Then("valido que el total de los precios sea el correcto")
    public void valido_que_el_total_de_los_precios_sea_el_correcto() {
        String getPricesProducts = ProductosDemoBlaze.getPriceProducts(driver).getText();

        System.out.println("Los precios o textos son: "+getPricesProducts);
    }

}
