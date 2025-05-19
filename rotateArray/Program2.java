
class Program2 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = arr.length;
        rotateArray(arr, k);
    }

    static void rotateArray(int[] arr, int k) {
        int first = arr[0];
        for (int i = 0; i < k - 1; i++) {
            arr[i] = arr[i + 1];

        }
        arr[k - 1] = first;
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]);
        }

    }
}
//TimeComplexity: O(n)
//SpaceComplexity: O(1)

