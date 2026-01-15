public class TwoGivenStringsAnagramsOrNot {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if(s1.length() != s2.length()) {
            System.out.println("Not a Anagram");
            return;
        }

        int count = 0;
        for(int i = 0; i < s1.length(); i++) {
            for(int j = 0; j < s2.length(); j++) {
                if(s1.charAt(i) == s2.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        if(count == s1.length()) {
            System.out.println("It is a Anagram");
        }
        else {
            System.out.println("Not a Anagram");
        }
    }
}
