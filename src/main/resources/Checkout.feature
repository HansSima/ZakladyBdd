Feature: Checkout

  #REQ-031
  Scenario: Nakup bananu
    Given cena za "banan" je 12 kc
    When Uzivatel koupi "banan" v poctu 3 ks
    Then Uzivatel ma v nakupnim kosiku polozky v hodnote 36 kc