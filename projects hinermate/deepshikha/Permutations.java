package deepshikha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

    public static void generatePermutations(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result) {
        // Base condition: if the current list has all elements, add it to the result
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Skip used elements or duplicate elements at the same level
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue;
            }

            // Choose the current element
            used[i] = true;
            current.add(nums[i]);

            // Recurse to the next level
            generatePermutations(nums, used, current, result);

            // Backtrack
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Ensure sorted order
        generatePermutations(nums, new boolean[nums.length], new ArrayList<>(), result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> permutations = permuteUnique(nums);

        System.out.println("All unique permutations:");
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
