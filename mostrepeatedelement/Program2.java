
// import java.Collections.*;
import java.util.HashMap;

class Program2 {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 2, 2, 3, 1, 4, 4, 4};
        int n = arr.length;
        maxElement(arr, n);
    }

    public static void maxElement(int[] arr, int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        int n1 = hm.size();
        int max = 0;
        int maxkey = 0;
        for (int i = 0; i < n1; i++) {
            if (hm.get(arr[i]) > max) {
                max = hm.get(arr[i]);
                maxkey = arr[i];
            }
        }
        System.out.println(maxkey);
    }
}
//TimeComplexity:O(n)
//SpaceComplexity:O(n)
