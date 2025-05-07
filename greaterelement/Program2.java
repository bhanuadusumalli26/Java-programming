
class Program2 {

    public static void main(String[] args) {
        int[] arr = {7, 4, 8, 2, 9};
        int maxSoFar = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxSoFar) {
                count++;
                maxSoFar = arr[i]; // Update max encountered so far
            }
        }
        System.out.println(count);
    }
}
