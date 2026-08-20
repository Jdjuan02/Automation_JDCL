@feature2
Feature: Clase de localizadores

  @testLocalizadores
  Scenario: Validar Login en pagina de ejemplo
    Given estoy en la web de "https://www.saucedemo.com/"
    When ingreso el userName "standard_user"
    And Ingreso el pasword "secret_sauce"
    And preciono el boton Login
    Then valido que se logee en el sitio de ejemplo