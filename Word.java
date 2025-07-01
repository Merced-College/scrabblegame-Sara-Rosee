// Sara Filipinas
// 6/30/25
// Enhancement Added: Scoring system
// Words earn points based on length:
// - 4 or fewer letters: 2 points
// - 5–6 letters: 4 points
// - 7+ letters: 6 points
// Also added feedback messages based on score.

// This is a class called Word that implements Comparable to allow sorting of two Word objects.

public class Word implements Comparable<Word> {
    private String text; // The actual word stored as a string

    // Constructor: initializes the Word object with the given text
    public Word(String text) {
        this.text = text;
    }

    // Getter method to access the word text
    public String getText() {
        return text;
    }

    // toString method: allows the word to be printed as a string
    @Override
    public String toString() {
        return text;
    }

    // compareTo method: required for sorting and binary search
    // It compares this word to another word alphabetically
    @Override
    public int compareTo(Word other) {
        return this.text.compareTo(other.text);
    }
}
