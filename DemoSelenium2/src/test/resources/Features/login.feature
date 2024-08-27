@tagD
Feature: Login page automation - OrangeHRM

  @tagD1
  Scenario: login with invalid credential - invalid password
    Given user is on login page
    When user enters valid "<username>" and invalid "<password>"
    And clicks on the login button
    Then user receives Invalid credentials message
    
    Examples: 
     | username | password |
     | username | a123     |  

  @tagD2
  Scenario Outline: login with valid credential
    Given user is on login page
    When user enters valid "<username>" and valid "<password>"
    And clicks on the login button
    Then user is navigated to Home Page

    Examples: 
      | username | password |
      | username | admin123 |
    
