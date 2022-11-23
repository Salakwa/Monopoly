import java.util.*;
import java.io.*;
public class Main {
    public static final String GAME_ONE_FILE = "GameOne.txt";
    public static final String GAME_TWO_FILE = "GameTwo.txt";
    public static final String GAME_THREE_FILE = "GameThree.txt";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loadChoice = 0;
        while (loadChoice != 3) {
            loadChoice = MenuLogic(scanner, "Welcome to Monopoly!", "Start New Game", "Load Game", "Exit");
        }
        
        //Player Selects Option 1: Start a New Game
        if (loadChoice == 1) {

        }

        //Player Selects Option 2: Load Game
        else if (loadChoice == 2) {

            int fileLoadChoice = 0;
            while (fileLoadChoice != 3) {
                fileLoadChoice = MenuLogic(scanner, "Which Game File would you Like to Load", "Game File 1", "Game File 2", "Game File 3", "Exit");
            }

            if (fileLoadChoice == 1) {
                if (GAME_ONE_FILE.length() == 0) {
                    System.out.println("File is Empty");
                } else {
                    System.out.println("Loaded File 1");
                }
            } else if (fileLoadChoice == 2) {
                if (GAME_TWO_FILE.length() == 0) {
                    System.out.println("File is Empty");
                } else {
                    System.out.println("Loaded File 2");
                }
            } else if (fileLoadChoice == 3) {
                if (GAME_THREE_FILE.length() == 0) {
                    System.out.println("File is Empty");
                } else {
                    System.out.println("Loaded File 3");
                }
            }
        }

        //Player Selects Option 3: Exit and Quit
        else if (loadChoice == 3) {
            System.out.println("Goodbye!");
        }


    }

    private static int MenuLogic(Scanner s, String prompt, String... options) {
        try {
            System.out.println(prompt);
            for (int i = 0; i < options.length; i++) {
                System.out.printf("%d. %s\n", i + 1, options[i]);
            }
            System.out.println("Please select an option:");
            int input = Integer.parseInt(s.nextLine().strip());
            System.out.println();
            return input;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            return MenuLogic(s, prompt, options);
        }
    }

} 