import java.util.Scanner;
public class LongStringWithoutRepeatChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        String longest = "";

        for(int i = 0; i < s.length(); i++) {
            String temp = "";

            for(int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if(temp.indexOf(ch) != -1) {
                    break;
                }
                temp += ch;
            }
            if(temp.length() > longest.length()) {
                longest = temp;
            }
        }
        System.out.println("Longest Substring without repeating characters: " + longest);
    }
}
