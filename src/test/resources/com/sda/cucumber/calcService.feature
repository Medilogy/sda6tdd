Feature: CalcService

  Scenario: Should Add In String And Produce Result
    Given I initialize CalcService
    And I pass text value to compute
    When I execute calculate method
    Then I get correct result

    Scenario: Should return 0 when text is passed
      Given I initialize CalcService
      And I pass null text value
      When I execute calculate method
      Then I get 0 as a result