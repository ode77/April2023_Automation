@TestToRun
Feature: 3101-Register an account
  As a User
  I want to be able to create an account So that I can purchase items on the lambdatest website
  Background:
    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
    When I click on MyAccount Menu
    And I click on Continue under the New Customer
  Scenario: Register Page is dispayed when Register link in clicked
##   Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
##   When I click on MyAccount Menu
##   And I click on Continue under the New Customer
    Then the Register Account page should be displayed
##
##  @TestToRun
  Scenario: Register new user happy path
##    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
##    When I click on MyAccount Menu
##    And I click on Continue under the New Customer
    And I enter valid details for First Name as "Sheyi", Last Name as "Solomon", E-mail as "sheyi@gmail.com", Telephone as "0788383838", Password and ConfirmPword as "yahoo"
    And I accept the privacy policy
    And I click on Continue button on the Register and Account page
    Then Register Confirmation page is displayed
    And I "Logout" of my account
#  @TestToRun
  Scenario: Password and Confirm Password validation
##    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
##    When I click on MyAccount Menu
##    And I click on Continue under the New Customer
    When I enter valid input for all other mandatory fields and accept Privacy Policy
    And I enter same invalid password for Password and Confirm Password
    And I click on Continue button on the Register and Account page
    Then I should get error message as per design three
##  @TestToRun
  Scenario: Password and Confirm Password must match validation
##    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
##    When I click on MyAccount Menu
##    And I click on Continue under the New Customer
    When I enter valid input for all other mandatory fields and accept Privacy Policy
    And I enter valid password for Password
    And I enter non matching Confirm Password
    And I click on Continue button on the Register and Account page
    Then I should get error message as per design five
##
##  @TestToRun
  Scenario: Validate Last Name
##    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
##    When I click on MyAccount Menu
##    And I click on Continue under the New Customer
    And I enter invalid details for Last Name with valid input for all other mandatory fields
    And I click on Continue button on the Register and Account page
    Then I should get error message as per design seven

#  @TestToRun
  Scenario: Validate Telephone
#    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
#    When I click on MyAccount Menu
#    And I click on Continue under the New Customer
    When I enter invalid details for Telephone number with valid input for all other mandatory fields
    And I click on Continue button on the Register and Account page
    Then I should get error message as per design eight

#  @TestToRun
  Scenario: Privacy Policy validation
#    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
#    When I click on MyAccount Menu
#    And I click on Continue under the New Customer
    When I enter valid input for all other mandatory fields
    And I leave the Privacy Policy box unticked
    And I click on Continue button on the Register and Account page
    Then I should get error message as per design nine

#  @TestToRun
  Scenario: Validate Email input
#    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
#    When I click on MyAccount Menu
#    And I click on Continue under the New Customer
    When I enter invalid details for Email address with valid input for all other mandatory fields
    And I click on Continue button on the Register and Account page
    And I should get error message as per design six

  @TestToRun
  Scenario: Checkout
      Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
      When I click on MyAccount Menu
    And I enter username as  "sheyi@gmail.com" and password "yahoo"
    And I click on Login button
    And I click on "Shop by Category" menu
    And I click on "Software" from the left hand menu
    And I choose "Palm Treo Pro"
    And I click on Buy Now
#    And And I populate all the the mandatory field
    And I accept terms and condition
    And I click on continue
    And I click on Confirm order button
    Then "Your order has been placed!" is displayed
    And I click on MyAccount Menu
    And I "Logout" of my account

  @TestToRun
  Scenario: MOUSE ACTION HOOVER [HOOVER ACTIONS]
    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
    And I hover on my account and I click on register link

  @TestToRun
  Scenario: MOUSE ACTION SENDKEYS [KEYBORD ACTIONS]
    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
    When I search for "HTC"
    Then "Search - Htc" page is displayed.

  @TestToRun
  Scenario:
      Given user is on Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
      When user hover over MyAccount Menu and click on Register link
      Then Register page is displayed
      And user enters valid details for First Name as "Aina", Last Name as "Ajayil", E-mail as "ainayil@gmail.com", Telephone as "07877323838", Password and ConfirmPassword as "yahoo"
      And user accept the Privacy Policy
      And user  click on the Continue button on the Registration and Account page
      Then Register Confirmation page is displayed

  @TestToRun
  Scenario: MOUSE ACTION SENDKEYS [KEYBORD ACTIONS]
    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
    When I search for "HTC"
    Then "Search - Htc" page is displayed.
    And I click on "HTC Touch HD"
    And I click on Add to cart
