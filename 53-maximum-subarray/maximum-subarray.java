class Solution {
    public int maxSubArray(int[] arr) {
        int currentsum = arr[0];
int maxsum = arr[0];

for ( int i = 1 ; i < arr.length ; i++) {
   if (currentsum + arr[i] > arr[i] ) {
    currentsum = currentsum + arr[i];
   }
   else {
    currentsum = arr[i];
   }
   if (currentsum > maxsum) {
    maxsum = currentsum;
   }

}
 return maxsum;
    }
}