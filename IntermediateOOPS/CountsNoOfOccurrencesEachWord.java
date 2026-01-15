public class CountsNoOfOccurrencesEachWord {
    public static void main(String[] args) {
        String s[] = {"apple", "banana", "apple", "orange", "banana", "apple"};
        System.out.println(checkCounts(s));
    }
    public static String checkCounts(String[] s) {
        boolean b[] = new boolean[s.length];
        String result = "";
        
        for(int i = 0; i < s.length; i++) {
            if(b[i]) {
                continue;
            }

            int count = 1;
            
            for(int j = i + 1; j < s.length; j++) {
                if(s[i].equals(s[j])) {
                    count++;
                    b[j] = true;
                }
            }
            result = result + s[i] + " : " + count + "\n";
        }
        return result;
    }
}
