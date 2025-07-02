package main.java.progOO1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class P50_PokedexTest {

    private ByteArrayOutputStream outContent;
    private PrintStream originalOut;

    @Before
    public void setUp() {
        P50_Pokedex.erasePokedexInfo();  // clear pokedex
        outContent = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    private String getOutput() {
        return outContent.toString();
    }

    private void clearOutput() {
        outContent.reset();
    }

    // --- Add Pokemon ---

    @Test
    public void testAddPokemonSuccess() {
        P50_Pokedex.addPokemon("Pikachu");
        assertTrue("Expected message to contain 'Added Pikachu'", getOutput().contains("Added Pikachu"));
    }

    @Test
    public void testAddPokemonDuplicate() {
        P50_Pokedex.addPokemon("Pikachu");
        clearOutput();
        P50_Pokedex.addPokemon("Pikachu");
        assertTrue("Expected duplicate warning", getOutput().contains("already exists"));
    }

    @Test
    public void testAddPokemonWhenFull() {
        for (int i = 0; i < 30; i++) {
            P50_Pokedex.addPokemon("Pokemon" + i);
        }
        clearOutput();
        P50_Pokedex.addPokemon("Extra");
        assertTrue("Expected message 'Pokedex is full'", getOutput().contains("Pokedex is full"));
    }

    // --- Add at Position ---

    @Test
    public void testAddPokemonAtValidPosition() {
        P50_Pokedex.addPokemonAtPosition(5, "Eevee");
        assertTrue("Expected message to contain 'Added Eevee to position 5'", getOutput().contains("Added Eevee to position 5"));
    }

    @Test
    public void testAddPokemonAtInvalidPosition() {
        P50_Pokedex.addPokemonAtPosition(-1, "Invalid");
        assertTrue("Expected message to contain 'Invalid position'", getOutput().contains("Invalid position"));
    }

    // --- Delete by Name ---

    @Test
    public void testDeletePokemonFound() {
        P50_Pokedex.addPokemon("Charmander");
        clearOutput();
        P50_Pokedex.deletePokemon("Charmander");
        assertTrue("Expected message 'Deleted Charmander'", getOutput().contains("Deleted Charmander"));
    }

    @Test
    public void testDeletePokemonNotFound() {
        P50_Pokedex.deletePokemon("Missing");
        assertTrue("Expected message 'not found'", getOutput().contains("not found"));
    }

    // --- Delete at Position ---

    @Test
    public void testDeletePokemonAtValidPosition() {
        P50_Pokedex.addPokemonAtPosition(2, "Squirtle");
        clearOutput();
        P50_Pokedex.deletePokemonAtPosition(2);
        assertTrue("Expected message 'Deleted Squirtle'", getOutput().contains("Deleted Squirtle"));
    }

    @Test
    public void testDeletePokemonAtInvalidPosition() {
        P50_Pokedex.deletePokemonAtPosition(2);
        assertTrue("Expected message 'Invalid position'", getOutput().contains("Invalid position"));
    }

    // --- Find Pokemon ---

    @Test
    public void testFindPokemonFound() {
        P50_Pokedex.addPokemon("Jigglypuff");
        clearOutput();
        P50_Pokedex.findPokemon("Jigglypuff");
        assertTrue("Expected message to contain 'found'", getOutput().contains("found"));
    }

    @Test
    public void testFindPokemonNotFound() {
        P50_Pokedex.findPokemon("Missing");
        assertTrue("Expected message to contain 'not found'", getOutput().contains("not found"));
    }

    // --- Show All ---

    @Test
    public void testShowAllPokemon() {
        P50_Pokedex.addPokemon("Bulbasaur");
        P50_Pokedex.addPokemon("Pikachu");
        clearOutput();
        P50_Pokedex.showAllPokemon();
        String output = getOutput();
        assertTrue("Expected output to contain 'Bulbasaur'", output.contains("Bulbasaur"));
        assertTrue("Expected output to contain 'Pikachu'", output.contains("Pikachu"));
    }

    // --- Get at Position ---

    @Test
    public void testGetPokemonAtValidPosition() {
        P50_Pokedex.addPokemonAtPosition(1, "Meowth");
        clearOutput();
        P50_Pokedex.getPokemonAtPosition(1);
        assertTrue("Expected output to contain 'Meowth'", getOutput().contains("Meowth"));
    }

    @Test
    public void testGetPokemonAtInvalidPosition() {
        P50_Pokedex.getPokemonAtPosition(5);
        assertTrue("Expected output to contain 'Invalid position'", getOutput().contains("Invalid position"));
    }

    // --- Count ---

    @Test
    public void testCountPokemon() {
        P50_Pokedex.addPokemon("Psyduck");
        P50_Pokedex.addPokemon("Gengar");
        clearOutput();
        P50_Pokedex.countPokemon();
        assertTrue("Expected count output to contain '2'", getOutput().contains("2"));
    }

    // --- Hack ---

    @Test
    public void testHackPokedex() {
        P50_Pokedex.hackPokedex();
        clearOutput();
        P50_Pokedex.countPokemon();
        assertTrue("Expected count to be 30 after hacking", getOutput().contains("30"));
    }

    // --- Erase ---

    @Test
    public void testErasePokedexInfo() {
        P50_Pokedex.addPokemon("Mewtwo");
        clearOutput();
        P50_Pokedex.erasePokedexInfo();
        assertTrue("Expected message to contain 'erased'", getOutput().contains("erased"));
    }
}
