import java.util.Scanner;
public class OddDesEvenAsc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Count of the number : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++) {
            System.out.print("Enter the Number " + (i + 1) + " : ");
            a[i] = sc.nextInt();
        }
        int[] odd;
        int[] even;
        if(n % 2 == 0){
            odd = new int[n / 2];
            even = new int[n / 2];
        }
        else{
            odd = new int[n / 2];
            even = new int[n / 2 + 1];
        }

        int c = 0, d = 0;
        for(int i = 0; i < a.length; i++) {
            if(i % 2 == 0) {
                even[c] = a[i];
                c++;
            }
            else {
                odd[d] = a[i];
                d++;
            }
        }
        for(int i = 0; i < odd.length - 1; i++) {
            for(int j = i + 1; j < odd.length; j++) {
                if(odd[i] > odd[j]) {
                    int temp = odd[i];
                    odd[i] = odd[j];
                    odd[j] = temp;
                }
            }
        }
        for(int i = 0; i < even.length - 1; i++) {
            for(int j = i + 1; j < even.length; j++) {
                if(even[i] < even[j]) {
                    int temp = even[i];
                    even[i] = even[j];
                    even[j] = temp;
                }
            }
        }
        int k = 0, l = 0;
        for(int i = 0; i < a.length; i++){
            if(i % 2 == 0){
                a[i] = even[k];
                k++;
            }
            else{
                a[i] = odd[l];
                l++;
            }
        }
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
