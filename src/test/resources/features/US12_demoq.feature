@demoqa
Feature: US016 Class Work4
  Scenario: TC01 alerts and explicitly wait
    Given Tarayiciyi baslatarak "https://demoqa.com/browser-windows/" url'sine gidin
    And   Kullanici 5 saniye bekler
    When  kullanici Alerts buttonuna tiklar
    And   Kullanici 5 saniye bekler
    And   kullanici On button click, alert will appear after bes seconds karsisindaki click me  butonuna basar
    And   Kullanici 5 saniye bekler
    And   kullanici Allertin gorunur olmasini bekler
    And   kullanici Allert uzerindeki yazinin This alert appeared after bes seconds oldugunu test eder
    And   kullanici ok diyerek alerti kapatir
