package definitions;

import configs.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Test1Definitions {

    WebDriver driver = WebDriverManager.getDriver();

    @Given("estoy en google")
    public void estoy_en_google() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
    }

    @When("ingreso {string} en el campo de busqueda")
    public void ingreso_en_el_campo_de_busqueda(String texto) throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys(texto);
        Thread.sleep(3000);
    }

    @When("preciono el boton buscar")
    public void preciono_el_boton_buscar() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    @Then("valido que en los resultados aparece {string}")
    public void valido_que_en_los_resultados_aparece(String texto) {
        List<WebElement> elementos = driver.findElements(By.xpath("//span[contains(text(),'"+texto+"')]"));
        Assert.assertFalse("No hay resultados para <<"+texto+">>", elementos.isEmpty());
    }
}
