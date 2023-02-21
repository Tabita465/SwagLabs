Feature: Login Functionality
@run1
  Scenario: User should be able to successfully login with the'standard_user' user account and ensure that the  'Sauce Labs
  Fleece Jacket' product is displayed..

    Given user is on the home page
    When user enters username
    And  user enters password
    Then user should be able to see the' 'Sauce Labs Fleece Jacket' product is displayed
@run2
    Scenario:User attempt to log in with the ‘standard_user’ using an incorrect password. Ensure that an error
    is displayed starting that the login credentials are incorrect.

      Given user is on the home page
      When user enters correct username
      And user enters incorrect password
      Then user should be able to see that an error with incorrect login credentials is displayed
@run3
      Scenario:User attempt to log in with the ‘locked_out_user’ user and ensure that an error message is
      displayed starting that this user has been locked out of the platform.

        Given user is on the home page
        When user enters username
        And user enters password
        Then user should be able to see an error message is displayed starting that this user has been locked out of the platform
@run4
        Scenario:User log in with the ‘standard-user’ user, assert that the ‘Sauce Labs Backpack’ is $29.99, add it to
        the cart and ensure that it has been successfully added to the cart on the “Your cart”
        overview page

          Given  user is on the home page
          When user enters username
          And user enters password
          And assert that the Sauce Labs Backpack is $29.99
          Then user should be able to see that product has been succesfully added to the cart

