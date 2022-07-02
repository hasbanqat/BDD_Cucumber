Feature: Application Login

Background:
  Given Validate the browser
  When Browser is triggered
  Then Check browser is displayed


  Scenario: Home Page Default Login

    Given User is on login page
    When  User login into application with "Bnn" and "1234"
    Then  Home page is populated
    And   Cards are displayed successfully
@RegTest
  Scenario: Home Page Default Login

    Given User is on login page
    When  User login into application with "Bnn" and "1234"
    Then  Home page is populated
    And   Cards are displayed successfully
@SmokeTest @RegTest
  Scenario: Home Page Default Login

    Given User is on login page
    When  User sign up with following details
    | Ban | Abcd | test@gmail.com | USA | 9294876653 |
    Then  Home page is populated
    And   Cards are displayed successfully
@SanityTest
  Scenario Outline: Home Page Default Login

    Given User is on login page
    When  User login into web with different <UserName> and <Password>
    Then  Home page is populated
    And   Cards are displayed successfully

    Examples:
    | UserName | Password |
    | User 1   | Pass 1   |
    | User 2   | Pass 2   |
    | User 3   | Pass 3   |
    | User 4   | Pass 4   |

  @MobileTest
  Scenario: Home Page Default Login

    Given User is on login page
    When  User sign up with following details
    | Ban | Abcd | test@gmail.com | USA | 9294876653 |
    Then  Home page is populated
    And   Cards are displayed successfully