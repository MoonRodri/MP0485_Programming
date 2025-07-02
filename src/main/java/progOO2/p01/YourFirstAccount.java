package main.java.progOO2.p01;
/**
 * <b>Content</b>  introduction to object-oriented programming
 * <hr/>
 * <br/>
 * <img src="../../../../../javadoc/resources/YourFirstAccount.png">
 */
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account myAccount = new Account("James", 100.00);
        
        myAccount.deposit(20.00);
        myAccount.withdrawal(50.00);
        
        System.out.println(myAccount);
    }
}
