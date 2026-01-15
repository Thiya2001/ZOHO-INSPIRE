public class FindAllPossiblePermutationsOfGivenString {
    public static void main(String[] args) {
        String a = "ABC";
        permutation(a, "");
    }

    public static void permutation(String str, String result) {
        if(str.length() == 0) {
            System.out.println(result);
            return;
        }
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permutation(remaining, result + ch);
        }
    }
}
