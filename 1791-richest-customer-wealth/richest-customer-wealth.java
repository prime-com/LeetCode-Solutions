class Solution {
    public int maximumWealth(int[][] arr) {
        int maxSum = 0;
        for ( int i  = 0 ; i <  arr.length ; i++ ) {
            int currSum = 0 ;
            for ( int j = 0 ; j < arr[i].length ; j++) {
                currSum += arr[i][j];
            }
            if (currSum > maxSum ) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }
}