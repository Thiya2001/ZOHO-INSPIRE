package CollectionsFramework;
import java.util.List;
import java.util.ArrayList;

public class FindTheNoOfWordsAndLinesInTextFile {
    public static void main(String[] args) {
        String s = "Java is a programming language\nIt is easy to learn\nJava is powerful";
        
        List<String> lines = new ArrayList<String>();
        List<String> words = new ArrayList<String>();

        String lineCount[] = s.split("\n");
        for(String line : lineCount) {
            lines.add(line);
            String wordCount[] = line.split(" ");
            for(String word : wordCount) {
                words.add(word);
            }
        }
        System.out.println("Number Of Lines : " + lines.size());
        System.out.println("Number Of Words : " + words.size());
    }
}
