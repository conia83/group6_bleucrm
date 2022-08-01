@LUE-1069
Feature: Create a poll

  User Story: US07_As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.

  Acceptance Criterias:
  1. User should be able to add users by selecting multiple contacts from Employees and Department's contact lists.
  2. User should be able to add questions and multiple answers.
  3. User should be able to delete questions and multiple answers.
  4. User should be able to provide multiple choice to attendees by selecting the Allow multiple choice checkbox.
  5. User should be able to create a poll with mandatory fields.


  Mandatory fields: Message title, recipient, 1 question, 2 answers -
  Error message: "The message title is not specified"
  Error message: "Please specify at least one person."
  Error message: "Please specify at least one question."
  Error message: "Please specify at least two answers." //This criter has a bug.

  Background: user on the dashboard and click poll tap
    Given user is on the login page, login, clicks on Poll tab

  @LUE-1060
    Scenario:A.C.1:add users by selecting multiple contacts from Employees and Department's contact lists.
      And user sees the specifying "All employees" by default
      And user clicks "Add more" button
      And user clicks "Employees and departments"
      And user seleckts a person  "hr76@cybertekschool.com" from list
      And user clicks closesign of person list.
      Then user sees the specifying person as "hr76@cybertekschool.com".

  @LUE-1062
      Scenario:A.C2: add questions and multiple answers.
        And user sends question "something"
        And user sends answer "something"
        And user sends second answer "something"
        And user clicks Add question button
        And user sends second question "something"
        And user sends second question's answer "something"

  @LUE-1063
        Scenario: A.C.3:delete questions and multiple answers
          And user sends a question "something"
          And user deletes  the question
          And user sends an answer "something"
          And user deletes the answer
          And user sends a second answer "something"
          And user deletes second answer
          And user clicks Add question button
          And user sends a second question "something"
          And user deletes second question.

  @LUE-1064
        Scenario: A.C.4: provide multiple choice to attendees by selecting the Allow multiple choice checkbox.
        And user clicks first Allow multiple choice box
        And user clicks Add question button
        And user clicks second Allow multiple choice box

  @LUE-1065
      Scenario: A.C.5.1:create a poll without writing the message title (mandatory field 1)
        And user clicks "Add more" button
        And user clicks "Employees and departments"
        And user seleckts a person  "hr76@cybertekschool.com" from list
        And user clicks closesign of person list.
        And user specifies at list one question "Something".
        And user specifies at list two answer "answer1", "answer2".
        And user clicks send button
        Then user sees the "The message title is not specified"

  @LUE-1066
       Scenario: A.C.5.2:create a poll without selecting person (mandatory field 2)
        And user send a message "hello world".
        And user delete all person at To box.
        And user click to question box.
        And user specifies at list one question "Something".
        And user specifies at list two answer "answer1", "answer2".
        And user clicks send button
        Then user sees the person error message "Please specify at least one person."

  @LUE-1067
      Scenario: A.C.5_3:create a poll without writing at least one question (mandatory field 3)
        And user send a message "hello world".
        And user clicks "Add more" button
        And user clicks "Employees and departments"
        And user seleckts a person  "hr76@cybertekschool.com" from list
        And user clicks closesign of person list.
        And user specifies at list two answer "answer1", "answer2".
        And user clicks send button
        Then user sees the error message about question "Please specify at least one question."

  @LUE-1068
      Scenario: A.C.5.4:create a poll without writing at least two answer (mandatory field 4)
        And user send a message "hello world".
        And user clicks "Add more" button
        And user clicks "Employees and departments"
        And user seleckts a person  "hr76@cybertekschool.com" from list
        And user clicks closesign of person list.
        And user specifies at list one question "Something".
        And user clicks send button
        Then user sees the error message about answer "Please specify at least two answers."











