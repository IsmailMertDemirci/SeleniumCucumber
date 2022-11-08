Feature: US007 kullanici amazonda istedigi kelimeleri aratir.

  Scenario Outline: TC13 amazonda listedeki elementleri aratma
    Given Kullanici amazon sayfasina gider
    Then  Kullanici "<istenenKelime>" icin arama yapar;
    When  Sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And   Sayfayi kapatir

    Examples:
      | istenenKelime |istenenKelimeKontrol|
      | nutella       | nutella            |
      | java          | java               |
      | elma          | elma               |
      | armut         | armut              |

 #TestNG deki dataProvider kullanimindaki gibi Cucumberda da    Scenario Outline kullaniriz
 #Bu sekilde birden fazla kelimeyi tek seferde aratabiliriz
 #Feature dosyasinda yazdigimiz komutta eger "" (Tirnak) kullanirsak stepDefinition da parametreli
 #bir method olusturur.Ve artik stepDefiniton'i kullanmadan Feature dosyasinda ""(Tirnak)
 #icindeki string'idegistirerek istedigim kelimeyi aratabilirim .
 #Scenario Outline da ise yine ""(Tirnak) icinde birden fazla kelime aratacaksam  "<>" seklindeki kullanim
 # ile "<>" icine yazdigim  herhangi bir kelimeyi  Scenario Outline'in asagida olusturdugu Examples
 #altinda aratmak istedigim kelimeleri yazar ve sirasiyla aratabiliriz