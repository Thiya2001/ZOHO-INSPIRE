package CollectionsFramework;

import java.util.Map;
import java.util.TreeMap;

public class CountsNoOfOccurrencesEachWordInFile {
    public static void main(String[] args) {
        String s = "Java is easy\nJava is powerful\nJava is popular";

        Map<String, Integer> words = new TreeMap<>();

        String line[] = s.split("\n");
        for(String a : line) {
            String word[] = a.split(" ");
            for(String b : word) {
                b = b.toLowerCase();

                if(words.containsKey(b)) {
                    words.put(b, words.get(b) + 1);
                }
                else {
                    words.put(b, 1);
                }
            }
        }
        System.out.println(words);
    }
}
