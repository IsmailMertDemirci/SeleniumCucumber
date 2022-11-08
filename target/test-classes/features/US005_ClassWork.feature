Feature: US1009 Ck Hotels Login
  Scenario: TC11 kullanici gecerli bilgilerle giris yapar
    Given Kullanici "brcUrl" sayfasina gider
    Then  Login yazisina tiklar
    And   Gecersiz username girer
    And   Gecersiz password girer
    And   Login butonuna basar
    Then  Sayfaya giris yapilamadigini kontrol eder
    And   Kulllanici sayfayi kapatir