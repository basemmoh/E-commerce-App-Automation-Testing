@smoke
Feature: Registration Test case

  Background: user open the browser
  And user navigates to the registration form

    Scenario: user register to nopCommerce demo page with valid data
      When user select Gender type
      And user enter first name "basem" and last name "abdelghany"
      And user enter date of birth
      And user enter email "basemabdelghanhy@gmail.com"
      And user enter company name "microsoft"
      And user select newspaper availability
      And user enter password "123456"
      And user enter confirm password "123456"
      And user  click on register button
      Then the account is registered successfully


