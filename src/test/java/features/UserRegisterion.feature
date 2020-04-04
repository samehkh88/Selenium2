Feature: User Registration
  I want to check the the user can register in our E-commerce website

  Scenario Outline: User Register successfully
    Given the user in home page
    When the user click on register link
    And the user fill the "<Fname>" , "<Lname>" , "<day>" ,"<month>" ,"<year>" , "<email>" , "<password>"
    Then the register success message displayed successfully
    Examples:
      | Fname | Lname  | day |month | year | email             | password |
      | Sameh | beshara| 6   | 9    |  30  | 12es3har87a@yaj.com  | 12345678 |
      | glal  | ahmed  | 6   | 5    |  34  | 22hus3sen5411@yaj.com| 12345678 |




