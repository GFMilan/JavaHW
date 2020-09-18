Feature: Ask for a reference

  Scenario: I as a customer WTBAT have an opportunity to ask for a reference.
    Given I access main page Hys Site
    And I Scroll down to see Ask for reference button
    When I click on ‘Ask for reference’ button
    Then  reference form is opened
    And I fill in all the required fields  and check-boxes in  a reference form with valid data
    When I click ‘Submit’ button
    Then ‘Thanks for your request’ pop-up is displayed, request is sent
