package CollectionsFramework;

import java.util.HashMap;

public class HashMapSetWordsKeysFrequenciesalues {
    static void countWords(String input, HashMap<String, Integer> map) {
        String words[] = input.split(" ");
        for(String w : words) {
            w = w.toLowerCase();

            if(map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            }
            else {
                map.put(w, 1);
            }
        }
    }
    public static void main(String[] args) {
        String input = "Java is a programming language Java is powerful and Java is easy to learn";
        HashMap<String, Integer> wordMap = new HashMap<>();
        countWords(input, wordMap);
        System.out.println("Word Frequencies : " + wordMap);
    }
}