import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Well Come for Gamers");
        System.out.print(" Hi Gamers \n What is your name : ");
        String name = scanner.next();
        System.out.println();
        System.out.println(" Well come " + name + " for our Game bord");
        System.out.println();

        boolean bool = true;

        while (bool) {

            System.out.println(" Now " + name + " can you play the game \n Are you ready ? \n\n if you want to play the game please select one option \n\t Play Game select : Y \n\t Exit : E");
            System.out.print("Option : - ");
            String choice = scanner.next();

            switch (choice) {
                case "Y":
                    System.out.println("You have 5 chance for guess random number ");

                    Random random = new Random();
                    int number = random.nextInt(20);
                    
                    
                    int guessNumber = 0;
                    for (int i = 1; i < 6; i++) {
                        System.out.print(name + ", please choose your " + i + " option :- ");
                        guessNumber = scanner.nextInt();
                        System.out.println();
                        if (number == guessNumber) {
                            System.out.println(" congratulation " + name + ". You won our game.");
                            i = 6;
                        }
                        if (guessNumber > number) {
                            System.out.println("Your guess number is grater than random number. \n please re-tray");
                        } if(guessNumber < number) {
                            System.out.println("Your guess number is less than random number. \n please re-tray");
                        }
                        System.out.println("");
                    }
                    break;
                case "E":
                    System.out.println(" Good Bye.");
                    bool = false;
                    break;
                default:
                    System.out.println(" Please try one one again \n you are option is incorrect");
            }
        }

    }
}
