@submenu
Feature: User should be able hoover over each dropdown menus and click one product from each menu.

  Background:

  Scenario: Clicking one product out of each dropdown list.

    Given That User navigates to Landing page
    When User hoover over  dropdowns and click one product in each dropdowns as follow £ POUND STERLING-£ Pound Sterling
    And  ITEMS-View Cart
    And HOME-Checkout
    And APPAREL & ACCESSORIES-tShirt
    And makeup-face
    And SKINCARE-gift_ideas_sets
    And Fragrance-women
    And Men-preShave_shave
    And Haircare_Shampoo
    And Book-Paperback
    Then user should be able to hover each dropdown and click on at-least one product






