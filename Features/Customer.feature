Feature: Customer

  Background: Common steps in every scenario
		Given - Launch the browser
    When - User launch the URL -"https://admin-demo.nopcommerce.com/login"
    And - user should give email as "admin@yourstore.com" and password as "admin"
    And - user should click on login
    Then User can view Dashboard
	
@sanity

  Scenario: Add new Customer
    When User click on customers men
    And click on customers meny iteam
    And click on Add new button
    Then User can view add new customer page
    When user enter customer info
    And click on save button
    Then user can view confirmation message "The new customer has been added successfully."
    And - I close the the browser
@regression
  Scenario: Search Custoer by EmailID
    When User click on customers men
    And click on customers meny iteam
    And Enter customer Email
    When click on search button
    Then User should found email in search table
    And - I close the the browser
@sanity
  Scenario: Search Customer by Name
    When User click on customers men
    And click on customers meny iteam
    And Enter customer First name
    And Enter customer Last name
    When click on search button
    Then User should found Name in the Search Table
    And - I close the the browser
