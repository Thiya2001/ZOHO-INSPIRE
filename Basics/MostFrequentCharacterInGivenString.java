public class MostFrequentCharacterInGivenString {
    public static void main(String[] args) {
        String s = "Programming";
        int c = 0;
        char d = ' ';
        for(int i = 0; i < s.length(); i++) {
            int count = 0;
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if(count > c) {
                c = count;
                d = s.charAt(i);
            }
        }
        System.out.println("Most frequent character : " + d);
        System.out.println(d + " repeated in " + c + " times");
    }
}
