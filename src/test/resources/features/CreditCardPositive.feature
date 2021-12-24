@credit
@positive
Feature: debit card

  Scenario Outline:
    Given I have credit card balance <StartingBalance> rate <Rate>
    When I withdraw <WithdrawAmount> amount
    And Operation status is "Operation complete"
    Then Card balance should be <ExpectedBalance>
    Examples:
      | StartingBalance | Rate | WithdrawAmount | ExpectedBalance |
      | 1000            | 7.2  | 100            | 900             |
      | 1000            | 7.2  | 1000           | 0               |
      | 1000            | 7.2  | 2000           | -1000               |



