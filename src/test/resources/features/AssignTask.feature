
Feature: Task assignment function
  As a user, I should be able to assign tasks under Quick Navigate Menu.

  Background:
  Given User is on the Tasks section in the azulcrm home page

Scenario: Assigning tasks
  When user types a task name on the Things to do section
  And user clicks on Add more button of Responsible person section
  And user selects a person from the list
  And user clicks on close button on  the list
  And user clicks the High priority check box
  And user clicks on send button
  Then user should see Task has been created message

  Scenario: HR User should be able to assign a task to more than one user
    When user types a task name on the Things to do section
    And user clicks on Add more button
    And user selects a person from the list
    And user clicks on the Employees and departments tab
    And user select another user
    And user clicks on send button
    Then user should see all the responsible person
  @smoke
    Scenario: When task(s) is(are) created, they can be seen on the count on the homepage under "MY TASKS" table
      When user types a task name on the Things to do section
      And user click on send button
      Then user should see that the number in the count on the home page under the MY TASKS table.


