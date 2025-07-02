package main.java.progOO2.p04;

/**
 * <b>Content</b>  introduction to object-oriented programming, constructor with parameters
 * <hr/>
 * <br/>
 * <img src="../../../../../javadoc/resources/Room.png">
 */
public class Room {	

    // Write your program here
    private String code;
    private int numberOfSeats;

    public Room(String classCode, int numberOfSeats) {
        this.code = classCode;
        this.numberOfSeats = numberOfSeats;
    }

}
