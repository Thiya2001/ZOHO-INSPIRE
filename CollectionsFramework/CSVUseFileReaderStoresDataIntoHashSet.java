package CollectionsFramework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;

public class CSVUseFileReaderStoresDataIntoHashSet {
    public static void main(String[] args) throws Exception {

        HashSet<String> set = new HashSet<>();

        BufferedReader br = new BufferedReader(new FileReader("D:\\Java\\Inspire100\\CollectionsFramework\\student.csv"));
        String line;
        br.readLine();
        while((line = br.readLine()) != null) {
            set.add(line);
        }
        br.close();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name to search : ");
        String name = sc.nextLine();

        boolean found = false;

        for(String s : set) {
            if(s.contains(name)) {
                System.out.println(s);
                found = true;
            }
        }

        if(!found)
            System.out.println("No matching records found.");

        sc.close();
    }
}
