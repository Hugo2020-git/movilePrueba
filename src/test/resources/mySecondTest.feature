Feature: Login

  @Regression
  Scenario Outline: As Admin user
            I want to login to the applicaction using email and pwd
            and select remember option
            So that only the user authenticated enter to the application

    Given I have a admin user
    When I set the login textbox with <user>
    And I set the pwd textbox with <password>
    And I click login button
    Then I enter to the application

    Examples:
    |user   | password  |
    | hugo1 | pwd1      |
    | hugo2 | pwd2      |
    | hugo3 | pwd3      |