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

