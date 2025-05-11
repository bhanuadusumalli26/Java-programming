
import java.util.Arrays;

class Program3 {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 4, 1, 1, 1, 1, 1};
        int n = arr.length;
        maxElement(arr, n);
    }

    public static void maxElement(int[] arr, int n) {
        int max = arr[0];
        int count = 1;
        int maxcount = 1;
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count > maxcount) {
                    maxcount = count;
                    max = arr[i - 1];
                }
                count = 1;
            }
        }
        if (count > maxcount) {
            maxcount = count;
            max = arr[n - 1];
        }
        System.out.println(max);
    }
}
//TimeComplexity: O(nlogn) because of sorting
//spaceComplexity: O(1)
