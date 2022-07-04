Feature: SauceLab Login

  #1
  @Test1
  Scenario: Home page default login
    Given User opens browser
    When Login with username and password
    Then add items to cart
    Then checkout from cart
