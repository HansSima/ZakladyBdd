Feature: Bank

  #Vyzkouset prepsani na Scenario outline
  Scenario: Bilance na uctu
    Given Uzivatel ma ucet s 1000 kc
    When Uzivateli prijde na ucet 500 kc
    And Uzivatel vybere 1250 kc
    Then Uzivatel ma zustatek na uctu 250 kc

  Scenario: Prevod mezi ucty
    Given Uzivatel ma ucet s 1000 kc
    And Uzivatel ma druhy ucet s 1500 kc
    When Uzivatel prevede z prvniho uctu na druhy 1500
    Then Uzivatel ma zustatek na uctu -500 kc
    And Uzivatel ma zustatek na druhem uctu 3000 kc