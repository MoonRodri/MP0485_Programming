package main.java.progOO2.p05;

/**
 * <b>Content</b>  introduction to object-oriented programming, constructor with parameters
 * <hr/>
 * <br/>
 * <img src="../../../../../javadoc/resources/Whistle.png">
 */
public class Whistle {
	
    // write your program here
    private String sound;

    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }

    public void sound() {
        System.out.println(this.sound);
    }

}
