@debit
@positive
Feature: debit card

  Scenario:
    Given I have debit card currency "RUB" balance 1000.70
    When I withdraw 100.20 amount
    And Operation status is "Operation complete"
    Then Card balance should be 900.5

  Scenario Outline:
    Given I have debit card currency "<Currency>" balance <StartingBalance>
    When I withdraw <WithdrawAmount> amount
    And Operation status is "Operation complete"
    Then Card balance should be <ExpectedBalance>

    Examples:
      | Currency | StartingBalance | WithdrawAmount | ExpectedBalance |
      | RUB      | 1000            | 100            | 900             |
      | EUR      | 1000            | 100            | 900             |
      | USD      | 1000            | 100            | 900             |
      | RUB      | 1000            | 0.02           | 999.99          |
      | EUR      | 1000            | 0.02           | 999.99          |
      | USD      | 1000            | 0.02           | 999.99          |
      | RUB      | 1000            | 0              | 1000            |
      | EUR      | 1000            | 0              | 1000            |
      | USD      | 1000            | 0              | 1000            |


