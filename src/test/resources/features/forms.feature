Feature:Forms tabs


  Scenario: Open Forms and verify mobile field in the Practice Forms
    Given DemoQA site is open
    When user select Forms category
    And select Practice Form tab
    And  fill out mobile field with 11 digits
    Then field accepts 10 digits