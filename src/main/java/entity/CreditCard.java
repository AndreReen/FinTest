package entity;

import contract.BaseOperationsInt;
import data.Currency;

public class CreditCard extends Card implements BaseOperationsInt {

  float rate;

  public CreditCard(int id, float balance, float rate) {
    super(Currency.RUB, id, balance);
    this.rate = rate;
  }

  @Override
  public String withdrawCash(float withdrawAmount) {
    if (withdrawAmount < 0.01) return "Minimum amount to withdraw is 0.01";
    setBalance(balance - Math.abs(withdrawAmount));
    return "Operation complete";
  }

  public float getRate() {
    return rate;
  }

  public void setRate(float rate) {
    this.rate = rate;
  }
}
