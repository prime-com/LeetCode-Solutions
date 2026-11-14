class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int minSum = Integer.MAX_VALUE;

        for (int k = l; k <= r; k++) {

            for (int i = 0; i <= nums.size() - k; i++) {

                int sum = 0;

                for (int j = i; j < i + k; j++) {
                    sum += nums.get(j);
                }

                if (sum > 0 && sum < minSum) {
                    minSum = sum;
                }
            }
        }

        if (minSum == Integer.MAX_VALUE) {
            return -1;
        }

        return minSum;
    }
}