
import java.util.Arrays;

class Program1 {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest element is: " + secondLargest);
    }

    static int findSecondLargest(int arr[]) {
        Arrays.sort(arr);

        return arr[arr.length - 2];
    }
}
//Time complexity: O(nlogn)
//Space complexity: O(1)
//Approach: Sorting
