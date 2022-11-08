Feature:  Parametre Kullanimi
@gp1
  Scenario: TC01 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "amazon" sayfasina gider
    Then  Kullanici 2 saniye bekler
    When  url'nin "amazon" icerdigini test edelim
    And   Sayfayi kapatir
@gp1
  Scenario: TC02 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "brcUrl" sayfasina gider
    Then  Kullanici 2 saniye bekler
    When  url'nin "car" icerdigini test edelim
    And   Sayfayi kapatir
@gp1
  Scenario: TC01 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "facebook" sayfasina gider
    Then  Kullanici 2 saniye bekler
    When  url'nin "facebook" icerdigini test edelim
    And   Sayfayi kapatir
@gp1
  Scenario: TC02 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "google" sayfasina gider
    Then  Kullanici 2 saniye bekler
    When  url'nin "google" icerdigini test edelim
    And   Sayfayi kapatir

