Feature: login

  Scenario: Sucessful login with valid scenarios
    Given - Launch the browser
    When - User launch the URL -"https://admin-demo.nopcommerce.com/login"
    And - user should give email as "admin@yourstore.com" and password as "admin"
    And - user should click on login
    Then - Page Title should be "Dashboard / nopCommerce administration"
    When - User click on logout link
    Then Page title should be "Your store. Login"
    And - I close the the browser
@regression
  Scenario Outline: test driven login
    Given - Launch the browser
    When - User launch the URL -"https://admin-demo.nopcommerce.com/login"
    And - user should give email as "<user>" and password as "<password>"
    And - user should click on login
    Then - Page Title should be "Dashboard / nopCommerce administration"
    When - User click on logout link
    Then Page title should be "Your store. Login"
    And - I close the the browser

    Examples: 
      | user                 | password |
      | admin@yourstore.com  | admin    |
      | in6789@yourstore.com | mi       |
