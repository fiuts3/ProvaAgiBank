Feature: keyword search

  Scenario: Search correct
    Given go to site
    When click button search
    And write in search field
    Then click button and show result
