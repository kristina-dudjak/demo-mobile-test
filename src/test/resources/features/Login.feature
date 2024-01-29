Feature: Login

  Scenario: Successful login via clicking username
    Given I am on a login page
    When I click on a valid username button
    And I click on a submit button
    Then I should see no login error message

  Scenario: Clicking locked out user displays error message
    Given I am on a login page
    When I click on a locked out username button
    And I click on a submit button
    Then I should see locked out user error message


  Scenario Outline: Successful login via entering user data
    Given I am on a login page
    When I enter the username "<username>"
    And I enter the password "<password>"
    And I click on a submit button
    Then I should see no login error message
    Examples:
      | username         | password |
      | bob@example.com  | 10203040 |


  Scenario: Display error for empty username field
    Given I am on a login page
    When I click on a submit button
    Then I should see an empty username error message

  Scenario Outline: Display error for empty password field
    Given I am on a login page
    When I enter the username "<username>"
    And I click on a submit button
    Then I should see an empty password error message
    Examples:
      | username
      | bob@example.com

  Scenario Outline: Display error for non existing user
    Given I am on a login page
    When I enter the username "<username>"
    And I enter the password "<password>"
    And I click on a submit button
    Then I should see a nonexistent user error message
    Examples:
      | username  | password |
      | john@example.com  | 123 |
