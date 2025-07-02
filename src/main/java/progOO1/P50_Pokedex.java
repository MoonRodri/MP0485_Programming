package main.java.progOO1;

import java.util.ArrayList;
import java.util.Scanner;

public class P50_Pokedex {

    private static final int MAX_POKEMON = 30;
    private static ArrayList<String> pokemonList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1) Fill Pokedex automatically");
            System.out.println("2) Add Pokemon");
            System.out.println("3) Add Pokemon at position");
            System.out.println("4) Delete Pokemon by name");
            System.out.println("5) Delete Pokemon at position");
            System.out.println("6) Find Pokemon");
            System.out.println("7) Show All Pokemon");
            System.out.println("8) Get Pokemon at position");
            System.out.println("9) Count Pokemon");
            System.out.println("10) Hack Pokedex");
            System.out.println("11) Erase Pokedex info");
            System.out.println("12) Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    fillPokedexAuto();
                    break;
                case 2:
                    System.out.print("Enter the name of the Pokemon: ");
                    addPokemon(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Enter the position: ");
                    int pos = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter the name of the Pokemon: ");
                    addPokemonAtPosition(pos, scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Enter the name of the Pokemon to delete: ");
                    deletePokemon(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Enter the position to delete: ");
                    deletePokemonAtPosition(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.print("Enter the name of the Pokemon to find: ");
                    findPokemon(scanner.nextLine());
                    break;
                case 7:
                    showAllPokemon();
                    break;
                case 8:
                    System.out.print("Enter the position: ");
                    getPokemonAtPosition(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 9:
                    countPokemon();
                    break;
                case 10:
                    hackPokedex();
                    break;
                case 11:
                    erasePokedexInfo();
                    break;
                case 12:
                    System.out.println("Exiting the Pokedex. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    public static void fillPokedexAuto() {
        String[] defaultPokemon = { "Bulbasaur", "Charmander", "Squirtle", "Pikachu", "Jigglypuff" };
        int addedCount = 0;
        for (String p : defaultPokemon) {
            if (!pokemonList.contains(p) && pokemonList.size() < MAX_POKEMON) {
                pokemonList.add(p);
                addedCount++;
            }
        }
        System.out.println("Number of Pokemon added: " + addedCount);
    }

    public static void addPokemon(String name) {
        if (pokemonList.contains(name)) {
            System.out.println("Pokemon " + name + " already exists in the Pokedex. Not added.");
            return;
        }
        if (pokemonList.size() >= MAX_POKEMON) {
            System.out.println("Pokedex is full. Cannot add more Pokemon.");
            return;
        }
        pokemonList.add(name);
        System.out.println("Added " + name + " to the Pokedex.");
    }

    public static void addPokemonAtPosition(int position, String name) {
        if (position < 0 || position >= MAX_POKEMON) {
            System.out.println("Invalid position. Please enter a valid position.");
            return;
        }
        if (pokemonList.contains(name)) {
            System.out.println("Pokemon " + name + " already exists in the Pokedex. Not added.");
            return;
        }
        while (pokemonList.size() <= position) {
            pokemonList.add(null); // fill empty spots if needed
        }
        pokemonList.set(position, name);
        System.out.println("Added " + name + " to position " + position + " in the Pokedex!");
    }

    public static void deletePokemon(String name) {
        if (pokemonList.remove(name)) {
            System.out.println("Deleted " + name + " from the Pokedex!");
        } else {
            System.out.println(name + " not found in the Pokedex.");
        }
    }

    public static void deletePokemonAtPosition(int position) {
        if (position < 0 || position >= pokemonList.size() || pokemonList.get(position) == null) {
            System.out.println("Invalid position or no Pokemon at the specified position.");
            return;
        }
        String removed = pokemonList.remove(position);
        System.out.println("Deleted " + removed + " from position " + position + " in the Pokedex!");
    }

    public static void findPokemon(String name) {
        int pos = pokemonList.indexOf(name);
        if (pos != -1) {
            System.out.println(name + " found in the Pokedex at position " + pos + ".");
        } else {
            System.out.println(name + " not found in the Pokedex.");
        }
    }

    public static void showAllPokemon() {
        for (int i = 0; i < pokemonList.size(); i++) {
            if (pokemonList.get(i) != null) {
                System.out.println("Position " + i + ": " + pokemonList.get(i));
            }
        }
    }

    public static void getPokemonAtPosition(int position) {
        if (position < 0 || position >= pokemonList.size() || pokemonList.get(position) == null) {
            System.out.println("Invalid position or no Pokemon at the specified position.");
            return;
        }
        System.out.println("Pokemon at position " + position + ": " + pokemonList.get(position));
    }

    public static void countPokemon() {
        long count = pokemonList.stream().filter(p -> p != null).count();
        System.out.println("Total Pokemon in the Pokedex: " + count);
    }

    public static void hackPokedex() {
        pokemonList.clear();
        for (int i = 0; i < MAX_POKEMON; i++) {
            pokemonList.add("Ditto");
        }
        System.out.println("Pokedex hacked! All fields filled with Ditto.");
    }

    public static void erasePokedexInfo() {
        pokemonList.clear();
        System.out.println("Pokedex information erased!");
    }
}
