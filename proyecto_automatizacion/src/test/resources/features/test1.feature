@feature1
Feature: Primera automatizacion

  @testGoogle
  Scenario: Validar una busqueda en google
    Given estoy en google
    When ingreso "Comida china" en el campo de busqueda
    And preciono el boton buscar
    Then valido que en los resultados aparece "Comida china"

  @testGoogle2
  Scenario: Validar una busqueda en google parte 2
    Given estoy en google
    When ingreso "Lego" en el campo de busqueda
    And preciono el boton buscar
    Then valido que en los resultados aparece "Lego"
