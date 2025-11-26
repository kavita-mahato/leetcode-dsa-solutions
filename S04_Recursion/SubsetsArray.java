import java.util.*;

public class SubsetsArray {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generate(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generate(int[] nums, int pos, List<Integer> current, List<List<Integer>> result) {
        // Base case: reached end of array
        if (pos == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Choice 1: Exclude the current element
        generate(nums, pos + 1, current, result);

        // Choice 2: Include the current element
        current.add(nums[pos]);
        generate(nums, pos + 1, current, result);

        // Backtrack: remove the last added element
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(subsets(arr));
    }
}
