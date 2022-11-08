@auto11
Feature: US015 Kullanici giris testi
  Scenario:TC01 Kullanici sitede hesap olusturur

    Given Tarayiciyi baslatarak "http://automationpractice.com/index.php" url'sine gidin
    And   Kullanici 3 saniye bekler
    And   kullanici sign in linkine tiklar
    And   kullanici Create and account bolumune email adresi girer
    And   kullanici Create an Account butonuna basar
    And   kullanici kisisel bilgilerini ve iletisim bilgilerini girer
    And   kullanici Register butonuna basar
    Then  kullanicinin hesap olusturuldugunu dogrulayin
    And   Kulllanici sayfayi kapatir