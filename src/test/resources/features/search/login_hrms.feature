Feature: Search by keyword

  Scenario: Test Login
    Given HRMS is opened
    When login with usename "username" and password "invalidpass"
    Then Error message "No match for Username and/or Password." is displayed