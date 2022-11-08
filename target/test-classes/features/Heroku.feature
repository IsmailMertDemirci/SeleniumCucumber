
Feature: US011 HerOkuApp Delete Butonu Testi
@heroku
  Scenario:TC18 kullanici delete butonuna basabilmeli

    Given Kullanici "herOku" sayfasina gider
    And   Add Element butona basin
    And   Delete butonu gorunur oluncaya kadar bekleyin
    Then  Delete butonunun gorunur oldugunu test edin
    And   Kullanici 1 saniye bekler
    And   Delete butonuna basarak butonu silin
    And   Kullanici 1 saniye bekler
    Then  Delete butonunun gorunmedigini test edin
    And   Kullanici 1 saniye bekler