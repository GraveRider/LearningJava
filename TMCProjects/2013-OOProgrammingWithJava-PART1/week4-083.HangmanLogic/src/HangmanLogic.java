import java.util.ArrayList;

public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;


    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
       if (!this.guessedLetters.contains(letter)) {
            if(!this.word.contains(letter)) {
                this.numberOfFaults++;
            }
            this.guessedLetters += letter;

       }
    }

    public String hiddenWord() {
        String hiddenWord = "";
        ArrayList<Character> symbols = new ArrayList<Character>();


        for (int i = 0; i < word.length(); i++) {
            symbols.add(word.charAt(i));
        }
        for (Character c : symbols) {
            if (guessedLetters.indexOf(c) != -1) {
                hiddenWord += c;
            }
            else {
                hiddenWord += "_";
            }
        }
        return hiddenWord;
    }
}
