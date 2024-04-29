Feature: Contador App

  Scenario: Incrementar contador
    When Camilo incrementa el contador a 10
    Then el debe observar el contador en 10

  Scenario: Disminuir contador
    Given que Camilo quiere incrementar el contador a 10
    When el disminuye el contador a 4
    Then el debe observar el contador en 6

  Scenario: Reiniciar contador
    Given que Camilo quiere incrementar el contador a 50
    When el reinicia el contador
    Then el debe observar el contador en 0
