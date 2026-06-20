/*
Question:
How do the two pointers move and how are duplicates skipped when solving the 3Sum problem on a sorted array in Java?
*/

import java.util.Arrays;

public class ThreeSumTrace {

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        Arrays.sort(nums);

        System.out.println("Sorted Array: " + Arrays.toString(nums));
        System.out.println();

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                System.out.println("Skip duplicate at i = " + i +
                                   " (value = " + nums[i] + ")");
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            System.out.println("Fix nums[" + i + "] = " + nums[i]);

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                System.out.println(
                        "left=" + left + " (" + nums[left] + "), " +
                        "right=" + right + " (" + nums[right] + "), " +
                        "sum=" + sum);

                if (sum == 0) {

                    System.out.println("Triplet Found: [" +
                            nums[i] + ", " +
                            nums[left] + ", " +
                            nums[right] + "]");

                    left++;
                    right--;

                    // Skip duplicate left values
                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        System.out.println(
                                "Skip duplicate left at index " + left);
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        System.out.println(
                                "Skip duplicate right at index " + right);
                        right--;
                    }

                } else if (sum < 0) {
                    System.out.println("Sum < 0, move left pointer");
                    left++;
                } else {
                    System.out.println("Sum > 0, move right pointer");
                    right--;
                }
            }

            System.out.println();
        }
    }
}
