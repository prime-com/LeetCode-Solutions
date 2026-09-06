class Solution {
    public int maxProfit(int[] arr) {
        int maxprofit = 0;
        int init = arr[0];
        
        for ( int i = 1 ; i < arr.length  ; i++) {
            if (init >= arr[i]) {
                init = arr[i];
               
            }
            int currprofit = arr[i] - init;
            if ( currprofit > 0) {
                maxprofit += currprofit;

                init = arr[i];
            }
            
        }
        return maxprofit;
    }
}