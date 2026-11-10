Feature: Checkout

  #REQ-031
  Scenario: Nakup bananu
    Given cena za "banan" je 12 kc
    When Uzivatel koupi "banan" v poctu 3 ks
    Then Uzivatel ma v nakupnim kosiku polozky v hodnote 36 kc

  Scenario: Nakup bananu a jablek
    Given cena za "banan" je 12 kc
    And cena za "jablko" je 6 kc
    When Uzivatel koupi "banan" v poctu 3 ks
    And Uzivatel koupi "jablko" v poctu 2 ks
    Then Uzivatel ma v nakupnim kosiku polozky v hodnote 48 kc

    ##Scenario outline
