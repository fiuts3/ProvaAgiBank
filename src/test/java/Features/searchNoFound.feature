Feature: Not found search

  Scenario: Search Not Found
    Given open website
    When  button search click
    And incorrect search
    Then show no result