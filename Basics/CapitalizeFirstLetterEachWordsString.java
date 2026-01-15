public class CapitalizeFirstLetterEachWordsString {
    public static void main(String args[]) {
        String s = "java is easy to learn";
        String res = "";

        res += Character.toUpperCase(s.charAt(0));

        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i - 1) == ' ') {
                res += Character.toUpperCase(s.charAt(i));
            }
            else {
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
