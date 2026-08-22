class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int max = 0;
        int currentmax = 0;
        for ( int i = 0; i < arr.length ; i++) {
            if ( arr[i] == 1) {
                currentmax++;

            }
            else {
                currentmax = 0;

            }
            if (currentmax > max) {
                max = currentmax;
            }

        }
        return max;
    }
}