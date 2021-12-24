@credit
@negative
Feature: Credit card negative scenarios

  Scenario Outline:
    Given I have credit card balance <StartingBalance> rate <Rate>
    When I withdraw <WithdrawAmount> amount
    Then Operation status is <ErrorMessage>
    Examples:
      | StartingBalance | Rate | WithdrawAmount | ErrorMessage                         |
      | 1000            | 7.2  | 1100           | "Not enough funds"                   |
      | 1000            | 7.2  | 0.001          | "Minimum amount to withdraw is 0.01" |
      | 1000            | 7.2  | a              | "Enter a valid number"               |



