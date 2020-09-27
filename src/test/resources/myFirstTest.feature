Feature: Login

  #comment
  #comment2

  @Regression @SmokeTest @SanityTest
  Scenario: As Admin user
            I want to login to the applicaction using email and pwd
            and select remember option
            So that only the user authenticated enter to the application

    Given I have a admin user
    When I set the login textbox with admin
    And I set the pwd textbox with admin1
    And I click login button
    Then I enter to the application