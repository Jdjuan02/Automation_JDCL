@feature_demoblaze_ejercicio3
Feature: ejercicio practico 3

  @Criterio3ejercicio1
  Scenario: Validar los detalles de un producto
    Given Estoy en la web de "https://demoblaze.com/#"
    When realizo click sobre el producto de "Nexus 6"
    And valido que el producto tenga imagen
    And valido que el producto tenga el precio "$650 *includes tax"
    Then valido que el producto tenga descripcion