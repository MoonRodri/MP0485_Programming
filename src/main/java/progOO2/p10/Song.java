package main.java.progOO2.p10;

/**
 * <b>Content</b>  introduction to object-oriented programming, returning a value from a Method
 * <hr/>
 * <br/>
 * <img src="../../../../../javadoc/resources/Song.png">
 */
public class Song {

    private final String name;
    private final int length;

    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.length;
    }
}
