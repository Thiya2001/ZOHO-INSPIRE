import java.util.Scanner;
public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String a = sc.nextLine();

        System.out.print("Enter the Remove character : ");
        char ch = sc.next().charAt(0);

        String rem = "";
        for(int i = 0; i < a.length(); i++) {
            if(Character.toLowerCase(a.charAt(i)) != Character.toLowerCase(ch)) {
                rem += a.charAt(i);
            }
        }
        System.out.println("Output : " + rem);
    }
}