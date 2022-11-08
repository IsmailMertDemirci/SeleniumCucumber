@Trendyol
Feature: Trendyol Search

  Scenario: M01 Kullanici Trendyolda makas aratir
  Given Google'a gidiniz
  Then  trendyol'u aratiniz
  And   trendyol linkini bulup siteye gidiniz
  And   shoes aratiniz
  And   toplam urun sayisini aliniz
  And   yeni sekmede morhipo'ya gidiniz
  And   mh shoes aratiniz
  And   mh toplam urun sayisini aliniz
  And   iki sitedeki topla makas sayisini karsilastiriniz
  And   Once urun sayisi fazla olan siteyi kapatiniz
  And   Sonra diger sayfayida kapatiniz