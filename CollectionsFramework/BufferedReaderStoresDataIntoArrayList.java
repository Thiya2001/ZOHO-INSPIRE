package CollectionsFramework;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;  

public class BufferedReaderStoresDataIntoArrayList {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Lines from file : ");
        for (String l : lines) {
            System.out.println(l);
        }
    }
}
