@TestGoogle
Feature: This feature is to test web page launch in chrome browser


  Scenario: Google webpage launch in chrome
    #Given The browser is up and google home page is launched
    When I enter text in search field
    And I click Google Search button
    Then The results are published
    #And I close the browser


  Scenario Outline: Google Multiple Searches
    Given The browser is up and google home page is launched
    When I type "<Search>" in Search field
    And I click Google Search button
    Then The results are published
    And I close the browser

    Examples: 
      | Search       |
      | Make my trip |
      | Redbus       |
      | SBI          |
      | FITA         |


  Scenario: Third Scenario Google webpage launch in chrome
    Given The browser is up and google home page is launched
    When I enter text in search field
    And I click Google Search button
    Then The results are published
    #And I close the browser