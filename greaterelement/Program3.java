
class Program3 {

    public static void main(String args[]) {
        int[] arr = {7, 4, 8, 2, 9};
        int max = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count++;
                // max = arr[i];
            }
        }
        System.out.println("The number of greater elements is " + count);
    }
}
