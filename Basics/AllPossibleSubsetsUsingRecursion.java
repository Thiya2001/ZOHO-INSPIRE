public class AllPossibleSubsetsUsingRecursion {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        isSubset(a, 0, "");
    }
    public static void isSubset(int[] arr, int index, String result) {
        if(index == arr.length) {
            System.out.println(result);
            return;
        }
        isSubset(arr, index + 1, result + arr[index] + " ");
        isSubset(arr, index + 1, result);
    }
}
