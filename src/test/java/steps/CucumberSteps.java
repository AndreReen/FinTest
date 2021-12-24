package steps;

import data.Currency;
import entity.Card;
import entity.CreditCard;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CucumberSteps {

  static Card testCard;
  static String operationStatus;

  @When("I withdraw {float} amount")
  public static void withdraw(float withdrawAmount) {
    operationStatus = testCard.withdrawCash(withdrawAmount);
  }

  @Then("Card balance should be {float}")
  public static void checkBalance(float balanceExpected) {
    System.out.println("expected balance = " + testCard.getBalance());
    System.out.println("acltual balance = " + testCard.getBalance());
    Assert.assertEquals(balanceExpected, testCard.getBalance(), 0.02);
  }

  @Given("I have debit card currency {string} balance {float}")
  public void iHaveDebitCardCurrencyBalance(String currency, float balance) {
    testCard = new Card(Currency.valueOf(currency), 1, balance);
  }

  @Given("I have credit card balance {float} rate {float}")
  public void iHaveCreditCardCurrencyBalance(float balance, float rate) {
    testCard = new CreditCard(1, balance, rate);
  }

  @Then("Operation status is {string}")
  public void errorMessage(String expectedErrorMessage) {
    System.out.println(operationStatus);
    Assert.assertEquals(expectedErrorMessage, operationStatus);
  }

}
