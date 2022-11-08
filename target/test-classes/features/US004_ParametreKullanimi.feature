Feature: US004 Parametre Kullanimi
  Scenario: TC01 Parametre Kullanimi
    Given Kullanici "amazon" sayfasina gider
    Then  Kullanici 2 saniye bekler
    When  url'nin "amazon" icerdigini test edelim
    And   Sayfayi kapatir
