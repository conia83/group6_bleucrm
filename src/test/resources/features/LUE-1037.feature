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

  @LUE-1073
  Scenario: User should be able to upload multiple files at the same time.
    When user clicks on the upload files button
    And user sends 3 files at the same time to Upload files and images section
    And user clicks the send button
    Then all of the uploaded files are seen on the Active Stream

  @LUE-1074
  Scenario: User should be able to upload pictures.
    When user clicks on the upload files button
    And user sends a JPG file to Upload files and images section
    And user clicks the send button
    Then all of the uploaded files are seen on the Active Stream

  @LUE-1075
  Scenario: User should be able to display the uploaded picture itself in Activity Stream.
    When user clicks on the upload files button
    And user sends a JPG file to Upload files and images section
    And user clicks the send button
    Then all of the uploaded files are seen on the Active Stream

  @LUE-1076 @bug
  Scenario:  User should be able to insert the files and images into the text.
    When user inserts a PDF file to text section
    And user inserts a image to text section
    And user clicks the send button
    Then  all of the uploaded files are seen on the Active Stream

  @LUE-1078
  Scenario: User should be able to allow a recipient to edit documents.
    When user clicks on the upload files button
    And user sends a DOC file to Upload files and images section
    Then Allow a recipient to edit documents? checkbox is selected

  @LUE-1079
  Scenario: User should be able to remove files and images at any time before sending.
    When user clicks on the upload files button
    And user sends a DOC file to Upload files and images section
    And user sends a JPG file to Upload files and images section
    And user removes uploaded files and images
    Then removed files and images are not seen

  @LUE-1080
  Scenario: User should be able to rename the file before sending it.
    When user clicks on the upload files button
    And user sends a PDF file to Upload files and images section
    And user clicks the small pencil button right of the uploaded file name
    And user enters a custom name for the file
    Then uploaded file's name is changed