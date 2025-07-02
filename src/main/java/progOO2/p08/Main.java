package main.java.progOO2.p08;

public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(4);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.reset();
        counter.printValue();
        
        counter.decrement();
        counter.printValue();
    }
}
