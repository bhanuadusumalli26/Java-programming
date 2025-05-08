
class Program2 {

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 0, 1, 0, 1, 1};
        System.out.println(maximumOnes(arr));
    }

    public static int maximumOnes(int[] arr) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        return maxCount;
    }
}
