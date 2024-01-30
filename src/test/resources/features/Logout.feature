Feature: Logout

  Scenario: Log out logged in user
    Given I am logged in
    When I click on menu button
    And I click on menu log out
    And I click on log out button
    And I close the popup by clicking on the OK button
    Then I should be logged out and on login page

  Scenario: User remains logged in after canceling logout
    Given I am logged in
    When I click on menu button
    And I click on menu log out
    And I click on cancel log out
    And I click on menu log in
    Then I should be logged in and not see login page
