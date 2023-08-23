import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=======Welcome To Guessing Game======");

        //greeting message
        System.out.println("What is your name ? ");
        String name = scanner.next();
        System.out.println("Hello " + name);

        //game prompt
        System.out.println("Shall we play a number guessing game ? (yes/no)");
        String y = "yes", n = "no";
        String prompt = scanner.next();

        if (Objects.equals(prompt, y)){
            //random number range is up to +100
            int number = random.nextInt(100);
            System.out.println(number);

            //user guess
            System.out.println("Please Enter a number that you think will be printed (1-100)");
            int userGuess = scanner.nextInt();
            System.out.println(userGuess);

            if (userGuess == number){
                System.out.println("Wow, conguratulations "+name+ ", the number is "+number);
            }else {
                System.out.println("Oops, better luck on your next trial, the number was "+number);
            }

        }else {
            System.out.println("Thank you, see you again");
        }

    }
}
