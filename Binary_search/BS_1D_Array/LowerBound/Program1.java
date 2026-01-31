
class Program1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 9;
        System.out.println(lowerBound(arr, target));
    }

    public static int lowerBound(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= target) {
                return i;
            }
        }
        return -1;
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)
//This is a brute force solution.
//It iterates through the array and checks if the current element is greater than or equal to the target.
