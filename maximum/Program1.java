
class Program1 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 2, 3, 4, 5};
        System.out.println("The maximum element in the array is: " + maximumOnes(arr));
    }

    public static int maximumOnes(int[] arr) {

        int maxi = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 1) {
                    count++;
                    maxi = Math.max(maxi, count);
                } else {
                    count = 0;
                }
            }

        }
        return maxi;// this is not needed as it will return the value of maxi after the loop    ends
    }
}
//Timecomplexity:O(n^2)
//Spacecomplexity:O(1)
