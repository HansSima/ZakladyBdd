Feature: pokus

  Scenario: Pokusny test 1
    Given nastaveni pocatecnich podminek
    And dalsi nastaveni pocatecnich podminek
    When toto je nejaka akce
    And toto je nejaka dalsi akce
    Then overeni vysledku
    And dalsi overeni vysledku

  Scenario: Pokusny test 2
    Given nastaveni pocatecnich podminek
    When toto je nejaka dalsi akce
    And toto je nejaka akce
    Then overeni vysledku

  Scenario: Kalkulacka - soucet dvou cisel
    Given Uzivatel ma zadany dve cisla 5 a 8
    When Uzivatel secte tato dve cisla
    Then Uzivatel vidi na kalkulacce vysledek 13