
class Program1 {

    public static void main(String[] args) {
        int[] arr = {7, 4, 8, 2, 9};
        int n = arr.length;
        int count = 1;
        int c = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (arr[i] > arr[j]) {
                    c = 0;
                }

            }
            if (c == 0) {
                count++;
                c = 1;
            }
        }
        System.out.println(count);
    }
}
//timecomplexity O(n^2)
//Approach:Brute force
//Space Complexity:O(1)
