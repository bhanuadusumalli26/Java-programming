
class Program3 {

    static void solve(int arr[], int n) {
        int temp = arr[0]; // Store the first element

        // Shift elements left
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = temp; // Place the first element at the last index

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int n = 5;
        int arr[] = {1, 2, 3, 4, 5};
        solve(arr, n);
    }
}
