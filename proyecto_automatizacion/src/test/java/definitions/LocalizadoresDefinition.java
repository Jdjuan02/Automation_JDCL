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
import pages.sourceDemo.HomeSource;

public class LocalizadoresDefinition {

    private final WebDriver driver = WebDriverManager.getDriver();

    @Given("estoy en la web de {string}")
    public void estoy_en_la_web_de(String url) {
        driver.get(url);
    }

    @When("ingreso el userName {string}")
    public void ingreso_el_user_name(String username) throws InterruptedException {
        HomeSource.getInputUserName(driver).sendKeys(username);
    }

    @When("Ingreso el pasword {string}")
    public void ingreso_el_pasword(String password) throws InterruptedException {
        HomeSource.getInputPassword(driver).sendKeys(password);
    }

    @When("preciono el boton Login")
    public void preciono_el_boton_login() {
        HomeSource.getButtomSubmit(driver).click();
    }

    @Then("valido que se logee en el sitio de ejemplo")
    public void valido_que_se_logee_en_el_sitio_de_ejemplo() throws InterruptedException {
        Assert.assertTrue("No se a realizado el mensaje", driver.findElement(By.xpath("//span[contains(text(),\"Products\")]")).isDisplayed());
    }

    public WebDriver getDriver() {
        return driver;
    }
}
