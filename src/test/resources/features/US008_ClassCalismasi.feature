
Feature:Class Calismasi
  @ibrahim
  Scenario Outline:
    Given Tarayiciyi baslatarak "https://editor.datatables.net/" url'sine gidin
    Then  New butonuna basar
    And   Kullanici first name "<First name>" girer
    And   Kullanici 1 saniye bekler
    And   Kullanici last name "<Last name>" girer
    And   Kullanici 1 saniye bekler
    And   Kullanici position "<Position>" girer
    And   Kullanici 1 saniye bekler
    And   Kullanici office "<Office>" girer
    And   Kullanici 1 saniye bekler
    And   Kullanici extension "<Extension>" girer
    And   Kullanici 1 saniye bekler
    And   Kullanici start date "<Start date>"  girer
    And   Kullanici 1 saniye bekler
    And   Kullanici salary "<Salary>" girer
    And   Kullanici 1 saniye bekler
    And   Create tusuna basar
    And   Kullanici 1 saniye bekler
    When  Kullanici "<First name>" isim ile arama yapar
    And   Kullanici 1 saniye bekler
    Then  isim bolumunde "<First name>" oldugunu dogrular
    Examples:
      | First name | Last name | Position | Office   | Extension | Start date | Salary |
      | ALi        | Veli      | Qa       | Google   | Senior    | 2022-10-11  | 15000  |

