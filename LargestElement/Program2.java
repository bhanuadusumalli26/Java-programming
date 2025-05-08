
import java.util.Arrays;

class Program2 {

    public static void main(String args[]) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Largest element in array is:" + sort(arr1));
    }

    static int sort(int arr1[]) {
        Arrays.sort(arr1);
        return arr1[arr1.length - 1];
    }

}
