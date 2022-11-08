
Feature: amazon Practice
  @testpage
  Scenario: Amazon sign in Test

    Given Kullanici amazon sayfasina gider
    When  sign in butonuna tiklar
    And   faker kullanarak e-posta gonderir
    And   gonderdigi e-postanin ekran goruntusunu alir
    And   continue'a tiklar
    Then  There was a problem mesajini dogrular
    And   Need help e tiklar
    And   forgot your password e tiklar
    Then  Password assistance metnini dogrular
    And   Geri gider
    And   Create your account butonuna tiklar
    Then  Create account metnini dogrular
    And   Sayfayi kapatir