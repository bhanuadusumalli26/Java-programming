
class Program1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateArray(arr, 5);
    }

    static void rotateArray(int[] arr, int k) {
        int[] temp = new int[k];
        temp[k - 1] = arr[0];
        for (int i = 0; i < k - 1; i++) {
            temp[i] = arr[i + 1];

        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }

    }

}
//Time Complexity: O(n)
//Space Complexity: O(n)
