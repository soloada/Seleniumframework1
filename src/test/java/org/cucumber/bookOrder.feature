@bookOrder
Feature: User should be able to order ALLEGIANT BY VERONICA ROTH from Books Menu

  Scenario Outline: As a usher I should be able to order ALLEGIANT BY VERONICA ROTH from Books Menu

    Given That User navigates to Landing page
    When hoover over Books, clicks Paperback & click on Allegiant by Veronica Roth
    And clicks Add to Cart
    And clicks Checkout
    And enters login credentials as <LoginName> & <Password>
    And click on Confirm order
    #Then user should see order confirmation message as <SuccessMsg>
    Examples:
      | LoginName      | Password       | SuccessMsg                       |
      | "webdriverio2" | "webdriverio2" | "YOUR ORDER HAS BEEN PROCESSED!" |

