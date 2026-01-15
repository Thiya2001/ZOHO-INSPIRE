package CollectionsFramework;

import java.io.FileReader;
import java.io.BufferedReader;

public class GetUserInputUsingIOClasses {
    public static void main(String[] args) throws Exception {
        String file = "D:\\Java\\Inspire100\\CollectionsFramework\\person.txt";
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line1 = br.readLine();
        System.out.println("Name : " + line1);
        String line2 = br.readLine();
        System.out.println("Age : " + line2);
        String line3 = br.readLine();
        System.out.println("Dept : " + line3);
        br.close();
    }
}
