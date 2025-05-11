
class Program3 {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 6, 7, 8, 9};
        int n = 8;
        System.out.println(findMissingNumber(num, n));
    }

    public static int findMissingNumber(int[] num, int n) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 1; i < n - 1; i++) {
            xor2 = xor2 ^ num[i];
            xor1 = xor1 ^ i + 1;
        }
        xor1 = xor1 ^ n;
        return xor1 ^ xor2;
    }
}
//TimeComplexity: O(n)
//SpaceComplexity: O(1)
