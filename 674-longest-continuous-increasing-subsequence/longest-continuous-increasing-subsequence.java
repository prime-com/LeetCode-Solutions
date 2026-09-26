class Solution {
    public int findLengthOfLCIS(int[] arr) {
                int lcis = 1;
        int curr_lcis = 1;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] < arr[i + 1]) {
                curr_lcis++;
            } else {
                curr_lcis = 1;
            }

            if (curr_lcis > lcis) {
                lcis = curr_lcis;
            }
        }

        return lcis;

    }
}