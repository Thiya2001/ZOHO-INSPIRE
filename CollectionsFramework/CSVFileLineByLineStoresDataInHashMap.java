package CollectionsFramework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CSVFileLineByLineStoresDataInHashMap {
    public static void main(String[] args) {
        String file = "students.csv";
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            
            String headerLine = br.readLine();
            String headers[] = headerLine.split(",");

            while((line = br.readLine()) != null) {
                String values[] = line.split(",");

                HashMap<String, String> rowMap = new HashMap<>();
                for(int i = 0; i < headers.length; i++) {
                    rowMap.put(headers[i], values[i]);
                }
                System.out.println(rowMap);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
