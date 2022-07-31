@LUE-1036
Feature: Send message

  User Story:
  US01_As a user, I should be able to send messages by clicking on Message tab under Active Stream

  1. User should be able to send a message by filling in the mandatory fields.
  2. The message delivery should be to 'All employees' by default and should be changeable.
  3. User should be able to cancel sending messages at any time before sending.
  4. User should be able to delete messages after sending.

  Mandatory fields:
  'Message Title'(content) & 'Recipient'.

  Error messages for mandatory fields:
  "The message title is not specified."
  "Please specify at least one person."
  Recipients should be selectable from "Recent", "My Groups"
  (enable to see this type of Recipients you need to join at least one of the groups beforehand) and "Employees and departments."
  Recipients can be added more than one and are deletable.



  Background: user on the dashboard and click Message tap
    Given user is on the login page, login, clicks on Message tab

  @LUE-1038
  Scenario: 01-01-01: send a message with the mandatory fields
   # And user writes a message title "test" on the Topic field
    And user writes a message "text" on the message text field
    And user clicks the SEND button
    Then user should see the created Message on the dashboard




  @LUE-1039  @smoke
  Scenario: 01-01-02: send a message without the message title and the message text
    And user clicks the SEND button
    Then user should see the error message "The message title is not specified"




  @LUE-1042
  Scenario: 01-01-05: send a message without the Recipients
   # And user writes a message title "test" on the Topic field
    And user writes a message "test" on the message text field
    And user deletes the Recipients
    And user clicks the SEND button
    Then user should see the error message "Please specify at least one person."


  @LUE-1043
  Scenario: 01-02: The message delivery should be to 'All employees' by default and should be changeable.
    # And user writes a message title "test" on the Topic field
    And user writes a message "test" on the message text field
    And user clicks the SEND button
    And user sees the message created to "To all employees" by default
    And user clicks More button in the created message
    And user clicks Edit button
    And user clicks Add more button
    And user clicks a person "email"
    And user clicks the Employees and departments tab
    And user clicks a person "email" from the people list
    And user clicks the E-mail users tap
    And user texts a email "email"
    And user clicks the person "email" from the people list
    And user clicks the SEND button
    Then user should see the recipients has changed









  @LUE-1044
  Scenario: 01-03: cancel sending messages at any time before sending
   # And user writes a message title "test" on the Topic field
    And user writes a message "test" on the message text field
    And user clicks the CANCEL button
    Then MESSAGE field should be hided




  @LUE-1045
  Scenario: 01-04: User should be able to delete messages after sending.
   # And user writes a message title "test" on the Topic field
    And user writes a message "test" on the message text field
    And user clicks the SEND button
    And user clicks More button in the created message
    And user clicks Delete button
    And the alert displayed
    And user clicks OK
    Then user should see the message "The post has been deleted."

