package definitions;

import configs.WebDriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.demoblaze.HomeDemoBlaze;
import pages.demoblaze.ProductosDemoBlaze;

public class Criterio2_DemoBalze {
    private final WebDriver driver = WebDriverManager.getDriver();

    @When("realizo click sobre el producto de {string}")
    public void realizo_click_sobre_el_producto(String nombreProducto) throws InterruptedException {
        HomeDemoBlaze.getProducto(driver, nombreProducto).click();
        Thread.sleep(3000);
    }

    @When("Valido que la ficha corresponde al producto {string}")
    public void valido_que_la_ficha_corresponde_a(String tituloProd) throws InterruptedException {
        String tituloFront = ProductosDemoBlaze.gettituloProducto(driver).getText();
        String tituloEsperado = tituloProd;
        System.out.println("Se espera el titulo: " + tituloEsperado + " ");
        System.out.println("Se encuentra el titulo: " + tituloFront + " en el front");
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
        System.out.println("Se extrae el titulo: " + productInCart + " ");
        System.out.println("Se debe tener el titulo: " + testProductExpected + " ");
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
        Thread.sleep(2000);
    }

    @Then("valido que el total de los precios sea el correcto")
    public void valido_que_el_total_de_los_precios_sea_el_correcto() {
        int getPricesProducts = Integer.parseInt(ProductosDemoBlaze.getPriceProducts(driver).getText());
        int getProduct2 = Integer.parseInt(ProductosDemoBlaze.getPriceProducts2(driver).getText());
        int getTotalPrice = Integer.parseInt(ProductosDemoBlaze.getPriceTotal(driver).getText());

        System.out.println("Los precios o textos son: " + getPricesProducts);
        System.out.println("Los precios o textos son: " + getProduct2);

        int total = getPricesProducts + getProduct2;
        System.out.println("La sumatoria es: " + total);

        Assert.assertEquals("no corresponde al total de los productos", total, getTotalPrice);
    }

    @When("realizo click sobre Place Order")
    public void realizo_click_sobre_place_order() throws InterruptedException {
        HomeDemoBlaze.getButtonPlaceOrder(driver).click();
        Thread.sleep(2000);
    }

    @Then("valido que el formulario de compra exista")
    public void valido_que_el_formulario_de_compra_exista() {
        WebElement formularioFront = HomeDemoBlaze.getFormOrder(driver);

        Assert.assertTrue("No existeningun formulario", formularioFront.isDisplayed());
    }
}
