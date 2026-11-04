package definitions;

import configs.WebDriverManager;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void cerrarNavegador() {
        WebDriverManager.quitDriver();
    }
}