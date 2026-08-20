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

import configs.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class assercionesDefinitions {

    private final WebDriver driver = WebDriverManager.getDriver();

    @When("valido que el titulo sea {string}")
    public void valido_que_el_titulo_sea(String standard_user) throws InterruptedException {
        Thread.sleep(2000);
        String tituloReal = driver.findElement(By.xpath("//div[contains(@class, \"login_logo\")]")).getText();
        String tituloEsperado = standard_user;

        //Assert.assertEquals("Los mensajes no son iguales", tituloEsperado, tituloReal);
        Assert.assertTrue("El resultado es False", tituloEsperado.equals(tituloReal));
    }
}
