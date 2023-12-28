/**
 *
 * @author CHINTAMANI VINOD KUMAR
 */
import java.util.*;
import java.util.Scanner;


class Game {

    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {

        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    Boolean isCorrectNumber() {

        noOfGuesses++;
        if (inputNumber == number && noOfGuesses < 6) {
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            System.out.println(" ");

            return true;
        } else if (noOfGuesses == 5) {
            System.out.println("No of Attempts is over You lost the Game ");
            return true;
        } else if (inputNumber < number && noOfGuesses < 5) {
            System.out.println("Too low...");
        } else if (inputNumber > number && noOfGuesses < 5) {
            System.out.println("Too high...");
        }

        return false;
    }

}

public class Guess_Game {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("You want to play the game.....If yes press 1 else press 0");
        int count = 0;
        int s = sc.nextInt();
        while (true) {
            while (s == 1) {
                Game g = new Game();
                boolean b = false;
                while (!b) {
                    g.takeUserInput();
                    b = g.isCorrectNumber();

                }
                count++;
                System.out.println("Total no of round played:....  " + count);
                System.out.println("*********************************************************************************************************************************************************");
                System.out.println("You want to play the game.....If yes press 1 else press 0");

                s = sc.nextInt();
            }
            while (s == 0) {
                System.out.println("Thank You See you next Time ");
                System.exit(0);

            }
            while (s != 0 && s != 1) {
                System.out.println("Choose right option");
                s = sc.nextInt();
            }
        }
    }
}