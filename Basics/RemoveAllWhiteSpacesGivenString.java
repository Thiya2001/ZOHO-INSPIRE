public class RemoveAllWhiteSpacesGivenString {
    public static void main(String args[]) {
        String s = "  Java   is   easy  ";
        String str = "";

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                str += s.charAt(i);
            }
        }
        System.out.println(str);
    }
}