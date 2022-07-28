@LUE-1037
Feature: Upload functionality

  US02_As a user, I should be able to upload files and pictures as messages

  Background: user logins and lands on home page
    Given user is on the login page
    And user should login with correct credentials
    And user should land on home page where Active Stream is
    Then user clicks on the Send Message searchbox

  @LUE-1071
  Scenario: User should be able to upload files in different formats.
    When user clicks on the upload files button
    And user sends a DOC file to Upload files and images section
    And user sends a PDF file to Upload files and images section
    And user sends a TXT file to Upload files and images section
    And user clicks the send button
    Then all of the uploaded files are seen on the Active Stream

  @LUE-unnamed
  Scenario: User should be able to upload multiple files at the same time.
    When user clicks on the upload files button
    And user sends 3 files at the same time to Upload files and images section
    And user clicks the send button
    Then all of the uploaded files are seen on the Active Stream



