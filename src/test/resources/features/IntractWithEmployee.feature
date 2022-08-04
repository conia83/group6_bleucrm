@wip
Feature: US08_As a user, I should be able to interact with employees on the posts.
User Story: US08_As a user, I should be able to interact with employees on the posts.

  @1
Scenario: User should be able to make a comment, like, or unfollow other employees' posts.
    Given User is on login page
    When User enters valid username "hr1@cybertekschool.com"
    And User enters valid password "UserUser"
    And User clicks log in button
    And User clicks on comment, type "Test" and clicks send button
    And User clicks on Like text
    Then User clicks Unfollow text

@2
Scenario: User should be able to like, or make comments on all other reviewers' comments
    Given User is on login page
    When User enters valid username "hr1@cybertekschool.com"
    And User enters valid password "UserUser"
    And User clicks log in button
    And User clicks others reply like button
    Then User clicks reply then type "Test" and send button

    @3
    Scenario: User should be able to like and replay his/her own comment
        Given User is on login page
        When User enters valid username "hr1@cybertekschool.com"
        And User enters valid password "UserUser"
        And User clicks log in button
        And User clicks others reply like button
        Then User clicks reply then type "Test" and send button

@4
Scenario: After making a comment user should be able to "view comment",
"copy link", "edit", "delete" and "create task" by clicking more
    Given User is on login page
    When User enters valid username "hr1@cybertekschool.com"
    And User enters valid password "UserUser"
    And User clicks log in button
    And User clicks on comment, type "Test" and clicks send button
    And User clicks reply then type "Test" and send button
    And User clicks more button under comment message
    And User clicks view comment
    And User clicks copy link
    And User clicks edit and cancel
    And User clicks create task
    And User clicks delete then ok pop up windows
    Then User should see comment deleted message


    @5
    Scenario: User should be able to see the reviewers'
    names and visit their profiles by clicking on reviewers' name
        Given User is on login page
        When User enters valid username "hr1@cybertekschool.com"
        And User enters valid password "UserUser"
        And User clicks log in button
        And User clicks reviewer's name
        Then User should see the reviewer's profile

    @6
    Scenario: User should be able to add others' posts to favourites by clicking on the Star icon
        Given User is on login page
        When User enters valid username "hr1@cybertekschool.com"
        And User enters valid password "UserUser"
        And User clicks log in button
        Then User clicks add to favorites icon













