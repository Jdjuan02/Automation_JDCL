@feature_demoblaze
  Feature: Al ingresar al home de demoblaze deben poder visualizarse las categorias de : Phones, Laptops y Monitors

    @Criterio1
    Scenario: Al ingresar al home de demoblaze deben poder visualizarse las categorias de : Phones, Laptops y Monitors
      Given Estoy en la web de "https://demoblaze.com/#"
      When Validar Card de "CATEGORIES"
      Then Validar categorias de "Phones", "Laptops" y "Monitors"

    @Criterio2
    Scenario: Validar que la categoria Phones y no tiene menos de 2 productos
      Given Estoy en la web de "https://demoblaze.com/#"
      When doy click a la categoria "Monitors"
      Then Valido que no existan menos de "2" productos

    @Criterio3
    Scenario: Validar que la categoria debe mostrar como maximo 9 productos
      Given Estoy en la web de "https://demoblaze.com/#"
      Then Valido que existan maximo "9" productos


    @Criterio4
    Scenario: El titulo de la pestaña es store
      Given Estoy en la web de "https://demoblaze.com/#"
      Then El titulo de la pestaña debe ser "STORE"

    @Criterio5
    Scenario: Al hacer click sobre un producto, el sitio debe llevarnos a la ficha de ese producto
      Given Estoy en la web de "https://demoblaze.com/#"
      When realizo click sobre el producto "Apple monitor 24"
      Then Valido que la ficha corresponde a "Apple monitor 24"