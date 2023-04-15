package numberguessinggame;
import javax.swing.*;

public class NumberGuessingGame {

    //main function
    public static void main(String[] args) {
        //to genertae the Random Number
        int ComputerNumber = (int) (Math.random() * 100 + 1);
        int userAnswer = 0;
        int count = 1;
        int point = 0;
        //loop to run utill conditions is not false

        while (userAnswer != ComputerNumber && count <= 10) {
            //message for the users
            String response = JOptionPane.showInputDialog(null, "Enter a Guess Between 1 and 100: \n     You Have Only 10 Attempts: ", "NUMBER GUESSING GAME", 3);
            //input from users
            userAnswer = Integer.parseInt(response);
            //checking answer
            JOptionPane.showMessageDialog(null, "" + determineGuess(userAnswer, ComputerNumber, count, point));
            count++;
            point++;
        }
    }

    public static String determineGuess(int userAnswer, int ComputerNumber, int count, int point) {
        if (userAnswer <= 0 || userAnswer > 100) {
            return "Your Guess is InValid";
        } else if (userAnswer == ComputerNumber) {
            return "             Correct!\n      Total Guesses: " + count + "\n       Your Score is: " + point;
        } else if (userAnswer > ComputerNumber) {
            return "Your Guess is Too High, Try Again.\nTry Number: " + count;
        } else if (userAnswer < ComputerNumber) {
            return "Your Guess is Too Low, Try Again.\nTry Number: " + count;
        } else {
            return "Your Guess is Incorrect\nTry Number: " + count;
        }
    }
}
