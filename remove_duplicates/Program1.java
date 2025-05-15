
import java.util.*;

class Program1 {

    public static void main(String args[]) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 6};
        int n = arr.length;
        int ans = removeDuplicates(arr, n);
        for (int i = 0; i < ans; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicates(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        int i = 0;// coping elements from set to array

        for (int ele : set) {
            arr[i++] = ele;
        }
        return i; // return size of array
    }
}
//Time Complexity: O(n:log: n) + O(n) = O(n:log: n)
//Space Complexity: O(n)
/*In this we use hashing technique to remove duplicate elements from array.*/
// 1 2 2 3 4 4 5 5 6
