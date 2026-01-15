package CollectionsFramework;

import java.util.Scanner;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();
        try {
            if(age < 18) {
                throw new Exception("Age must be 18 or above.");
            }
            System.out.println("Age Accepted : " + age);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}
