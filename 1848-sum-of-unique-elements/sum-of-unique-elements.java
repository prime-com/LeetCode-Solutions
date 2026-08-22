class Solution {
    public int sumOfUnique(int[] nums) {
      int totalsum = 0;
      for (int i = 0 ; i < nums.length ; i++) {
        int sum = 0;
        for ( int j = 0 ; j < nums.length ; j++) {
            if (nums[i] == nums[j]) {
            sum++;
            }
        }
        if (sum == 1) {
            totalsum += nums[i];
        }
      }  
      return totalsum;
    }
}