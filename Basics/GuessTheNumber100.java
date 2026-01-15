import java.util.*;
public class GuessTheNumber100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random() * 100 + 1);
        int guess = 0;
        int count = 0;
        System.out.println("Guess the number between 1 - 100");
        while (guess != num) {
            System.out.print("Enter your guess : " );
            guess = sc.nextInt();
            if (guess > num) {
                System.out.println("To High");
            }
            else if(guess < num) {
                System.out.println("To Low");
            }
            count++;
        }
        System.out.println("You guessed number is correct. Totally your guessed number Count is : " + count);
    }
}