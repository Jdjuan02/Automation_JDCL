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

      When doy click a la categoria "Phones"
      Then Valido que no existan menos de "2" productos

    @Criterio3
    Scenario: Validar que la categoria debe mostrar como maximo 6 productos
      Given Estoy en la web de "https://demoblaze.com/#"

      When doy click en la categoria "Laptops"
      Then Valido que existan maximo "9" productos