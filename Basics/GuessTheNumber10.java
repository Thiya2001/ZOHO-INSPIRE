import java.util.Scanner;
public class GuessTheNumber10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = (int)(Math.random() * 10) + 1;
        int guess;
        int count = 0;
        do{
        System.out.print("Guess the number 1 to 10 : ");
        guess = sc.nextInt();
        if(s > guess) {
            System.out.println("To Low.");
        }
        else if(s < guess) {
            System.out.println("To High.");
        }
        count++;
        } while(s != guess);
        System.out.print("You guessed number is correct. Totally your guessed number Count is : " + count);
    }
}
