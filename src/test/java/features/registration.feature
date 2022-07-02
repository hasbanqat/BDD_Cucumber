Feature: User Registration

  Scenario Outline: user registration with different  data

    Given User is on registration page
    When User enters following user details
    |peter|automation1 |1pet@gmail.com|999991|USA1|
    |Tom|automation2 |2pet@gmail.com|999992|USA2|
    |Jack|sutomation3 |3pet@gmail.com|999993|USA3|
    Then User registration should be successful
Examples:


