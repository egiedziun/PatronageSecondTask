Feature:Widgets tabs


  Scenario: Open Tabs and verify text in the tab
    Given DemoQA site is open
    When user select Widgets category
    And select Tabs tab
    And Select "Origin" tab
    Then Text in "Origin" is valid