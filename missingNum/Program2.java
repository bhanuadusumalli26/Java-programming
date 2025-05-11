
class Program2 {

    public static void main(String[] args) {
        int[] num = {1, 3, 4, 5, 6};
        int n = 5;
        System.out.println(findMissingNumber(num, n));
    }

    public static int findMissingNumber(int[] num, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += num[i];
        }
        int total = (n + 1) * (n + 2) / 2;
        return total - sum;
    }
}
//time complexity: O(n)
//space complexity: O(1)
