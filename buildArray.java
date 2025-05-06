public class buildArray {
    public static int[] buildArray(int[] nums) {
        int n = nums.length;

        // First pass: encode new values in the old array
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + n * (nums[nums[i]] % n);
        }

        // Second pass: decode to get the final result
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = buildArray(nums);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}