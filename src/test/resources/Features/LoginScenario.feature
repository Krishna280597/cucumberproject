Feature: To validate the login functionality of Facebook application

  Background: 
    Given The user should be in Facebook page
@sanity
  Scenario Outline: To validate loginPage with Invalid name and Invalid password
    When The user Enter the username and password "<username>""<password>"
    Then The user gets the Invalid message

    Examples: 
      | username | password |
      | priya    |    12345 |
@smoke
  Scenario: To validate the signup page
    When The user Click the SignUp button
    And The user Enter the firstname and lastname "krishna" "priya"
    Then The user verified the signup page
