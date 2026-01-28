
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program1 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; // Input array
        int[] input = {1, 2, 3}; // Current permutation
        findNextPermutation(nums, input);
    }

    public static void findNextPermutation(int[] nums, int[] input) {
        // Step 1: Generate all permutations
        List<List<Integer>> permutations = new ArrayList<>();
        generatePermutations(nums, 0, permutations);

        // Step 2: Sort the permutations
        Collections.sort(permutations, (a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });

        // Step 3: Find the next permutation
        List<Integer> inputList = arrayToList(input);
        int index = permutations.indexOf(inputList);

        if (index != -1 && index + 1 < permutations.size()) {
            System.out.println("Next permutation: " + permutations.get(index + 1));
        } else {
            System.out.println("No next permutation exists (it's the last permutation).");
        }
    }

    // Helper function to generate all permutations
    private static void generatePermutations(int[] nums, int start, List<List<Integer>> result) {
        if (start == nums.length) {
            result.add(arrayToList(nums));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            generatePermutations(nums, start + 1, result);
            swap(nums, start, i); // Backtrack
        }
    }

    // Helper function to convert array to List<Integer>
    private static List<Integer> arrayToList(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return list;
    }

    // Helper function to swap two elements in an array
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
