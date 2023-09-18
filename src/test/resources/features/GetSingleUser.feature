Feature: GetSingleUser
  @Tugas
  Scenario Outline: Get single user with exceed parameter
    Given Get single user with exceed parameter <page>
    When Send request get single user
    Then Status code should be 404 Not Found
    And Response body should be null

    Examples:
      | page   |
      | 100    |
      | 688794 |
      | 68349  |

  @Tugas
  Scenario Outline: Get single user with special char parameter
    Given Get single user with special character parameter page "<page>"
    When Send request get single user
    Then Status code should be 404 Not Found
    And Response body should be null
    Examples:
      | page |
      | !    |
      | @    |
      | #    |
      | *    |
      | $    |
      | %    |

  @Tugas
  Scenario Outline: Get single user with empty parameter page
    Given Get single user with empty parameter page "<empty>"
    When Send request get single user
    Then Status code should be 404 Not Found
    And Response body should be null
  Examples:
    | empty | jsonSchema |
    |       |            |



