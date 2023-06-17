import java.util.Random;
import javax.swing.JOptionPane;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int maxAttempts = 5; 
        int maxRounds = 3; 
        int score = 0; 
        
        for (int round = 1; round <= maxRounds; round++) {
            
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1; 
        
            boolean guessedCorrectly = false ;
            int numGuesses = 0;
            
            while (!guessedCorrectly && numGuesses < maxAttempts) {
                
                String userInput = JOptionPane.showInputDialog("Round " + round + ": Guess a number between 1 and 100:");
                int userGuess = Integer.parseInt(userInput);
                
            
                if (userGuess == randomNumber) {
                    JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number correctly.");
                    guessedCorrectly = true;
                } else if (userGuess < randomNumber) {
                    JOptionPane.showMessageDialog(null, "Too low! Try a higher number.");
                } else {
                    JOptionPane.showMessageDialog(null, "Too high! Try a lower number.");
                }
                
                numGuesses++;
            }
            
    
            score += maxAttempts - numGuesses;
        }
        
        
        JOptionPane.showMessageDialog(null, "Game over! Your final score is: " + score);
    }
}
