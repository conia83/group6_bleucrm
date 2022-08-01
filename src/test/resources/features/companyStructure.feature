@wip
Feature: US05_As a user, I should be able to use functions on Company Structure under Employee menu.
  Agile story: US05_As a user, I should be able to use functions on Company Structure under Employee menu.
  @1
  Scenario Outline: User should see Structure
    Given user is on login page
    When user enters "<username>" username
    And user enters "<password>" password
    And user click login button
    Then user should click employee

    Examples:
      | username                      | password |
      | helpdesk1@cybertekschool.com  | UserUser |
      | hr1@cybertekschool.com        | UserUser |
      | marketing1@cybertekschool.com | UserUser |

  @2
  Scenario: HR user should be able to add a department from the company structure
    Given user is on login page
    When user enters "hr1@cybertekschool.com" username
    And user enters "UserUser" password
    And user click login button
    And user should click employee
    Then user clicks add department button

  @3
  Scenario: HR user should be able to select a parent department from the department dropdown
    Given user is on login page
    When user enters "hr1@cybertekschool.com" username
    And user enters "UserUser" password
    And user click login button
    And user should click employee
    And user clicks add department button
    And user type "Oybek" in department box
    And user select from dropdown "21125"
    Then user click add button
  # I have to ask cause there is issue - Problem solved -- Hooray !!!

  @4
  Scenario: HR user should be able to select a supervisor from "recent", "company" and "search"
    Given user is on login page
    When user enters "hr1@cybertekschool.com" username
    And user enters "UserUser" password
    And user click login button
    And user should click employee
    And user clicks add department button
    And user type "Oybek" in department box
    And user click supervisor "helpdesk23@cybertekschool.com" select from structure
    Then user click add button


  @5
  Scenario: HR user should be able to close add department pop-up at any time before sending
    Given user is on login page
    When user enters "hr1@cybertekschool.com" username
    And user enters "UserUser" password
    And user click login button
    And user should click employee
    And user clicks add department button
    Then user close add department pop up

  @6
  Scenario: HR user should be able to edit departments, add child departments
  and delete departments after adding the department
    Given user is on login page
    When user enters "hr1@cybertekschool.com" username
    And user enters "UserUser" password
    And user click login button
    And user should click employee
    And user click + icon button to add child department
    And user type "Oybek" in department box
    And user click add button
    And user click x icon to delete child department

  @7
  Scenario: HR user should be able to drag and drop the existing department
  under another department as a subdepartment
    Given user is on login page
    When user enters "hr1@cybertekschool.com" username
    And user enters "UserUser" password
    And user click login button
    And user should click employee
    And user drag box "21124" and drop box "21125" department







