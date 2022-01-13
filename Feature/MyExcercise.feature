Feature:  One Way Travel Application
  Scenario: As an user perform shop and sell request for One Way
    Given user login as a "AS" user
    When perform availability request for following data
      | pcc  | origin | destination | departureDate |
      | WD40 | DFW    | LAX         | 30JAN         |
    Then verify response contains following
      | expected_origin | expected_destination | expected_departureDate |
      | DFW             | LAX                  | 30JAN                  |
    And sell the seat with following data
      | num_seats | num_passengers | class_of_service |
      | 1         | 1              | j                |
    Then verify resonse contains following
      | expected_passengers | expected_class_of_service |
      | 1                   | ]                         |

