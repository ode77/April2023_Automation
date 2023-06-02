@LamdaPOM
Feature: LAMBDATEST USING PAGE OBJECT MODULE [POM]
  Background:
    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"

  Scenario Outline: Register new user happy path
#    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
    When I click on MyAccount Menu
    And I click on Continue under the New Customer
    And I enter valid details for "<FirstName>", "<LastName>", "<E-mail>", "<Telephone>", "<Password and ConfirmPword>"
    And I accept the privacy policy
    And I click on Continue button on the Register and Account page
    Then Register Confirmation page is displayed
    And I "Logout" of my account
    Examples:
      | FirstName | LastName | E-mail | Telephone | Password and ConfirmPword |
      | sheyi | odele | odex4@gmail.com | 0899786754 | Yahoo |
      | Rhemi | Solomon | rsolomon7@gmail.com| 0877908745 | Darr77  |

#  @LamdaPOM
   Scenario Outline: Purchased Item as a Register User with Hover Login.
#      Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
      When I search for "Samsung" on search field
      And I click on Search Button
      Then "Search - Samsung" page is displayed.
      And I click on "Samsung SyncMaster"
      And I click on Add to cart
      And I click on Cart Menu
      And Click on Checkout
      And I Hover over MyAccount menu and I click on Login link
      And I enter Valid "<E-mail>" and "<Password>"
      And I click on Login Button
      And I click on Logout link
      Then Account Logout Page is Displayed
      And I click on Continue
      Then Home page is Displayed
     Examples:
       | E-mail | Password |
       | odex4@gmail.com | Yahoo7 |

#  @LamdaPOM
    Scenario:
      Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
      When I click on MyAccount Menu
      And I click on Continue under the New Customer
      And I enter valid details as
        | sheyi           |
        | odele           |
        | odex4@gmail.com |
        | 0899786754      |
        | Yahoo7          |
      And I accept the privacy policy
      And I click on Continue button on the Register and Account page
      Then Register Confirmation page is displayed

  @LamdaPOM
  Scenario: RE
    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
    When I click on MyAccount Menu
    And I click on Continue under the New Customer
    And I enter valid details for Register account
      | FIELD        | VALUE           |
      | FirstName    | Sheyi           |
      | LastName     | Odeleye         |
      | E-mail       | odex4@gmail.com |
      | Telephone    | 0899786754      |
      | Password     | Yahoo7          |
      | ConfirmPword | Yahoo7          |
    And I accept the privacy policy
    And I click on Continue button on the Register and Account page
    Then Register Confirmation page is displayed