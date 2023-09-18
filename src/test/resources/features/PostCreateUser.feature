Feature: Post Create User
  @Tugas
  Scenario Outline: Post Create User with invalid json
    Given Create user with invald json "<jsonFile>"
    When Send request post create user
    Then Status code should be 404 Bad Request
    And Response body name should be null
    Examples:
      | jsonFile          |
      | EmptyName.json    |
      | EmptyJob.json     |
      | EmptyNameJob.json |
      | DelJobBody.json   |
      | DelNameBody.json  |
      | DelNameBody.json  |
