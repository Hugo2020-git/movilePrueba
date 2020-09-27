Feature: Contact
  Scenario: As user
  I want to add a new contact
  using required fields
  So that save my contact

    Given I have open my contact manger app
    #When I click [OK] button in update dialog
    When  I click [AddContact] button in main activity
    And I type 'AAARemove' in [contact name] textbox in contact activity
    And I type '22222222' in [contact number] textbox in contact activity
    And I type 'remove@remove.com' in [contact email] textbox in contact activity
    And  I click [save] button in  contact activity
    Then the cotact 'AAARemove' is displayed