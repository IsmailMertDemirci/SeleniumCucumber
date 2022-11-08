@medunna
  Feature: medunna login negative test
    Scenario Outline:Negative login test
    Given Kullanici "https://medunna.com/" adresine gider
    When login olmak icin sign in butonuna tiklar
    And username icin "<username>" kullanici adini gonderir
    And password icin "<password>" parolasini gonderir
    And signine tiklar
    Then Authentication information not correct uyarisini dogrular
      Examples:
        |username  | password |
        |username  | password |