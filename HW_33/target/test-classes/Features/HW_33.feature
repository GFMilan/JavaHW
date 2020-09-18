Feature: Select favorite song

  Scenario Outline: : I as a customer WTBAT have an opportunity to find my favorite song.
    Given I access main page "https://music.i.ua/"
    When I click on the login button on page
    And I enter a valid username "<username>"
    And I enter a valid password "<password>"
    When I click on the log in button
    Then I should be successfully logged in "<name>"
    When I click Search field
    And  I enter "<songname>" in the Search field
    And I click search button
    And I click on necessary music artist in the list
    And I chose necessary song in list
    And I click on play button
    Then I should be able to hear a favorite song

    Examples:
    | username | password |         songname         | name   |
    | GFMilan  | acmgfoa1 | The Phantom of the Opera | Андрій |