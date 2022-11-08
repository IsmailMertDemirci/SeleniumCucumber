@All
Feature: Amazon Search
  @gp1
  Scenario: TC01 Kullanici amazonda nutella aratir
    Given Kullanici amazon sayfasina gider
    Then  Kullanici nutella icin arama yapar
    And   Sonuclarin Nutella icerdigini test eder
    And   Sayfayi kapatir

  @gp3
  Scenario: TC02 Kullanici amazonda java aratir
    Given Kullanici amazon sayfasina gider
    Then  Kullanici java icin arama yapar
    And   Sonuclarin java icerdigini test eder
    And   Sayfayi kapatir

  @gp2
  Scenario: TC03 Kullanici amazonda iphone aratir
    Given Kullanici amazon sayfasina gider
    Then  Kullanici iphone icin arama yapar
    And   Sonuclarin iphone icerdigini test eder
    And   Sayfayi kapatir


