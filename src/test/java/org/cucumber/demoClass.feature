@LoginValidate
Feature:as a user I should be able to login to my account with correct data;

  Scenario Outline: Login Validation

    Given that user navigate to url "<url>"
    And enter Correct User name or Email address "<Email>" and Password "<Password>"
    When user click login
    Then user should be on homepage


    Examples:
      | url                                    | Email                 | Password      |
      | https://wisterias.digimonk.xyz/sign-in | soloadasong@gmail.com | UniBoy101232! |
      | https://wisterias.digimonk.xyz/sign-in | wrong@gmail.com       | UniBoy101232! |
      | https://wisterias.digimonk.xyz/sign-in | soloadasong@gmail.com | wrongPass     |
