@feature_demoblaze_ejercicio2
Feature: ejercicio practico 2

  @Criterioejercicio1
  Scenario: Al hacer click sobre un producto, el sitio debe llevarnos a la ficha de ese producto
    Given Estoy en la web de "https://demoblaze.com/#"
    When realizo click sobre el producto de "Nexus 6"
    And Valido que la ficha corresponde al producto "Nexus 6"
    And realizo clic en agregar a carrito
    And realizo click en el carrito
    Then valido que el producto "Nexus 6" se visualice en el carrito

  @Criterioejercicio2
  Scenario: EL costo total del carrito debe coincidir con los produtos añadidos a el
    Given Estoy en la web de "https://demoblaze.com/#"
    When realizo click sobre Home
    And realizo click en Phones
    And realizo click sobre un producto de Phones
    And realizo click en agregar al carrito y doy click en home
    When realizo click en Laptops
    And realizo click sobre un producto de Laptops
    And realizo click en agregar al carrito y doy click en Cart
    Then valido que el total de los precios sea el correcto

  @Criterioejercicio3
  Scenario: Al presionar en Place Order debe mostrarse el formulario de compra
    Given Estoy en la web de "https://demoblaze.com/#"
    When realizo click sobre Home
    And realizo click en Laptops
    And realizo click sobre un producto de Laptops
    And realizo click en agregar al carrito y doy click en Cart
    When realizo click sobre Place Order
    Then valido que el formulario de compra exista

  @Criterioejercicio4
  Scenario: Al presionar en Place Order debe mostrarse el formulario de compra
    Given Estoy en la web de "https://demoblaze.com/#"
    When realizo click sobre Home
    And realizo click en Laptops
    And realizo click sobre un producto de Laptops
    And realizo click en agregar al carrito y doy click en Cart
    When realizo click sobre Place Order
    And ingreso "Juan Diego" en el campo "Name:"
    And ingreso "Colombia" en el campo "Country:"
    And ingreso "Sibate" en el campo "City:"
    And ingreso "32356685342" en el campo "Credit card:"
    And ingreso "08" en el campo "Month:"
    And ingreso "2026" en el campo "Year:"
    When realizo click en Purchase
    Then valido el mensaje de "Thank you for your purchase!"

