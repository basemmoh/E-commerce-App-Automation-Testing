@smoke
Feature: Login Test Case

  Background: user open the browser
    Given user navigates to the login form

  Scenario: user login to nopCommerce demo page with valid data
    When user login using email "basemabdelghanhy@gmail.com"
    And user login using password "123456"
    And user click on login button
    Then user login successfully

  Scenario: user login to nopCommerce demo page with invalid data
    When user login using email "basem@gmail.com"
    And user login using password "123456"
    And user click on login button
    Then user couldnt login

