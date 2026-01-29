
class Program1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int result = binarySearch(arr, target);
        System.out.println(result);
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
//Time complexity: O(log n)
//Space complexity: O(1)
/*Binary search is a search algorithm that finds the position of a target value within a sorted array. 
It compares the target value to the middle element of the array; if they are unequal, 
the half in which the target cannot lie is eliminated and the search continues on the remaining half until it is successful.
 */
