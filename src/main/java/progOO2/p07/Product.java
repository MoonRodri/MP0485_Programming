package main.java.progOO2.p07;

/**
 * <b>Content</b>  introduction to object-oriented programming, constructor with parameters
 * <hr/>
 * <br/>
 * <img src="../../../../../javadoc/resources/Product.png">
 */
public class Product {
	
    // write your program here
    private double price;
    private int quantity;
    private String name;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    public void printProduct() {
        System.out.println(this.name + ", " + "price " + this.price + ", " + this.quantity + " pcs");
    }

}
