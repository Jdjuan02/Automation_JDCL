@feature_demoblaze
  Feature: Al ingresar al home de demoblaze deben poder visualizarse las categorias de : Phones, Laptops y Monitors

    @Criterio1
    Scenario: Al ingresar al home de demoblaze deben poder visualizarse las categorias de : Phones, Laptops y Monitors
      Given Estoy en la web de "https://demoblaze.com/#"
      When Validar Card de "CATEGORIES"
      Then Validar categorias de "Phones", "Laptops" y "Monitors"


    @Criterio2
    Scenario: Al ingresar al home de demoblaze deben poder visualizarse las categorias de : Phones, Laptops y Monitors
      Given Estoy en la web de "https://demoblaze.com/#"

      When ingreso a la categoría "Phones"
      Then la categoría debe tener como mínimo 2 productos

      When ingreso a la categoría "Laptops"
      Then la categoría debe tener como mínimo 2 productos

      When ingreso a la categoría "Monitors"
      Then la categoría debe tener como mínimo 2 productos

      @Criterio3
      Scenario: Validar que laa categoria monitor no tiene menos de 2 productos
        Given Estoy en la web de "https://demoblaze.com/#"
        When doy click a la categoria "Phones"
        Then Valido que no existan menos de "2" prodictos