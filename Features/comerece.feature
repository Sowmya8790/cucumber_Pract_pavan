Feature: Login to the application

  Scenario: Login to ecommerce and go to customer tab
    Given - Launch the Browser
    When - Access the URL "https://admin-demo.nopcommerce.com/login"
    And - Enter the Username "admin@yourstore.com"
    And - Enter the Password "admin"
    Then - Click on the Login Button
    And - Check the title of the Page "Dashboard / nopCommerce administration"
