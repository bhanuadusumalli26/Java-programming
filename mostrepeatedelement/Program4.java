
class Program4 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int n = arr.length;
        MajorityElement(arr, n);
    }

    public static void MajorityElement(int[] arr, int n) {
        int ele = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                ele = arr[i];
                count = 1;
            }
            if (ele == arr[i]) {
                count++;
            } else {
                count--;
            }

        }
        System.out.println(ele);
    }
}
//TimeComplexity:O(n)
//SpaceComplexity:O(1)
