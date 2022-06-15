Feature: SauceLab Login

  #1
  @hello
  Scenario: Home page default login
    Given User opens browser
    When Login with username and password
    Then add items to cart
    Then checkout from cart
