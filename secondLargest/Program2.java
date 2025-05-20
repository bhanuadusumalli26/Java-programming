
class Program2 {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest element is: " + secondLargest);
    }

    static int findSecondLargest(int arr[]) {
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
//timecomplexity:O(n)
//spacecomplexity:O(1)
//output:Second largest element is: 9
