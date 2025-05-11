
class Program1 {

    public static void main(String[] args) {
        int[] num = {1, 3, 4, 5, 6, 7};
        int n = num.length;
        // findMissingNumber(num);
        System.out.println("Missing Number is: " + findMissingNumber(num, n));

    }

    public static int findMissingNumber(int[] num, int n) {
        // n=length.num;

        for (int i = 0; i < n; i++) {

            for (int j = 1; j <= n; j++) {
                if (num[i] != j) {
                    return j;
                }
            }
        }
        return -1;

    }
}
//TimeComplexity: O(n^2)
//spaceComplexity: O(1)
