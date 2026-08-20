@feature_asserciones
Feature: Clase de localizadores

  @testAsserciones
  Scenario: Validar Titulo en saurceDemo
    Given estoy en la web de "https://www.saucedemo.com/"
    When valido que el titulo sea "Swag Labs"