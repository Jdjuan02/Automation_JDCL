@feature_demoblaze2
  Feature: Cada categoria debe mostrarse minimo 2 productos

    @Criterio2
    Scenario: Al ingresar al home de demoblaze deben poder visualizarse las categorias de : Phones, Laptops y Monitors
      Given Estoy en la web de "https://demoblaze.com/#"

      When ingreso a la categoría "Phones"
      Then la categoría debe tener como mínimo 2 productos

      When ingreso a la categoría "Laptops"
      Then la categoría debe tener como mínimo 2 productos

      When ingreso a la categoría "Monitors"
      Then la categoría debe tener como mínimo 2 productos