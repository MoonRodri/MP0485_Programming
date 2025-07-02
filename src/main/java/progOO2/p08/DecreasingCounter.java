package main.java.progOO2.p08;

/**
 * <b>Content</b>  introduction to object-oriented programming, changing an instance variable's value in a Method
 * <hr/>
 * <br/>
 * <img src="../../../../../javadoc/resources/DecreasingCounter.png">
 */
public class DecreasingCounter {
    private int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
        if (this.value>0) {
             this.value--;
        }       
    }
    
    public void reset() {
        // write the method implementation here
        // the aim is to reset the value of the counter 
        this.value=0;
    }
}
