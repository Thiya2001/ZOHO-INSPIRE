public class FindNonRepeatedCharacterInString {
    public static void main(String[] args) {
        String s = "apple";

        for(int i = 0; i < s.length(); i++) {
            boolean rep = false;
            for(int j = 0; j < s.length(); j++) {
                if(i != j && s.charAt(i) == s.charAt(j)) {
                    rep = true;
                    break;
                }
            }
            if(!rep) {
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
