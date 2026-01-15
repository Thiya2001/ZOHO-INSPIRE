public class CountTheNumberOfWordsString {
    public static void main(String[] args) {
        String s = "Count the number of words in a String";
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Number of words in the string: " + (count + 1));
    }
}
