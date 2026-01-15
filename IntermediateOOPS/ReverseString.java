public class ReverseString {
    public static void main(String[] args) {
        String s = "Hello World!";
        System.out.println(revString(s));
    }
    
    public static String revString(String str) {
        String l = "";
        char m[] = str.toCharArray();
        
        for(int i = m.length - 1; i >= 0; i--) {
            l += m[i];
        }
        return l;
    }
}
