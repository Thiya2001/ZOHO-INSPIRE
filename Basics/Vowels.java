public class Vowels {
    public static void main(String[] args) {
        String[] a = {"aAnt", "Brklmn"};
        for(int i = 0; i < a.length; i++) {
            boolean vow = false;
            for(int j = 0; j < a[i].length(); j++) {
                char ch = a[i].charAt(j);
                if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vow = true;
                    break;
                }
            }
            System.out.println(vow);
        }
    }
}

// public class Vowels {
//     public static void main(String[] args) {
//         String[] a = {"aAnt", "Brklmn"};
//         for(int i = 0; i < a.length; i++) {
//             boolean b = false;
//             for(int j = 0; j < a[i].length(); j++) {
//                 char ch = a[i].charAt(j);
//                 switch (ch) {
//                     case 'A', 'a':
//                     case 'E', 'e':
//                     case 'I', 'i':
//                     case 'O', 'o':
//                     case 'U', 'u':
//                         b = true;
//                         break;
//                     default:
//                         break;
//                 }
//                 if(b) {
//                     break;
//                 }
//             }
//             System.out.println(b);
//         }
//     }
// }