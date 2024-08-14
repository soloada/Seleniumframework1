@verifyHeader
Feature: As a User, I should be able to Access LandingPage, verify that the logo is displayed & enabled, Click on Login or register,
         click on Cart, click on Filter SearchKey Word and enter text.

  Scenario: User should be able to go to landing page verify logo is displayed/Enable click login or register, cart, filter
                    and Search key then enter text

    Given That User navigates to Landing page
    When When user verify that the logo is displayed & enabled
    And Click on Login or register
    And Click on Cart
    Then User should be able to click on Filter SearchKey and enter text as <shoes>




