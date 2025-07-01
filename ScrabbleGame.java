// Sara Filipinas
// 6/30/25
// Enhancement Added: Scoring system
// Words earn points based on length:
// - 4 or fewer letters: 2 points
// - 5–6 letters: 4 points
// - 7+ letters: 6 points
// Also added feedback messages based on score.

import java.util.*;       
import java.io.*;         

public class ScrabbleGame {
    // An ArrayList to store all the valid words loaded from the file
    private ArrayList<Word> words = new ArrayList<>();

    // Method to load words from the file into the ArrayList
    public void loadWords(String filename) throws IOException {
        // Create a Scanner to read the file line by line
        Scanner fileScanner = new Scanner(new File(filename));
        
        // Read each line, trim whitespace, convert to lowercase, and add as a Word object
        while (fileScanner.hasNextLine()) {
            String word = fileScanner.nextLine().trim().toLowerCase();
            words.add(new Word(word));
        }

        // Sort the list alphabetically so binary search can work correctly
        Collections.sort(words);

        // Close the file scanner after reading all lines
        fileScanner.close();
    }

    // This method runs the main game logic
    public void startGame() {
        Scanner input = new Scanner(System.in); // Scanner to get input from the user
        Random random = new Random(); // Random generator to pick random letters

        // A string of all alphabet letters to choose from
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        // Array to store the 4 random letters
        char[] randomLetters = new char[4];
        
        // Generate 4 random letters and store them in the array
        for (int i = 0; i < 4; i++) {
            randomLetters[i] = alphabet.charAt(random.nextInt(alphabet.length()));
        }

        // Show the user their 4 random letters
        System.out.println("Your letters are: " + Arrays.toString(randomLetters));

        // Ask the user to make a word using the 4 letters
        // Adding a hint based on the point system I created
        System.out.println("(HINT: The longer the word, the more points possible!)");
        System.out.print("Enter a fruit or vegetable that uses at least 1 of these letters: ");
        String userWord = input.nextLine().trim().toLowerCase();

        // Check if the user's word exists in the list using binary search
        boolean isValid = Collections.binarySearch(words, new Word(userWord)) >= 0;

        // Print whether the word is valid or not
        if (isValid) {
            System.out.println("Valid word!");
            // For the additional improvement to the game, I am adding a point system
            int length = userWord.length();
            int points;

            if (length <= 4) {
                points = 2; // 2 point for words of length 4 or less
            } else if (length <= 6) {
                points = 4; // 4 points for words of length 5 or 6
            } else {
                points = 6; // 6 points for words even longer
            }
        
            // Added a display of the points to the user
            System.out.println("You scored " + points + " point" + (points == 1 ? "" : "s") + "!");
            // Added an extra feedback based on score
            if (points == 6) {
                System.out.println("Great job! This is the highest points for guessing a long word!");
            } else if (points == 4) {
                System.out.println("Nice! This is a medium word.");
            } else if (points == 2) {
                System.out.println("Short but sweet, you get the minimum points.");
            } else {
                System.out.println("Try again for points!");
            }

        } else {
            System.out.println("Not a valid word.");
            System.out.println("You scored 0 points.");
        }
        
        // Close the input scanner
        input.close();
    }

    // Main method: the starting point of the program
    public static void main(String[] args) {
        ScrabbleGame game = new ScrabbleGame(); // Create a game object

        try {
            // Load the list of valid words from the file
            game.loadWords("CollinsScrabbleWords_2019.txt");

            // Start the game
            game.startGame();
        } catch (IOException e) {
            // If the file could not be read, print an error message
            System.out.println("Failed to load word list: " + e.getMessage());
        }
    }
}
