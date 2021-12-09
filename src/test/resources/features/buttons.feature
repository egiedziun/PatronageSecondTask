Feature: Buttons behaviour tests


  Scenario: Open DemoQA site and do something
    Given DemoQA site is open
    When user select Element category
    And select Buttons tab
    And double click on "Double Click Me"
    Then "You have done a double click" message should be visible in Buttons tab