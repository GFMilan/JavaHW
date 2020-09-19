Feature: Select favorite song
  Scenario Outline: I as a customer WTBAT have an opportunity to find my favorite song.
    Given I access main page music.i.ua
    When I click on the login button on page
    And I enter a valid username "<username>"
    And I enter a valid password "<password>"
    When I click on the log in button
    Then I should be successfully logged in
    When  I enter "<songname>" in the Search field
    And I click search button
    Then I click on play button in necessary song row


    Examples:
      | username | password | songname   |
      | GFMilan  | acmgfoa1 | Little Man |