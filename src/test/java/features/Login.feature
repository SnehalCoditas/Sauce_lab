Feature: SauceLab Login

  #1
  @HBOCTag1
  Scenario: Home page default login
    Given User opens browser
    When Login with username and password
    Then add items to cart
    Then checkout from cart

  @HBOCTag2
  Scenario: Home page Second user login
    Given Second User opens browser
    When Login with username and password
    Then add items to cart
    Then checkout from cart

  @HBOCTag3
  Scenario: Home page Second user login
    Given User opens browser
    When Login with username and password
    Then add items to cart
    Then checkout from cart

  @HBOCTag4
  Scenario: Home page Second user login
    Given User opens browser
    When Login with username and password
    Then add items to cart
    Then checkout from cart

  @HBOCTag5
  Scenario: Home page Second user login
    Given User opens browser
    When Login with username and password
    Then add items to cart
    Then checkout from cart