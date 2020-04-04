Feature: User Login
  I want that User can login successfully

  Scenario Outline: User Login successfully
    Given the user in home page
    When the user click on login link
    And the user enter "<Email>" , "<Password>"
    Then The User will be login and can now click logout
    Examples:
      | Email              | Password
      | 12eshar87a@yaj.com | 12345678