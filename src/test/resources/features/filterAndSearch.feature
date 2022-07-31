Feature: "Filter and search" functionality
  US09_As a user, I should be able to use "Filter and search" functionality on Active Stream

  Background: user is on the homepage
    Given as a user I am on the BleuCRM homepage

@LUE-1050 @smoke
  Scenario: US09-1 As a user I should be able to see default filters as "my activity, work, favorite, announcements, and workflows"
    When I click filter and search input box
    Then I should see following as default filters

      | ANNOUNCEMENTS |
      | WORK          |
      | FAVORITES     |
      | MY ACTIVITY   |
      | WORKFLOWS     |
  @LUE-1052
  Scenario: US09-2 I should be able to add and remove fields
    When I click filter and search input box
    And I click add field button
    And I see checkboxes
    Then I should be able to select and deselect fields
  @LUE-1053
  Scenario: US09-3 I should be able to search by specifying the Date
    When I click filter and search input box
    And I click date dropdown menu
    Then I should be able to see selected date on menu
  @LUE-1054  @smoke
  Scenario: US09-4 I should be able to search by selecting single or multiple types
    When I click filter and search input box
    And I click type dropdown and check multiple types
    Then I should be able to see checked types

  @LUE-1055
  Scenario: US09-5 I should be able to save the filter.
    When I click filter and search input box
    And I click type dropdown and check multiple types
    And I click save filter button
    Then I should see my new search filter name on default filters

  @LUE-1056
  Scenario: US09-6 I should be able to restore the default field
    When I click filter and search input box
    And I click Restore default fields button
    Then I should see filters as default type

  @LUE-1057 @smoke
  Scenario: US09-7 I should be able to reset filters to default.
    When I click filter and search input box
    And I click type dropdown and check multiple types
    And I click Reset button
    Then I should not see my selected filters









