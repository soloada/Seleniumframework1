@loginFunction
Feature: User should be able to navigate to url, click login, enter correct user name and password and login
  into the application successfully, also repeat the same step but with invalid credentials

  Scenario Outline: Login functionality

    Given user navigates to the web application as "<url>"
    And user should be in the homepage
    And user clicks on Login or register
    And user should see RETURNING CUSTOMER
    When user enters valid & invalid login information as "<LoginName>" and "<Password>"
    And clicks on Login
    Then user should be on account dashboard
    Examples:
      | url                              | LoginName    | Password     |
      | https://automationteststore.com/ | webdriverio2 | webdriverio2 |





