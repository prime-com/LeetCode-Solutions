class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int smallestLength= nums.length +1;
        int currentWindowSum = 0;
        int left =0;

        for ( int right = 0 ; right < nums.length ; right++) {
            currentWindowSum += nums[right];
            
            while( currentWindowSum >= target) {
                int currentWindow = right - left +1;
                if (currentWindow < smallestLength) {
                smallestLength = currentWindow;
                }
                currentWindowSum -=  nums[left];
                left++;
            }
        }
        if (smallestLength == nums.length + 1) {
            return 0;
            }
        return smallestLength;
    }
}