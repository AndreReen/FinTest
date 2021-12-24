package entity;

import contract.BaseOperationsInt;

public class Deposit extends Base implements BaseOperationsInt {

  public void closeDeposit() {
    System.out.println("deposit closed");
  }

  @Override
  public String withdrawCash(float amount) {
    System.out.println("Operation is unavailable for Deposit");
    return "Operation is unavailable for Deposit";
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
