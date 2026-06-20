/*
Question:
How can you dry run the Trapping Rain Water problem on the array [0,1,0,2,1,0,1,3,2,1,2,1] and verify the total trapped water?
*/


public class RainwaterDryRun {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int n = height.length;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Fill leftMax array
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Fill rightMax array
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int totalWater = 0;

        System.out.println("Index\tHeight\tLeftMax\tRightMax\tWater");

        for (int i = 0; i < n; i++) {
            int water = Math.min(leftMax[i], rightMax[i]) - height[i];
            totalWater += water;

            System.out.println(
                i + "\t" +
                height[i] + "\t" +
                leftMax[i] + "\t\t" +
                rightMax[i] + "\t\t" +
                water
            );
        }

        System.out.println("\nTotal Trapped Water = " + totalWater);
    }
}
