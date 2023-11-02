Feature: Login

  Scenario: Test Login with invalid account
    Given Opencart page is opened
    When Login with usename "username" and password "invalidpass"
    Then Error message "No match for Username and/or Password." is displayed