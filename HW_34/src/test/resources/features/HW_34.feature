Feature: Search favorite car
  Scenario: I as a customer WTBAT have an opportunity to find my favorite car.
    Given I access main page auto.ria.com
    When I click advanced search button
    When I click on the used cars button on page
    When I check that search page is opened
    When I mark twenty parameters for choosing a car
    When I click show button
    When I check that page of search result is opened
    Then I click on first car in list
    Then I chek that car page is opened

