@Background
Feature: US001 Background Kullanimi

  Background: Ortak adimlar
    Given   Kullanici amazon sayfasina gider

  Scenario: TC01 Kullanici amazonda nutella aratir

    Then    Kullanici nutella icin arama yapar
    And     Sonuclarin Nutella icerdigini test eder

  Scenario: TC02 Kullanici amazonda java aratir

    Then    Kullanici java icin arama yapar
    And     Sonuclarin java icerdigini test eder

  Scenario: TC03 Kullanici amazonda iphone aratir

    Then    Kullanici iphone icin arama yapar
    And     Sonuclarin iphone icerdigini test eder
    And     Sayfayi kapatir
