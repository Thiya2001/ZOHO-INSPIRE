import java.util.Scanner;
public class GetUserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Greet them by " + s);
    }
}