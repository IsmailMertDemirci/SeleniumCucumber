Feature: US013 Class Work

  Scenario: explicitly wait

    Given Tarayiciyi baslatarak "https://demoqa.com/dynamic-properties" url'sine gidin
    Then  kullanici Will enable bes seconds butonunun enable olmasini bekleyin
    And   kullanici Will enable bes seconds butonunun enable oldugunu test edin