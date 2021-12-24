package entity;

import contract.BaseOperationsInt;
import data.Currency;

public class Card extends Base implements BaseOperationsInt {

  public Card(Currency currency, int id, float balance) {
    this.balance = balance;
    this.id = id;
    this.currency = currency;
  }

  @Override
  public String withdrawCash(float withdrawAmount) {
    if (balance < withdrawAmount) return "Not enough funds";
    if (withdrawAmount < 0.01) return "Minimum amount to withdraw is 0.01";

    setBalance(balance - Math.abs(withdrawAmount));
    return "Operation complete";
  }

  @Override
  public String depositCash(float depositAmount) {
    setBalance(balance + depositAmount);
    return "Operation complete";
  }

  @Override
  public String checkBalance() {
    System.out.println(balance);
    return "Operation complete";
  }

}
