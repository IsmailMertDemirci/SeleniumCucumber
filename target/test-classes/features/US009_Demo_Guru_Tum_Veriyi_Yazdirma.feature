@alican
Feature: TC Verify Test Case Demo
  Scenario Outline: TC_02_Test_Case_Guru

    Given Tarayiciyi baslatarak "http://demo.guru99.com/test/web-table-element.php" url'sine gidin
    And   Tablodaki "<istenen>" tum degerleri yazdirir
    Examples:
      | istenen |
      | Company |
      | Group |
      | Prev Close (Rs) |
      | Current Price (Rs) |
      | % Change |

    Scenario: Kullanici Sayfayi kapatir
      Given   Kullanici sayfayi kapatir







