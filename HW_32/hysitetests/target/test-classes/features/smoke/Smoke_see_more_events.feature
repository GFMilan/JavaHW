Feature: More event on the main page

  Scenario: I as a customer WTBAT see more events than presented on the main page
    Given I access main page Hys Site
    And I Scroll down to see ‘Let’s network’ block
    When I click on ‘See more events’ button
    Then page "https://www.hys-enterprise.com/events/" is opened