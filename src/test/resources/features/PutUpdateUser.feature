Feature: PutUpdateUser
  @Tugas
  Scenario Outline: Update user with invalid body json and id
    Given Update user with invalid json "<jsonFile>" and id <id>
    When Send request put update user
    Then Status code should be 400

    Examples:
      | jsonFile            | id   |
      | ValidBody.json      | 2322 |
      | EmptyName.json      | 111  |
      | EmptyJob.json       | 4000 |
      | EmptyNameJob.json   | 123  |
      | DelJobBody.json     | 6384 |
      | DelNameBody.json    | 737  |
      | DelNameJobBody.json | 8837 |
