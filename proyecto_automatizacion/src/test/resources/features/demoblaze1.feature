@feature_demoblaze
  Feature: Al ingresar al home de demoblaze deben poder visualizarse las categorias de : Phones, Laptops y Monitors

    @Criterio1
    Scenario: Al ingresar al home de demoblaze deben poder visualizarse las categorias de : Phones, Laptops y Monitors
      Given Estoy en la web de "https://demoblaze.com/#"
      When Validar Card de "CATEGORIES"
      Then Validar categorias de "Phones", "Laptops" y "Monitors"