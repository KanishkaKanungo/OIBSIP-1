import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class NumberGeneration {
    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    private int number;
    private int randomNumber;
    private int score;

    public NumberGeneration() {
        String s = """
                       NUMBER GUESSING GAME
                       
                Welcome to the Number Guessing Game !!!
                                
                The rules of the game are-
                                
                1. Only 5 attempts will be provided 
                2. If your score after attempts is 5 than you will be given 3 more attempts 
                3. If the score is 4 than 2 extra attempts will be given
                4. If the score is 3 than one extra attempt will be provided 
                5. You have to enter number between 1 to 5 
                                
                So, lets begin playing with numbers !!        
                    """;

        System.out.printf("%s%n".formatted(s));
    }

    public void generate() {
        System.out.println("Enter your desired Number: ");
        this.number = scan.nextInt();
        randomNumber = random.nextInt(1, 5);
    }

    public int check() {
        generate();
        if (number == randomNumber) {
            score++;
            System.out.println("Whoaah !! your number matched :) ");
        } else if (number > randomNumber) {
            System.out.println("Oh-Oh :( the number you entered is greater than the number guessed \n" + " Better luck next time !!");
        } else {
            System.out.println("Oh-Oh :( the number you entered is less than the number guessed \n" + " Better luck next time !!");
        }
        return score;
    }

    public void addRound() {
        System.out.println("*".repeat(15));
        System.out.println("YOUR SCORE IS: " + score);
         switch (score) {
            case 5:
                System.out.println("Well !! Done you will get 3 more attempts");
                for (int i = 1; i <= 3; i++) {
                    check();
                }
            case 4: {
                System.out.println("Well Done !! you will get 2 more attempts");
                for (int i = 1; i <= 2; i++) {
                    check();
                }
            }
            case 3: {
                System.out.println("Well Done !! you will get 1 more attempt");
                check();
            }
            default:
                System.out.println(" Thank you for playing the game :)");
        }

    }
    public void Final(){
        for(int i=1;i<=5;i++){
            check();
        }
        addRound();

    }
}


