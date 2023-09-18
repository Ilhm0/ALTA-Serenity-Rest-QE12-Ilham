Feature: Post User register
  @Tugas
  Scenario Outline: Post user register with invalid json
    Given Register new account with invalid json "<jsonFile>"
    When Send request post register account user
    Then Status code should be shown 404
    Examples:
      | jsonFile                |
      | DelEmail.json           |
      | DelPassword.json        |
      | DelEmailPassword.json   |
      | EmptyEmail.json         |
      | EmptyPassword.json      |
      | EmptyEmailPassword.json |