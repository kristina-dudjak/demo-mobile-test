Feature: Logout

  Scenario: Log out logged in user
    Given I am logged in
    When I tap on menu button
    And I tap on menu log out
    And I tap on log out button
    And I close the popup by tapping on the OK button
    Then I should be logged out and on login page

  Scenario: User remains logged in after canceling logout
    Given I am logged in
    When I tap on menu button
    And I tap on menu log out
    And I tap on cancel log out
    And I tap on menu log in
    Then I should be logged in and not see login page
