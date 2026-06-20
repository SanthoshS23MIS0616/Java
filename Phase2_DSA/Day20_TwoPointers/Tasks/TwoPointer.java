/*
Question:
solve pair sum in sorted array, remove duplicates in place, container with most water, 3Sum, and Dutch National Flag in Java? in Java?
*/


import java.util.*;

public class TwoPointer {

  
    public static boolean pairSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int slow = 0;

        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }

        return slow + 1;
    }


    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int maxWater = 0;

        while (left < right) {

            int width = right - left;
            int h = Math.min(height[left], height[right]);

            maxWater = Math.max(maxWater, width * h);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

 
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(
                        Arrays.asList(
                            nums[i],
                            nums[left],
                            nums[right]
                        )
                    );

                    left++;
                    right--;

                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
    public static void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;

            } else if (nums[mid] == 1) {

                mid++;

            } else {

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }

    public static void main(String[] args) {

       
        int[] pairArray = {1, 2, 3, 4, 6};
        System.out.println(
            "Pair Sum Exists: " +
            pairSum(pairArray, 6)
        );

      
        int[] dupArray = {1, 1, 2, 2, 3, 4, 4};

        int length = removeDuplicates(dupArray);

        System.out.print("After Removing Duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(dupArray[i] + " ");
        }
        System.out.println();

        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println(
            "Maximum Water = " +
            maxArea(height)
        );


        int[] threeSumArray = {-1,0,1,2,-1,-4};

        System.out.println(
            "3Sum Triplets = " +
            threeSum(threeSumArray)
        );


        int[] colors = {2,0,2,1,1,0};

        sortColors(colors);

        System.out.println(
            "Sorted Colors = " +
            Arrays.toString(colors)
        );
    }
}
