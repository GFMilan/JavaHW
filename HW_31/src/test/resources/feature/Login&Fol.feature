Feature: Logged in user should be able to search  for necessary music artist and then  add him to Follows.

  Scenario Outline: : Login into account with correct credentials
    Given User navigates to Mixcloud website
    When User clicks on the login button on page
    And User enters a valid username "<username>"
    And User enters a valid password "<password>"
    When User clicks on the log in button
    Then User should be successfully logged in "<username>"
    When User clicks Search field
    When User enters artistname in the Search field "<artistname>"
    And User clicks on necessary music artist in the list
    When User clicks on Follow button
    And User clicks on profile button
    Then User should see the necessary music artist in his follow list "<artistname>"
    When User clicks on artistname in his folowing list "<artistname>"
    Then User clicks on Following button

    Examples:
      |  username |  password   |    artistname  |
      |	  GFMilan |  12345ACM   |  DJ RUSSKE |





