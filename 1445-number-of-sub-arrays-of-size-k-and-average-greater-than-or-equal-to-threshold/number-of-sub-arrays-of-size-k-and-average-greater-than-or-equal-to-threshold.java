class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int counter = 0;
        int sum = 0;

        for ( int i = 0 ; i < k ; i++) {
            sum += arr[i];
        }
        if (sum/k >= t) {
            counter++;
        }

        for ( int i = k ; i < arr.length ; i++) {
            sum = sum - arr[i-k] + arr[i];

            if( sum/k >= t) {
                counter++;
            }
        }
        return counter;
    }
}