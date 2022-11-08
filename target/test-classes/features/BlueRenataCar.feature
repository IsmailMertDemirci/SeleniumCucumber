@testbrc
Feature: Gecersiz giris bilgileri ile siteye girilmemeli

  Scenario Outline: TC11 kullanici gecersiz bilgilerle giris yapar

    Given Kullanici "brcUrl" sayfasina gider
    Then  Login yazisina tiklar
    And   Gecersiz email "<email>" girer
    And   Gecersiz password "<password>" girer
    And   Kullanici 3 saniye bekler
    And   Login butonuna basar
    Then  Sayfaya giris yapilamadigini kontrol eder


    Examples:
      | email              | password |
      | Manager5@gmail.com | manager1 |
      | Manager6@gmail.com | manager4 |
      | Manager7@gmail.com | manager5 |
      | Manager8@gmail.com | manager6 |
      | Manager9@gmail.com | manager7 |

    Scenario: Sayfa Kapatilir
      And   Kulllanici sayfayi kapatir