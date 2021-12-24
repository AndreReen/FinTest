@debit
@negative
Feature: debit card

  Scenario Outline:
    Given I have debit card currency "<Currency>" balance <StartingBalance>
    When I withdraw <WithdrawAmount> amount
    Then Card balance should be <ExpectedBalance>
    Examples:
      | Currency | StartingBalance | WithdrawAmount | ExpectedBalance |
      | RUB      | 1000            | -100           | 900             |
      | CHF      | 1000            | 100            | 900             |
      | RUB      | 1000            | a              | 1000            |



