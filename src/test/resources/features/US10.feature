@webUrl
Feature: US014 Class Work
# Bu sayfayi calıstırırken driver manane den maximize silinmeli
  Scenario: Kullanici ve Url Testi
    Given Kullanici "webUrl" sayfasina gider
    When Kullanici 3 saniye bekler
    Then kullanici Login Portala kadar asagi iner
    When Kullanici 3 saniye bekler
    And kullanici Login Portala tiklar
    When Kullanici 3 saniye bekler
    And kullanici diger windowa gecer
    When Kullanici 3 saniye bekler
    And kullanici "username" kutusuna bilgileri girer
    When Kullanici 3 saniye bekler
    And kullanici "password" bolumune bilgileri girer
    When Kullanici 3 saniye bekler
    And kullanici login butonuna basar
    When Kullanici 3 saniye bekler
    And kullanici Popup'ta cikan yazinin validation failed oldugunu test eder
    When Kullanici 3 saniye bekler
    And kullanici Ok diyerek Popup'i kapatir
    When Kullanici 3 saniye bekler
    And kullanici ilk sayfaya geri doner
    When Kullanici 3 saniye bekler
    And kullanici ilk sayfaya donuldugunu test eder
    When Kullanici 3 saniye bekler
    And Kulllanici sayfayi kapatir