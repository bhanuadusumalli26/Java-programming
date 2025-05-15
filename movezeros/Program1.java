
import java.util.*;

class Program1 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int n = arr.length;
        ArrayList<Integer> temp = new ArrayList<>();
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] != 0) {
                temp.add(arr[idx]);
            }
        }
        int n2 = temp.size();
        for (int idx = 0; idx < n2; idx++) {
            arr[idx] = temp.get(idx);
        }
        for (int idx = 0; idx < n2; idx++) {
            System.out.print(arr[idx] + " ");
        }
    }
}
//Timecomplexity=O(n)
//Spacecomplexity=O(n)
