package entity;

import data.Currency;

public class Base {

  int id;
  Currency currency;
  float balance;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public float getBalance() {
    return balance;
  }

  public void setBalance(float balance) {
    this.balance = balance;
  }
}
