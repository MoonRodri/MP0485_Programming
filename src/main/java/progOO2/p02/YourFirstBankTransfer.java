package main.java.progOO2.p02;
/**
 * <b>Content</b>  introduction to object-oriented programming
 * <hr/>
 * <br/>
 * <img src="../../../../../javadoc/resources/YourFirstBankTransfer.png">
 */
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthews = new Account("Matthews", 1000.00);

        Account sophie = new Account("Sophie", 0.0);

        matthews.withdrawal(100.00);
        sophie.deposit(100.00);
        
        System.out.println(matthews);
        System.out.println(sophie);
    }
}
