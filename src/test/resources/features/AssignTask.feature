Feature: Task assignment function
  As a user, I should be able to assign tasks under Quick Navigate Menu.


Scenario: Assigning tasks
  Given User is on the blueCrm home page
  When user types a task name on the Things to do section
  And user clicks on Add more button of Responsible person section
  And user selects a person from the list
  And user clicks on close button on  the list
  And user clicks the High priority check box
  And user clicks on send button
  Then user should see Task has been created message

