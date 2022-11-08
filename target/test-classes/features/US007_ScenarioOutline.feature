@Hepsi
Feature: US007 Scenario Outline Kullanimi
  Scenario Outline: TC01 ConfigReader ile Scenario Outline Kullanimi
    Given Kullanici "<istenenUrl>" sayfasina gider
    Then  Kullanici 2 saniye bekler
    When  url'nin "<arananKelime>" icerdigini test edelim
    And   Sayfayi kapatir
    Examples:
      | istenenUrl | arananKelime |
      | amazon     | amazon       |
      | facebook   | facebook     |
      | autoE      | automation   |
      | hepsiburada| hepsiburada  |


