
class Program1 {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 4, 1, 2, 1};
        int n = arr.length;
        maxElement(arr, n);
    }

    public static void maxElement(int[] arr, int n) {
        int maxCount = 0;
        int maxElement = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }
        System.out.println(maxElement);// return maxElement;
    }
}
// Time Complexity: O(n^2)
// Auxiliary Space: O(1)
