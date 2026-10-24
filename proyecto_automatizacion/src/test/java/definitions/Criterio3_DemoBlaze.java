package definitions;

import configs.WebDriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.demoblaze.ProductosDemoBlaze;

public class Criterio3_DemoBlaze {
    private final WebDriver driver = WebDriverManager.getDriver();

    @When("valido que el producto tenga imagen")
    public void valido_que_el_producto_tenga_imagen() {
        String imageFront = String.valueOf(ProductosDemoBlaze.getImageProduct(driver).isDisplayed());
        Assert.assertTrue("La imagen no esta visible ", Boolean.parseBoolean(imageFront));
    }

    @When("valido que el producto tenga el precio {string}")
    public void valido_que_el_producto_tenga_el_precio(String precioRequerido) {
        String precioFront = ProductosDemoBlaze.getPriceProduct(driver).getText();
        String precioReal = precioRequerido;

        System.out.println("Se extrae el precio: " + precioFront + " ");
        System.out.println("Se debe tener el precio: " + precioReal + " ");
        Assert.assertEquals("los valores no son iguales", precioFront,precioReal);
    }

    @Then("valido que el producto tenga descripcion")
    public void valido_que_el_producto_tenga_descripcion() {
        WebElement desciptionFront = ProductosDemoBlaze.getDescriptionProduct(driver);
        String description = desciptionFront.getText();
        System.out.println("Se visualiza la siguiente descripcion" +description);
        Assert.assertTrue("No hay contenido en la descripcion: ", desciptionFront.isDisplayed() && !description.trim().isEmpty());
    }
}
