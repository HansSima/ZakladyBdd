Feature: Bank

  Scenario: Bilance na uctu
    Given Uzivatel ma ucet s 1000 kc
    When Uzivatel vybere 250 kc
    And Uzivateli prijde na ucet 500 kc
    Then Uzivatel ma zustatek na uctu 1250 kc