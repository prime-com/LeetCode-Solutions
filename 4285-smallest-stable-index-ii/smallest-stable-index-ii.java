class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int[] rightMin = new int[nums.length];

        rightMin[nums.length - 1] = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < rightMin[i + 1]) {
                rightMin[i] = nums[i];
            }
            else {
                rightMin[i] = rightMin[i + 1];
            }
        }

        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) {
                max = nums[i];
            }

            if (max - rightMin[i] <= k) {
                return i;
            }
        }

        return -1;
    }
}