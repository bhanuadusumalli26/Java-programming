
class Program3 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int n = arr.length;
        moveZeros(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void moveZeros(int[] arr, int n) {
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] != 0) {
                arr[i] = arr[j];
                i++;
            }
        }
        while (i < n) {
            arr[i] = 0;
            i++;
        }

    }

}
