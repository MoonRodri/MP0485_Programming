package main.java.progOO2.p09;

/**
 * <b>Content</b>  introduction to object-oriented programming, changing an instance variable's value in a Method
 * <hr/>
 * <br/>
 * <img src="../../../../../javadoc/resources/Debt.png">
 */
public class Debt {

    // write your code here
    private double balance;
    private double interestRate;

    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println(balance);
    }

    public void waitOneYear() {
        balance = balance * interestRate;
    }
}
